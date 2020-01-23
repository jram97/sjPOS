package sv.com.stjacks.sjpos.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Alex Enrique Lemus Guzmán
 */
@Entity
@Table(name = "caja")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Caja.findAll", query = "SELECT c FROM Caja c")
    , @NamedQuery(name = "Caja.findByIdCaja", query = "SELECT c FROM Caja c WHERE c.idCaja = :idCaja")
    , @NamedQuery(name = "Caja.findByNumeroCja", query = "SELECT c FROM Caja c WHERE c.numeroCja = :numeroCja")
    , @NamedQuery(name = "Caja.findByEstadoCja", query = "SELECT c FROM Caja c WHERE c.estadoCja = :estadoCja")})
public class Caja implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_caja")
    private Integer idCaja;
    
    @Basic(optional = false)
    @Column(name = "numero_cja")
    private int numeroCja;
    
    @Basic(optional = false)
    @Column(name = "estado_cja")
    private boolean estadoCja;
    
    @OneToMany(targetEntity=Venta.class, cascade = CascadeType.ALL, mappedBy = "caja")
    private List<Venta> ventaList;
    
    @JoinColumn(name = "id_tienda", referencedColumnName = "id_tienda")
    @ManyToOne(optional = false)
    private Tienda tienda;

    public Caja() {
    }

    public Caja(Integer idCaja) {
        this.idCaja = idCaja;
    }

    public Caja(Integer idCaja, int numeroCja, boolean estadoCja) {
        this.idCaja = idCaja;
        this.numeroCja = numeroCja;
        this.estadoCja = estadoCja;
    }

    public Integer getIdCaja() {
        return idCaja;
    }

    public void setIdCaja(Integer idCaja) {
        this.idCaja = idCaja;
    }

    public int getNumeroCja() {
        return numeroCja;
    }

    public void setNumeroCja(int numeroCja) {
        this.numeroCja = numeroCja;
    }

    public boolean getEstadoCja() {
        return estadoCja;
    }

    public void setEstadoCja(boolean estadoCja) {
        this.estadoCja = estadoCja;
    }

    @XmlTransient
    public List<Venta> getVentaList() {
        return ventaList;
    }

    public void setVentaList(List<Venta> ventaList) {
        this.ventaList = ventaList;
    }

    public Tienda getIdTienda() {
        return tienda;
    }

    public void setIdTienda(Tienda idTienda) {
        this.tienda = idTienda;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCaja != null ? idCaja.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Caja)) {
            return false;
        }
        Caja other = (Caja) object;
        if ((this.idCaja == null && other.idCaja != null) || (this.idCaja != null && !this.idCaja.equals(other.idCaja))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Caja[ idCaja=" + idCaja + " ]";
    }
    
}
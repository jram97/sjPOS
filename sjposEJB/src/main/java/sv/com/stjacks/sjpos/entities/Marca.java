package sv.com.stjacks.sjpos.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Alex Enrique Lemus Guzmán
 */
@Entity
@Table(name = "marca")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Marca.findAll", query = "SELECT m FROM Marca m")
    , @NamedQuery(name = "Marca.findByIdMarca", query = "SELECT m FROM Marca m WHERE m.idMarca = :idMarca")
    , @NamedQuery(name = "Marca.findByNombreMca", query = "SELECT m FROM Marca m WHERE m.nombreMca = :nombreMca")
    , @NamedQuery(name = "Marca.findByEstadoMca", query = "SELECT m FROM Marca m WHERE m.estadoMca = :estadoMca")
    , @NamedQuery(name = "Marca.findByFechaRegistroMca", query = "SELECT m FROM Marca m WHERE m.fechaRegistroMca = :fechaRegistroMca")})
public class Marca implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_marca")
    private Integer idMarca;
    
    @Basic(optional = false)
    @Column(name = "nombre_mca")
    private String nombreMca;
    
    @Basic(optional = false)
    @Column(name = "estado_mca")
    private boolean estadoMca;
    
    @Basic(optional = false)
    @Column(name = "fecha_registro_mca")
    @Temporal(TemporalType.DATE)
    private Date fechaRegistroMca;
    
    @OneToMany(targetEntity=Articulo.class, cascade = CascadeType.ALL, mappedBy = "Marca")
    private List<Articulo> articuloList;

    public Marca() {
    }

    public Marca(Integer idMarca) {
        this.idMarca = idMarca;
    }

    public Marca(Integer idMarca, String nombreMca, boolean estadoMca, Date fechaRegistroMca) {
        this.idMarca = idMarca;
        this.nombreMca = nombreMca;
        this.estadoMca = estadoMca;
        this.fechaRegistroMca = fechaRegistroMca;
    }

    public Integer getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(Integer idMarca) {
        this.idMarca = idMarca;
    }

    public String getNombreMca() {
        return nombreMca;
    }

    public void setNombreMca(String nombreMca) {
        this.nombreMca = nombreMca;
    }

    public boolean getEstadoMca() {
        return estadoMca;
    }

    public void setEstadoMca(boolean estadoMca) {
        this.estadoMca = estadoMca;
    }

    public Date getFechaRegistroMca() {
        return fechaRegistroMca;
    }

    public void setFechaRegistroMca(Date fechaRegistroMca) {
        this.fechaRegistroMca = fechaRegistroMca;
    }

    @XmlTransient
    public List<Articulo> getArticuloList() {
        return articuloList;
    }

    public void setArticuloList(List<Articulo> articuloList) {
        this.articuloList = articuloList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMarca != null ? idMarca.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Marca)) {
            return false;
        }
        Marca other = (Marca) object;
        if ((this.idMarca == null && other.idMarca != null) || (this.idMarca != null && !this.idMarca.equals(other.idMarca))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Marca[ idMarca=" + idMarca + " ]";
    }
    
}
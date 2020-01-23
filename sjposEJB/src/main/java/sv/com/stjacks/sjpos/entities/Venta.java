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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "venta")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Venta.findAll", query = "SELECT v FROM Venta v")
    , @NamedQuery(name = "Venta.findByIdVenta", query = "SELECT v FROM Venta v WHERE v.idVenta = :idVenta")
    , @NamedQuery(name = "Venta.findByFechaVta", query = "SELECT v FROM Venta v WHERE v.fechaVta = :fechaVta")
    , @NamedQuery(name = "Venta.findByEstadoVta", query = "SELECT v FROM Venta v WHERE v.estadoVta = :estadoVta")
    , @NamedQuery(name = "Venta.findByMontoVta", query = "SELECT v FROM Venta v WHERE v.montoVta = :montoVta")})
public class Venta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_venta")
    private Integer idVenta;
    
    @Basic(optional = false)
    @Column(name = "fecha_vta")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaVta;
    
    @Basic(optional = false)
    @Column(name = "estado_vta")
    private boolean estadoVta;
    
    @Basic(optional = false)
    @Column(name = "monto_vta")
    private double montoVta;
    
    @OneToMany(targetEntity=ProductoVenta.class, cascade = CascadeType.ALL, mappedBy = "venta")
    private List<ProductoVenta> productoVentaList;
    
    @OneToMany(targetEntity=PromocionVenta.class, cascade = CascadeType.ALL, mappedBy = "venta")
    private List<PromocionVenta> promocionVentaList;
    
    @OneToMany(targetEntity=Cambio.class, cascade = CascadeType.ALL, mappedBy = "venta")
    private List<Cambio> cambioList;
    
    @JoinColumn(name = "id_caja", referencedColumnName = "id_caja")
    @ManyToOne(optional = false)
    private Caja caja;
    
    @JoinColumn(name = "id_cliente", referencedColumnName = "id_cliente")
    @ManyToOne(optional = false)
    private Cliente cliente;
    
    @JoinColumn(name = "id_forma_pago", referencedColumnName = "id_forma_pago")
    @ManyToOne(optional = false)
    private FormaPago formaPago;
    
    @JoinColumn(name = "id_tipo_documento", referencedColumnName = "id_tipo_documento")
    @ManyToOne(optional = false)
    private TipoDocumento tipoDocumento;
    
    @JoinColumn(name = "id_tipo_venta", referencedColumnName = "id_tipo_venta")
    @ManyToOne(optional = false)
    private TipoVenta tipoVenta;
    
    @Column(name = "id_usuario")
    private int usuario;

    public Venta() {
    }

    public Venta(Integer idVenta) {
        this.idVenta = idVenta;
    }

    public Venta(Integer idVenta, Date fechaVta, boolean estadoVta, double montoVta) {
        this.idVenta = idVenta;
        this.fechaVta = fechaVta;
        this.estadoVta = estadoVta;
        this.montoVta = montoVta;
    }

    public Integer getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(Integer idVenta) {
        this.idVenta = idVenta;
    }

    public Date getFechaVta() {
        return fechaVta;
    }

    public void setFechaVta(Date fechaVta) {
        this.fechaVta = fechaVta;
    }

    public boolean getEstadoVta() {
        return estadoVta;
    }

    public void setEstadoVta(boolean estadoVta) {
        this.estadoVta = estadoVta;
    }

    public double getMontoVta() {
        return montoVta;
    }

    public void setMontoVta(double montoVta) {
        this.montoVta = montoVta;
    }

    @XmlTransient
    public List<ProductoVenta> getProductoVentaList() {
        return productoVentaList;
    }

    public void setProductoVentaList(List<ProductoVenta> productoVentaList) {
        this.productoVentaList = productoVentaList;
    }

    @XmlTransient
    public List<PromocionVenta> getPromocionVentaList() {
        return promocionVentaList;
    }

    public void setPromocionVentaList(List<PromocionVenta> promocionVentaList) {
        this.promocionVentaList = promocionVentaList;
    }

    @XmlTransient
    public List<Cambio> getCambioList() {
        return cambioList;
    }

    public void setCambioList(List<Cambio> cambioList) {
        this.cambioList = cambioList;
    }

    public Caja getIdCaja() {
        return caja;
    }

    public void setIdCaja(Caja idCaja) {
        this.caja = idCaja;
    }

    public Cliente getIdCliente() {
        return cliente;
    }

    public void setIdCliente(Cliente idCliente) {
        this.cliente = idCliente;
    }

    public FormaPago getIdFormaPago() {
        return formaPago;
    }

    public void setIdFormaPago(FormaPago idFormaPago) {
        this.formaPago = idFormaPago;
    }

    public TipoDocumento getIdTipoDocumento() {
        return tipoDocumento;
    }

    public void setIdTipoDocumento(TipoDocumento idTipoDocumento) {
        this.tipoDocumento = idTipoDocumento;
    }

    public TipoVenta getIdTipoVenta() {
        return tipoVenta;
    }

    public void setIdTipoVenta(TipoVenta idTipoVenta) {
        this.tipoVenta = idTipoVenta;
    }

    public int getIdUsuario() {
        return usuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.usuario = idUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idVenta != null ? idVenta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Venta)) {
            return false;
        }
        Venta other = (Venta) object;
        if ((this.idVenta == null && other.idVenta != null) || (this.idVenta != null && !this.idVenta.equals(other.idVenta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Venta[ idVenta=" + idVenta + " ]";
    }
    
}
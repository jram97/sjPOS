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
@Table(name = "producto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Producto.findAll", query = "SELECT p FROM Producto p")
    , @NamedQuery(name = "Producto.findBySkuProd", query = "SELECT p FROM Producto p WHERE p.skuProd = :skuProd")
    , @NamedQuery(name = "Producto.findByEstadoProd", query = "SELECT p FROM Producto p WHERE p.estadoProd = :estadoProd")
    , @NamedQuery(name = "Producto.findByFechaRegistroProd", query = "SELECT p FROM Producto p WHERE p.fechaRegistroProd = :fechaRegistroProd")
    , @NamedQuery(name = "Producto.findByIdProducto", query = "SELECT p FROM Producto p WHERE p.idProducto = :idProducto")
    , @NamedQuery(name = "Producto.findByBarcodeProd", query = "SELECT p FROM Producto p WHERE p.barcodeProd = :barcodeProd")
    , @NamedQuery(name = "Producto.findByUsuarioGeneraProd", query = "SELECT p FROM Producto p WHERE p.usuarioGeneraProd = :usuarioGeneraProd")
    , @NamedQuery(name = "Producto.findByPrecioBaseProd", query = "SELECT p FROM Producto p WHERE p.precioBaseProd = :precioBaseProd")})
public class Producto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_producto")
    private Integer idProducto;

    @Basic(optional = false)
    @Column(name = "sku_prod")
    private String skuProd;

    @Basic(optional = false)
    @Column(name = "estado_prod")
    private boolean estadoProd;

    @Basic(optional = false)
    @Column(name = "fecha_registro_prod")
    @Temporal(TemporalType.DATE)
    private Date fechaRegistroProd;

    @Basic(optional = false)
    @Column(name = "barcode_prod")
    private String barcodeProd;
    
    @Basic(optional = false)
    @Column(name = "usuario_genera_prod")
    private int usuarioGeneraProd;
    
    @Basic(optional = false)
    @Column(name = "precio_base_prod")
    private double precioBaseProd;
    
    @JoinColumn(name = "id_articulo", referencedColumnName = "id_articulo")
    @ManyToOne(optional = false)
    private Articulo articulo;
    
    @JoinColumn(name = "id_talla", referencedColumnName = "id_talla")
    @ManyToOne(optional = true)
    private Talla talla;
    
    @OneToMany(targetEntity=ProductoTransferencia.class, cascade = CascadeType.ALL, mappedBy = "Producto")
    private List<ProductoTransferencia> productoTransferenciaList;
    
    @OneToMany(targetEntity=ProductoPedido.class, cascade = CascadeType.ALL, mappedBy = "Producto")
    private List<ProductoPedido> productoPedidoList;
    
    @OneToMany(targetEntity=ProductoIngreso.class, cascade = CascadeType.ALL, mappedBy = "Producto")
    private List<ProductoIngreso> productoIngresoList;
    
    @OneToMany(targetEntity=ProductoTienda.class, cascade = CascadeType.ALL, mappedBy = "Producto")
    private List<ProductoTienda> productoTiendaList;

    public Producto() {
    }

    public Producto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public Producto(Integer idProducto, String skuProd, boolean estadoProd, Date fechaRegistroProd, String barcodeProd, int usuarioGeneraProd, double precioBaseProd) {
        this.idProducto = idProducto;
        this.skuProd = skuProd;
        this.estadoProd = estadoProd;
        this.fechaRegistroProd = fechaRegistroProd;
        this.barcodeProd = barcodeProd;
        this.usuarioGeneraProd = usuarioGeneraProd;
        this.precioBaseProd = precioBaseProd;
    }

    public String getSkuProd() {
        return skuProd;
    }

    public void setSkuProd(String skuProd) {
        this.skuProd = skuProd;
    }

    public boolean getEstadoProd() {
        return estadoProd;
    }

    public void setEstadoProd(boolean estadoProd) {
        this.estadoProd = estadoProd;
    }

    public Date getFechaRegistroProd() {
        return fechaRegistroProd;
    }

    public void setFechaRegistroProd(Date fechaRegistroProd) {
        this.fechaRegistroProd = fechaRegistroProd;
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public String getBarcodeProd() {
        return barcodeProd;
    }

    public void setBarcodeProd(String barcodeProd) {
        this.barcodeProd = barcodeProd;
    }

    public int getUsuarioGeneraProd() {
        return usuarioGeneraProd;
    }

    public void setUsuarioGeneraProd(int usuarioGeneraProd) {
        this.usuarioGeneraProd = usuarioGeneraProd;
    }

    public double getPrecioBaseProd() {
        return precioBaseProd;
    }

    public void setPrecioBaseProd(double precioBaseProd) {
        this.precioBaseProd = precioBaseProd;
    }

    public Articulo getIdArticulo() {
        return articulo;
    }

    public void setIdArticulo(Articulo idArticulo) {
        this.articulo = idArticulo;
    }

    public Talla getIdTalla() {
        return talla;
    }

    public void setIdTalla(Talla idTalla) {
        this.talla = idTalla;
    }

    @XmlTransient
    public List<ProductoTransferencia> getProductoTransferenciaList() {
        return productoTransferenciaList;
    }

    public void setProductoTransferenciaList(List<ProductoTransferencia> productoTransferenciaList) {
        this.productoTransferenciaList = productoTransferenciaList;
    }

    @XmlTransient
    public List<ProductoPedido> getProductoPedidoList() {
        return productoPedidoList;
    }

    public void setProductoPedidoList(List<ProductoPedido> productoPedidoList) {
        this.productoPedidoList = productoPedidoList;
    }

    @XmlTransient
    public List<ProductoIngreso> getProductoIngresoList() {
        return productoIngresoList;
    }

    public void setProductoIngresoList(List<ProductoIngreso> productoIngresoList) {
        this.productoIngresoList = productoIngresoList;
    }

    @XmlTransient
    public List<ProductoTienda> getProductoTiendaList() {
        return productoTiendaList;
    }

    public void setProductoTiendaList(List<ProductoTienda> productoTiendaList) {
        this.productoTiendaList = productoTiendaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProducto != null ? idProducto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Producto)) {
            return false;
        }
        Producto other = (Producto) object;
        if ((this.idProducto == null && other.idProducto != null) || (this.idProducto != null && !this.idProducto.equals(other.idProducto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Producto[ idProducto=" + idProducto + " ]";
    }

}
package sv.com.stjacks.sjpos.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import sv.com.stjacks.sjpos.entities.Producto;

/**
 *
 * @author jramirez
 */
@Entity
@Table(name = "producto_transferencia")
@NamedQueries({
    @NamedQuery(name = "ProductoTransferencia.findAll", query = "SELECT p FROM ProductoTransferencia p")
    , @NamedQuery(name = "ProductoTransferencia.findByIdProductoTransferencia", query = "SELECT p FROM ProductoTransferencia p WHERE p.idProductoTransferencia = :idProductoTransferencia")
    , @NamedQuery(name = "ProductoTransferencia.findByCantidadProdTrf", query = "SELECT p FROM ProductoTransferencia p WHERE p.cantidadProdTrf = :cantidadProdTrf")})
public class ProductoTransferencia implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto_transferencia")
    private Integer idProductoTransferencia;

    @Column(name = "cantidad_prod_trf")
    private int cantidadProdTrf;

    @JoinColumn(name = "id_producto", referencedColumnName = "id_producto")
    @ManyToOne(optional = false)
    private Producto idProducto;

    @JoinColumn(name = "id_transferencia", referencedColumnName = "id_transferencia")
    @ManyToOne(optional = false)
    private Transferencia idTransferencia;

    public ProductoTransferencia() {
    }

    public ProductoTransferencia(Integer idProductoTransferencia) {
        this.idProductoTransferencia = idProductoTransferencia;
    }

    public ProductoTransferencia(Integer idProductoTransferencia, int cantidadProdTrf) {
        this.idProductoTransferencia = idProductoTransferencia;
        this.cantidadProdTrf = cantidadProdTrf;
    }

    public Integer getIdProductoTransferencia() {
        return idProductoTransferencia;
    }

    public void setIdProductoTransferencia(Integer idProductoTransferencia) {
        this.idProductoTransferencia = idProductoTransferencia;
    }

    public int getCantidadProdTrf() {
        return cantidadProdTrf;
    }

    public void setCantidadProdTrf(int cantidadProdTrf) {
        this.cantidadProdTrf = cantidadProdTrf;
    }

    public Producto getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Producto idProducto) {
        this.idProducto = idProducto;
    }

    public Transferencia getIdTransferencia() {
        return idTransferencia;
    }

    public void setIdTransferencia(Transferencia idTransferencia) {
        this.idTransferencia = idTransferencia;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProductoTransferencia != null ? idProductoTransferencia.hashCode() : 0);
        return hash;
    }
    
}

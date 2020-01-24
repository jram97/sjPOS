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
import sv.com.stjacks.sjpos.entities.ProductoTienda;

/**
 *
 * @author jramirez
 */
@Entity
@Table(name = "producto_cambio")
@NamedQueries({
    @NamedQuery(name = "ProductoCambio.findAll", query = "SELECT p FROM ProductoCambio p")
    , @NamedQuery(name = "ProductoCambio.findByIdProductoCambio", query = "SELECT p FROM ProductoCambio p WHERE p.idProductoCambio = :idProductoCambio")})
public class ProductoCambio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto_cambio")
    private Integer idProductoCambio;

    @JoinColumn(name = "id_cambio", referencedColumnName = "id_cambio")
    @ManyToOne(optional = false)
    private Cambio idCambio;

    @JoinColumn(name = "id_producto_tienda", referencedColumnName = "id_producto_tienda")
    @ManyToOne(optional = false)
    private ProductoTienda idProductoTienda;

    @JoinColumn(name = "id_producto_venta", referencedColumnName = "id_producto_venta")
    @ManyToOne(optional = false)
    private ProductoVenta idProductoVenta;

    @JoinColumn(name = "id_tipo_cambio", referencedColumnName = "id_tipo_cambio")
    @ManyToOne(optional = false)
    private TipoCambio idTipoCambio;

    public ProductoCambio() {
    }

    public ProductoCambio(Integer idProductoCambio) {
        this.idProductoCambio = idProductoCambio;
    }

    public Integer getIdProductoCambio() {
        return idProductoCambio;
    }

    public void setIdProductoCambio(Integer idProductoCambio) {
        this.idProductoCambio = idProductoCambio;
    }

    public Cambio getIdCambio() {
        return idCambio;
    }

    public void setIdCambio(Cambio idCambio) {
        this.idCambio = idCambio;
    }

    public ProductoTienda getIdProductoTienda() {
        return idProductoTienda;
    }

    public void setIdProductoTienda(ProductoTienda idProductoTienda) {
        this.idProductoTienda = idProductoTienda;
    }

    public ProductoVenta getIdProductoVenta() {
        return idProductoVenta;
    }

    public void setIdProductoVenta(ProductoVenta idProductoVenta) {
        this.idProductoVenta = idProductoVenta;
    }

    public TipoCambio getIdTipoCambio() {
        return idTipoCambio;
    }

    public void setIdTipoCambio(TipoCambio idTipoCambio) {
        this.idTipoCambio = idTipoCambio;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProductoCambio != null ? idProductoCambio.hashCode() : 0);
        return hash;
    }    
}

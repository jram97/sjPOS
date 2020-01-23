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
@Table(name = "producto_promocion")
@NamedQueries({
    @NamedQuery(name = "ProductoPromocion.findAll", query = "SELECT p FROM ProductoPromocion p")
    , @NamedQuery(name = "ProductoPromocion.findByIdProductoPromocion", query = "SELECT p FROM ProductoPromocion p WHERE p.idProductoPromocion = :idProductoPromocion")
    , @NamedQuery(name = "ProductoPromocion.findByEstado", query = "SELECT p FROM ProductoPromocion p WHERE p.estado = :estado")})
public class ProductoPromocion implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto_promocion")
    private Integer idProductoPromocion;

    @Column(name = "estado")
    private boolean estado;

    @JoinColumn(name = "id_producto_tienda", referencedColumnName = "id_producto_tienda")
    @ManyToOne(optional = false)
    private ProductoTienda idProductoTienda;

    @JoinColumn(name = "id_promocion", referencedColumnName = "id_promocion")
    @ManyToOne(optional = false)
    private Promocion idPromocion;

    public ProductoPromocion() {
    }

    public ProductoPromocion(Integer idProductoPromocion) {
        this.idProductoPromocion = idProductoPromocion;
    }

    public ProductoPromocion(Integer idProductoPromocion, boolean estado) {
        this.idProductoPromocion = idProductoPromocion;
        this.estado = estado;
    }

    public Integer getIdProductoPromocion() {
        return idProductoPromocion;
    }

    public void setIdProductoPromocion(Integer idProductoPromocion) {
        this.idProductoPromocion = idProductoPromocion;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public ProductoTienda getIdProductoTienda() {
        return idProductoTienda;
    }

    public void setIdProductoTienda(ProductoTienda idProductoTienda) {
        this.idProductoTienda = idProductoTienda;
    }

    public Promocion getIdPromocion() {
        return idPromocion;
    }

    public void setIdPromocion(Promocion idPromocion) {
        this.idPromocion = idPromocion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProductoPromocion != null ? idProductoPromocion.hashCode() : 0);
        return hash;
    }
}

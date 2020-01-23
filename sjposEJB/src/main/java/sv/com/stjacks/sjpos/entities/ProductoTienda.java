package sv.com.stjacks.sjpos.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * @author Javier Ramirez
 * The persistent class for the producto_tienda database table.
 * 
 */
@Entity
@Table(name = "producto_tienda")
@NamedQueries({
    @NamedQuery(name = "ProductoTienda.findAll", query = "SELECT p FROM ProductoTienda p")
    , @NamedQuery(name = "ProductoTienda.findByIdProductoTienda", query = "SELECT p FROM ProductoTienda p WHERE p.idProductoTienda = :idProductoTienda")
    , @NamedQuery(name = "ProductoTienda.findByCantidadProdTda", query = "SELECT p FROM ProductoTienda p WHERE p.cantidadProdTda = :cantidadProdTda")
    , @NamedQuery(name = "ProductoTienda.findByPrecioUnitarioProdTda", query = "SELECT p FROM ProductoTienda p WHERE p.precioUnitarioProdTda = :precioUnitarioProdTda")})
public class ProductoTienda implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto_tienda")
    private Integer idProductoTienda;

    @Column(name = "cantidad_prod_tda")
    private int cantidadProdTda;

    @Column(name = "precio_unitario_prod_tda")
    private double precioUnitarioProdTda;
    
    @JoinColumn(name = "id_producto", referencedColumnName = "id_producto")
    @ManyToOne(optional = false)
    private Producto idProducto;
    
    @JoinColumn(name = "id_tienda", referencedColumnName = "id_tienda")
    @ManyToOne(optional = false)
    private Tienda idTienda;

    public ProductoTienda() {
    }

    public ProductoTienda(Integer idProductoTienda) {
        this.idProductoTienda = idProductoTienda;
    }

    public ProductoTienda(Integer idProductoTienda, int cantidadProdTda, double precioUnitarioProdTda) {
        this.idProductoTienda = idProductoTienda;
        this.cantidadProdTda = cantidadProdTda;
        this.precioUnitarioProdTda = precioUnitarioProdTda;
    }

    public Integer getIdProductoTienda() {
        return idProductoTienda;
    }

    public void setIdProductoTienda(Integer idProductoTienda) {
        this.idProductoTienda = idProductoTienda;
    }

    public int getCantidadProdTda() {
        return cantidadProdTda;
    }

    public void setCantidadProdTda(int cantidadProdTda) {
        this.cantidadProdTda = cantidadProdTda;
    }

    public double getPrecioUnitarioProdTda() {
        return precioUnitarioProdTda;
    }

    public void setPrecioUnitarioProdTda(double precioUnitarioProdTda) {
        this.precioUnitarioProdTda = precioUnitarioProdTda;
    }

    public Producto getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Producto idProducto) {
        this.idProducto = idProducto;
    }

    public Tienda getIdTienda() {
        return idTienda;
    }

    public void setIdTienda(Tienda idTienda) {
        this.idTienda = idTienda;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProductoTienda != null ? idProductoTienda.hashCode() : 0);
        return hash;
    }    
}

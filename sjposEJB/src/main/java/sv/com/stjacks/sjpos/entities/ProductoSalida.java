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
@Table(name = "producto_salida")
@NamedQueries({
    @NamedQuery(name = "ProductoSalida.findAll", query = "SELECT p FROM ProductoSalida p")
    , @NamedQuery(name = "ProductoSalida.findByIdProductoSalida", query = "SELECT p FROM ProductoSalida p WHERE p.idProductoSalida = :idProductoSalida")
    , @NamedQuery(name = "ProductoSalida.findByCantidadProdSal", query = "SELECT p FROM ProductoSalida p WHERE p.cantidadProdSal = :cantidadProdSal")})
public class ProductoSalida implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto_salida")
    private Integer idProductoSalida;

    @Column(name = "cantidad_prod_sal")
    private int cantidadProdSal;

    @JoinColumn(name = "id_producto_tienda", referencedColumnName = "id_producto_tienda")
    @ManyToOne(optional = false)
    private ProductoTienda idProductoTienda;

    @JoinColumn(name = "id_salida", referencedColumnName = "id_salida")
    @ManyToOne(optional = false)
    private Salida idSalida;

    public ProductoSalida() {
    }

    public ProductoSalida(Integer idProductoSalida) {
        this.idProductoSalida = idProductoSalida;
    }

    public ProductoSalida(Integer idProductoSalida, int cantidadProdSal) {
        this.idProductoSalida = idProductoSalida;
        this.cantidadProdSal = cantidadProdSal;
    }

    public Integer getIdProductoSalida() {
        return idProductoSalida;
    }

    public void setIdProductoSalida(Integer idProductoSalida) {
        this.idProductoSalida = idProductoSalida;
    }

    public int getCantidadProdSal() {
        return cantidadProdSal;
    }

    public void setCantidadProdSal(int cantidadProdSal) {
        this.cantidadProdSal = cantidadProdSal;
    }

    public ProductoTienda getIdProductoTienda() {
        return idProductoTienda;
    }

    public void setIdProductoTienda(ProductoTienda idProductoTienda) {
        this.idProductoTienda = idProductoTienda;
    }

    public Salida getIdSalida() {
        return idSalida;
    }

    public void setIdSalida(Salida idSalida) {
        this.idSalida = idSalida;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProductoSalida != null ? idProductoSalida.hashCode() : 0);
        return hash;
    }

}

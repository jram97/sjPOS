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
@Table(name = "producto_ingreso")
@NamedQueries({
    @NamedQuery(name = "ProductoIngreso.findAll", query = "SELECT p FROM ProductoIngreso p")
    , @NamedQuery(name = "ProductoIngreso.findByIdProductoIngreso", query = "SELECT p FROM ProductoIngreso p WHERE p.idProductoIngreso = :idProductoIngreso")
    , @NamedQuery(name = "ProductoIngreso.findByCantidadProdIngr", query = "SELECT p FROM ProductoIngreso p WHERE p.cantidadProdIngr = :cantidadProdIngr")
    , @NamedQuery(name = "ProductoIngreso.findByCostoUnitarioProdIngr", query = "SELECT p FROM ProductoIngreso p WHERE p.costoUnitarioProdIngr = :costoUnitarioProdIngr")})
public class ProductoIngreso implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto_ingreso")
    private Integer idProductoIngreso;

    @Column(name = "cantidad_prod_ingr")
    private int cantidadProdIngr;

    @Column(name = "costo_unitario_prod_ingr")
    private double costoUnitarioProdIngr;

    @JoinColumn(name = "id_ingreso", referencedColumnName = "id_ingreso")
    @ManyToOne(optional = false)
    private Ingreso idIngreso;

    @JoinColumn(name = "id_producto", referencedColumnName = "id_producto")
    @ManyToOne(optional = false)
    private Producto idProducto;

    public ProductoIngreso() {
    }

    public ProductoIngreso(Integer idProductoIngreso) {
        this.idProductoIngreso = idProductoIngreso;
    }

    public ProductoIngreso(Integer idProductoIngreso, int cantidadProdIngr, double costoUnitarioProdIngr) {
        this.idProductoIngreso = idProductoIngreso;
        this.cantidadProdIngr = cantidadProdIngr;
        this.costoUnitarioProdIngr = costoUnitarioProdIngr;
    }

    public Integer getIdProductoIngreso() {
        return idProductoIngreso;
    }

    public void setIdProductoIngreso(Integer idProductoIngreso) {
        this.idProductoIngreso = idProductoIngreso;
    }

    public int getCantidadProdIngr() {
        return cantidadProdIngr;
    }

    public void setCantidadProdIngr(int cantidadProdIngr) {
        this.cantidadProdIngr = cantidadProdIngr;
    }

    public double getCostoUnitarioProdIngr() {
        return costoUnitarioProdIngr;
    }

    public void setCostoUnitarioProdIngr(double costoUnitarioProdIngr) {
        this.costoUnitarioProdIngr = costoUnitarioProdIngr;
    }

    public Ingreso getIdIngreso() {
        return idIngreso;
    }

    public void setIdIngreso(Ingreso idIngreso) {
        this.idIngreso = idIngreso;
    }

    public Producto getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Producto idProducto) {
        this.idProducto = idProducto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProductoIngreso != null ? idProductoIngreso.hashCode() : 0);
        return hash;
    }
    
}

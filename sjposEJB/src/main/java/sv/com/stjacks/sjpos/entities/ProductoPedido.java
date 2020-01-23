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
@Table(name = "producto_pedido")
@NamedQueries({
    @NamedQuery(name = "ProductoPedido.findAll", query = "SELECT p FROM ProductoPedido p")
    , @NamedQuery(name = "ProductoPedido.findByIdProductoPedido", query = "SELECT p FROM ProductoPedido p WHERE p.idProductoPedido = :idProductoPedido")
    , @NamedQuery(name = "ProductoPedido.findByCantidadProdPed", query = "SELECT p FROM ProductoPedido p WHERE p.cantidadProdPed = :cantidadProdPed")
    , @NamedQuery(name = "ProductoPedido.findByCostoUnitarioPed", query = "SELECT p FROM ProductoPedido p WHERE p.costoUnitarioPed = :costoUnitarioPed")})
public class ProductoPedido implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto_pedido")
    private Integer idProductoPedido;

    @Column(name = "cantidad_prod_ped")
    private short cantidadProdPed;

    @Column(name = "costo_unitario_ped")
    private double costoUnitarioPed;

    @JoinColumn(name = "id_pedido", referencedColumnName = "id_pedido")
    @ManyToOne(optional = false)
    private Pedido idPedido;

    @JoinColumn(name = "id_producto", referencedColumnName = "id_producto")
    @ManyToOne(optional = false)
    private Producto idProducto;

    public ProductoPedido() {
    }

    public ProductoPedido(Integer idProductoPedido) {
        this.idProductoPedido = idProductoPedido;
    }

    public ProductoPedido(Integer idProductoPedido, short cantidadProdPed, double costoUnitarioPed) {
        this.idProductoPedido = idProductoPedido;
        this.cantidadProdPed = cantidadProdPed;
        this.costoUnitarioPed = costoUnitarioPed;
    }

    public Integer getIdProductoPedido() {
        return idProductoPedido;
    }

    public void setIdProductoPedido(Integer idProductoPedido) {
        this.idProductoPedido = idProductoPedido;
    }

    public short getCantidadProdPed() {
        return cantidadProdPed;
    }

    public void setCantidadProdPed(short cantidadProdPed) {
        this.cantidadProdPed = cantidadProdPed;
    }

    public double getCostoUnitarioPed() {
        return costoUnitarioPed;
    }

    public void setCostoUnitarioPed(double costoUnitarioPed) {
        this.costoUnitarioPed = costoUnitarioPed;
    }

    public Pedido getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Pedido idPedido) {
        this.idPedido = idPedido;
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
        hash += (idProductoPedido != null ? idProductoPedido.hashCode() : 0);
        return hash;
    }

}

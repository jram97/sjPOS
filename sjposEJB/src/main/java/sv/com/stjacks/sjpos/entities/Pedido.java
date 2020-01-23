package sv.com.stjacks.sjpos.entities;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import sv.com.stjacks.sjpos.entities.Tienda;

/**
 *
 * @author Javier Ramírez
 */
@Entity
@Table(name = "pedido")
@NamedQueries({
    @NamedQuery(name = "Pedido.findAll", query = "SELECT p FROM Pedido p")
    , @NamedQuery(name = "Pedido.findByIdPedido", query = "SELECT p FROM Pedido p WHERE p.idPedido = :idPedido")
    , @NamedQuery(name = "Pedido.findByFechaPed", query = "SELECT p FROM Pedido p WHERE p.fechaPed = :fechaPed")
    , @NamedQuery(name = "Pedido.findByEstadoPed", query = "SELECT p FROM Pedido p WHERE p.estadoPed = :estadoPed")
    , @NamedQuery(name = "Pedido.findByComentarioPed", query = "SELECT p FROM Pedido p WHERE p.comentarioPed = :comentarioPed")
    , @NamedQuery(name = "Pedido.findByUsuarioGeneradoPed", query = "SELECT p FROM Pedido p WHERE p.usuarioGeneradoPed = :usuarioGeneradoPed")})
public class Pedido implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pedido")
    private Integer idPedido;

    @Column(name = "fecha_ped")
    @Temporal(TemporalType.DATE)
    private Date fechaPed;

    @Column(name = "estado_ped")
    private boolean estadoPed;

    @Column(name = "comentario_ped")
    private String comentarioPed;

    @Column(name = "usuario_generado_ped")
    private int usuarioGeneradoPed;

    @JoinColumn(name = "id_proveedor", referencedColumnName = "id_proveedor")
    @ManyToOne(optional = false)
    private Proveedor idProveedor;

    @JoinColumn(name = "id_tienda", referencedColumnName = "id_tienda")
    @ManyToOne(optional = false)
    private Tienda idTienda;

    public Pedido() {
    }

    public Pedido(Integer idPedido) {
        this.idPedido = idPedido;
    }

    public Pedido(Integer idPedido, Date fechaPed, boolean estadoPed, int usuarioGeneradoPed) {
        this.idPedido = idPedido;
        this.fechaPed = fechaPed;
        this.estadoPed = estadoPed;
        this.usuarioGeneradoPed = usuarioGeneradoPed;
    }

    public Integer getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Integer idPedido) {
        this.idPedido = idPedido;
    }

    public Date getFechaPed() {
        return fechaPed;
    }

    public void setFechaPed(Date fechaPed) {
        this.fechaPed = fechaPed;
    }

    public boolean getEstadoPed() {
        return estadoPed;
    }

    public void setEstadoPed(boolean estadoPed) {
        this.estadoPed = estadoPed;
    }

    public String getComentarioPed() {
        return comentarioPed;
    }

    public void setComentarioPed(String comentarioPed) {
        this.comentarioPed = comentarioPed;
    }

    public int getUsuarioGeneradoPed() {
        return usuarioGeneradoPed;
    }

    public void setUsuarioGeneradoPed(int usuarioGeneradoPed) {
        this.usuarioGeneradoPed = usuarioGeneradoPed;
    }

    public Proveedor getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(Proveedor idProveedor) {
        this.idProveedor = idProveedor;
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
        hash += (idPedido != null ? idPedido.hashCode() : 0);
        return hash;
    }
}

package sv.com.stjacks.sjpos.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author jramirez
 */
@Entity
@Table(name = "proveedor")
@NamedQueries({
    @NamedQuery(name = "Proveedor.findAll", query = "SELECT p FROM Proveedor p")
    , @NamedQuery(name = "Proveedor.findByIdProveedor", query = "SELECT p FROM Proveedor p WHERE p.idProveedor = :idProveedor")
    , @NamedQuery(name = "Proveedor.findByNombreProv", query = "SELECT p FROM Proveedor p WHERE p.nombreProv = :nombreProv")
    , @NamedQuery(name = "Proveedor.findByTelefonoProv", query = "SELECT p FROM Proveedor p WHERE p.telefonoProv = :telefonoProv")
    , @NamedQuery(name = "Proveedor.findByDireccionProv", query = "SELECT p FROM Proveedor p WHERE p.direccionProv = :direccionProv")
    , @NamedQuery(name = "Proveedor.findByEmailProv", query = "SELECT p FROM Proveedor p WHERE p.emailProv = :emailProv")
    , @NamedQuery(name = "Proveedor.findByEstadoProv", query = "SELECT p FROM Proveedor p WHERE p.estadoProv = :estadoProv")})
public class Proveedor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_proveedor")
    private Integer idProveedor;

    @Column(name = "nombre_prov")
    private String nombreProv;

    @Column(name = "telefono_prov")
    private String telefonoProv;

    @Column(name = "direccion_prov")
    private String direccionProv;

    @Column(name = "email_prov")
    private String emailProv;

    @Column(name = "estado_prov")
    private boolean estadoProv;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idProveedor")
    private List<Pedido> pedidoList;

    public Proveedor() {
    }

    public Proveedor(Integer idProveedor) {
        this.idProveedor = idProveedor;
    }

    public Proveedor(Integer idProveedor, String nombreProv, String telefonoProv, String direccionProv, String emailProv, boolean estadoProv) {
        this.idProveedor = idProveedor;
        this.nombreProv = nombreProv;
        this.telefonoProv = telefonoProv;
        this.direccionProv = direccionProv;
        this.emailProv = emailProv;
        this.estadoProv = estadoProv;
    }

    public Integer getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(Integer idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getNombreProv() {
        return nombreProv;
    }

    public void setNombreProv(String nombreProv) {
        this.nombreProv = nombreProv;
    }

    public String getTelefonoProv() {
        return telefonoProv;
    }

    public void setTelefonoProv(String telefonoProv) {
        this.telefonoProv = telefonoProv;
    }

    public String getDireccionProv() {
        return direccionProv;
    }

    public void setDireccionProv(String direccionProv) {
        this.direccionProv = direccionProv;
    }

    public String getEmailProv() {
        return emailProv;
    }

    public void setEmailProv(String emailProv) {
        this.emailProv = emailProv;
    }

    public boolean getEstadoProv() {
        return estadoProv;
    }

    public void setEstadoProv(boolean estadoProv) {
        this.estadoProv = estadoProv;
    }

    public List<Pedido> getPedidoList() {
        return pedidoList;
    }

    public void setPedidoList(List<Pedido> pedidoList) {
        this.pedidoList = pedidoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProveedor != null ? idProveedor.hashCode() : 0);
        return hash;
    }

}

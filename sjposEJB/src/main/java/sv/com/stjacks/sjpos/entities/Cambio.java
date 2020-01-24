package sv.com.stjacks.sjpos.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
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

/**
 *
 * @author jramirez
 */
@Entity
@Table(name = "cambio")
@NamedQueries({
    @NamedQuery(name = "Cambio.findAll", query = "SELECT c FROM Cambio c")
    , @NamedQuery(name = "Cambio.findByIdCambio", query = "SELECT c FROM Cambio c WHERE c.idCambio = :idCambio")
    , @NamedQuery(name = "Cambio.findByIdUsuario", query = "SELECT c FROM Cambio c WHERE c.idUsuario = :idUsuario")
    , @NamedQuery(name = "Cambio.findByIdTipoCambio", query = "SELECT c FROM Cambio c WHERE c.idTipoCambio = :idTipoCambio")
    , @NamedQuery(name = "Cambio.findByFechaCmb", query = "SELECT c FROM Cambio c WHERE c.fechaCmb = :fechaCmb")
    , @NamedQuery(name = "Cambio.findByComentarioCmb", query = "SELECT c FROM Cambio c WHERE c.comentarioCmb = :comentarioCmb")})
public class Cambio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cambio")
    private Integer idCambio;

    @Column(name = "id_usuario")
    private int idUsuario;

    @Column(name = "id_tipo_cambio")
    private int idTipoCambio;

    @Column(name = "fecha_cmb")
    @Temporal(TemporalType.DATE)
    private Date fechaCmb;

    @Column(name = "comentario_cmb")
    private String comentarioCmb;

    @JoinColumn(name = "id_venta", referencedColumnName = "id_venta")
    @ManyToOne(optional = false)
    private Venta idVenta;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCambio")
    private List<ProductoCambio> productoCambioList;

    public Cambio() {
    }

    public Cambio(Integer idCambio) {
        this.idCambio = idCambio;
    }

    public Cambio(Integer idCambio, int idUsuario, int idTipoCambio, Date fechaCmb, String comentarioCmb) {
        this.idCambio = idCambio;
        this.idUsuario = idUsuario;
        this.idTipoCambio = idTipoCambio;
        this.fechaCmb = fechaCmb;
        this.comentarioCmb = comentarioCmb;
    }

    public Integer getIdCambio() {
        return idCambio;
    }

    public void setIdCambio(Integer idCambio) {
        this.idCambio = idCambio;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdTipoCambio() {
        return idTipoCambio;
    }

    public void setIdTipoCambio(int idTipoCambio) {
        this.idTipoCambio = idTipoCambio;
    }

    public Date getFechaCmb() {
        return fechaCmb;
    }

    public void setFechaCmb(Date fechaCmb) {
        this.fechaCmb = fechaCmb;
    }

    public String getComentarioCmb() {
        return comentarioCmb;
    }

    public void setComentarioCmb(String comentarioCmb) {
        this.comentarioCmb = comentarioCmb;
    }

    public Venta getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(Venta idVenta) {
        this.idVenta = idVenta;
    }

    public List<ProductoCambio> getProductoCambioList() {
        return productoCambioList;
    }

    public void setProductoCambioList(List<ProductoCambio> productoCambioList) {
        this.productoCambioList = productoCambioList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCambio != null ? idCambio.hashCode() : 0);
        return hash;
    } 
}

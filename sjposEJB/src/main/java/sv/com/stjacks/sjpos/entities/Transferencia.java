package sv.com.sjacks.sjpos.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import sv.com.sjacks.sjPOSEJB.Entity.Tienda;

/**
 *
 * @author Javier Ramírez
 */
@Entity
@Table(name = "transferencia")
@NamedQueries({
    @NamedQuery(name = "Transferencia.findAll", query = "SELECT t FROM Transferencia t")
    , @NamedQuery(name = "Transferencia.findByIdTransferencia", query = "SELECT t FROM Transferencia t WHERE t.idTransferencia = :idTransferencia")
    , @NamedQuery(name = "Transferencia.findByFechaTrf", query = "SELECT t FROM Transferencia t WHERE t.fechaTrf = :fechaTrf")
    , @NamedQuery(name = "Transferencia.findByEstadoTrf", query = "SELECT t FROM Transferencia t WHERE t.estadoTrf = :estadoTrf")
    , @NamedQuery(name = "Transferencia.findByComentarioTrf", query = "SELECT t FROM Transferencia t WHERE t.comentarioTrf = :comentarioTrf")
    , @NamedQuery(name = "Transferencia.findByUsuarioGeneradaTrf", query = "SELECT t FROM Transferencia t WHERE t.usuarioGeneradaTrf = :usuarioGeneradaTrf")
    , @NamedQuery(name = "Transferencia.findByUsuarioAceptaTrf", query = "SELECT t FROM Transferencia t WHERE t.usuarioAceptaTrf = :usuarioAceptaTrf")})
public class Transferencia implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_transferencia")
    private Integer idTransferencia;

    @Column(name = "fecha_trf")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaTrf;

    @Column(name = "estado_trf")
    private boolean estadoTrf;

    @Column(name = "comentario_trf")
    private String comentarioTrf;

    @Column(name = "usuario_generada_trf")
    private int usuarioGeneradaTrf;

    @Column(name = "usuario_acepta_trf")
    private int usuarioAceptaTrf;

    @JoinColumn(name = "id_tienda_origen_trf", referencedColumnName = "id_tienda")
    @ManyToOne(optional = false)
    private Tienda idTiendaOrigenTrf;

    @JoinColumn(name = "id_tienda_destino_trf", referencedColumnName = "id_tienda")
    @ManyToOne(optional = false)
    private Tienda idTiendaDestinoTrf;

    public Transferencia() {
    }

    public Transferencia(Integer idTransferencia) {
        this.idTransferencia = idTransferencia;
    }

    public Transferencia(Integer idTransferencia, Date fechaTrf, boolean estadoTrf, int usuarioGeneradaTrf, int usuarioAceptaTrf) {
        this.idTransferencia = idTransferencia;
        this.fechaTrf = fechaTrf;
        this.estadoTrf = estadoTrf;
        this.usuarioGeneradaTrf = usuarioGeneradaTrf;
        this.usuarioAceptaTrf = usuarioAceptaTrf;
    }

    public Integer getIdTransferencia() {
        return idTransferencia;
    }

    public void setIdTransferencia(Integer idTransferencia) {
        this.idTransferencia = idTransferencia;
    }

    public Date getFechaTrf() {
        return fechaTrf;
    }

    public void setFechaTrf(Date fechaTrf) {
        this.fechaTrf = fechaTrf;
    }

    public boolean getEstadoTrf() {
        return estadoTrf;
    }

    public void setEstadoTrf(boolean estadoTrf) {
        this.estadoTrf = estadoTrf;
    }

    public String getComentarioTrf() {
        return comentarioTrf;
    }

    public void setComentarioTrf(String comentarioTrf) {
        this.comentarioTrf = comentarioTrf;
    }

    public int getUsuarioGeneradaTrf() {
        return usuarioGeneradaTrf;
    }

    public void setUsuarioGeneradaTrf(int usuarioGeneradaTrf) {
        this.usuarioGeneradaTrf = usuarioGeneradaTrf;
    }

    public int getUsuarioAceptaTrf() {
        return usuarioAceptaTrf;
    }

    public void setUsuarioAceptaTrf(int usuarioAceptaTrf) {
        this.usuarioAceptaTrf = usuarioAceptaTrf;
    }

    public Tienda getIdTiendaOrigenTrf() {
        return idTiendaOrigenTrf;
    }

    public void setIdTiendaOrigenTrf(Tienda idTiendaOrigenTrf) {
        this.idTiendaOrigenTrf = idTiendaOrigenTrf;
    }

    public Tienda getIdTiendaDestinoTrf() {
        return idTiendaDestinoTrf;
    }

    public void setIdTiendaDestinoTrf(Tienda idTiendaDestinoTrf) {
        this.idTiendaDestinoTrf = idTiendaDestinoTrf;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTransferencia != null ? idTransferencia.hashCode() : 0);
        return hash;
    }
    
}

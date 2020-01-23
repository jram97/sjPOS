package sv.com.stjacks.sjpos.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author jramirez
 */
@Entity
@Table(name = "registro_promocion")
@NamedQueries({
    @NamedQuery(name = "RegistroPromocion.findAll", query = "SELECT r FROM RegistroPromocion r")
    , @NamedQuery(name = "RegistroPromocion.findByIdRegistroPromocion", query = "SELECT r FROM RegistroPromocion r WHERE r.idRegistroPromocion = :idRegistroPromocion")
    , @NamedQuery(name = "RegistroPromocion.findByEstadoRegProm", query = "SELECT r FROM RegistroPromocion r WHERE r.estadoRegProm = :estadoRegProm")
    , @NamedQuery(name = "RegistroPromocion.findByComentarioRegProm", query = "SELECT r FROM RegistroPromocion r WHERE r.comentarioRegProm = :comentarioRegProm")
    , @NamedQuery(name = "RegistroPromocion.findByRegistroRegProm", query = "SELECT r FROM RegistroPromocion r WHERE r.registroRegProm = :registroRegProm")
    , @NamedQuery(name = "RegistroPromocion.findByFechaCreacionRegProm", query = "SELECT r FROM RegistroPromocion r WHERE r.fechaCreacionRegProm = :fechaCreacionRegProm")
    , @NamedQuery(name = "RegistroPromocion.findByUsuarioRegistroRegProm", query = "SELECT r FROM RegistroPromocion r WHERE r.usuarioRegistroRegProm = :usuarioRegistroRegProm")})
public class RegistroPromocion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id_registro_promocion")
    private Integer idRegistroPromocion;

    @Column(name = "estado_reg_prom")
    private boolean estadoRegProm;

    @Column(name = "comentario_reg_prom")
    private String comentarioRegProm;

    @Column(name = "registro_reg_prom")
    private int registroRegProm;

    @Column(name = "fecha_creacion_reg_prom")
    @Temporal(TemporalType.DATE)
    private Date fechaCreacionRegProm;

    @Column(name = "usuario_registro_reg_prom")
    private int usuarioRegistroRegProm;
    
    @JoinColumn(name = "id_criterio", referencedColumnName = "id_criterio")
    @ManyToOne(optional = false)
    private Criterio idCriterio;
    
    @JoinColumn(name = "id_promocion", referencedColumnName = "id_promocion")
    @ManyToOne(optional = false)
    private Promocion idPromocion;

    public RegistroPromocion() {
    }

    public RegistroPromocion(Integer idRegistroPromocion) {
        this.idRegistroPromocion = idRegistroPromocion;
    }

    public RegistroPromocion(Integer idRegistroPromocion, boolean estadoRegProm, int registroRegProm, Date fechaCreacionRegProm, int usuarioRegistroRegProm) {
        this.idRegistroPromocion = idRegistroPromocion;
        this.estadoRegProm = estadoRegProm;
        this.registroRegProm = registroRegProm;
        this.fechaCreacionRegProm = fechaCreacionRegProm;
        this.usuarioRegistroRegProm = usuarioRegistroRegProm;
    }

    public Integer getIdRegistroPromocion() {
        return idRegistroPromocion;
    }

    public void setIdRegistroPromocion(Integer idRegistroPromocion) {
        this.idRegistroPromocion = idRegistroPromocion;
    }

    public boolean getEstadoRegProm() {
        return estadoRegProm;
    }

    public void setEstadoRegProm(boolean estadoRegProm) {
        this.estadoRegProm = estadoRegProm;
    }

    public String getComentarioRegProm() {
        return comentarioRegProm;
    }

    public void setComentarioRegProm(String comentarioRegProm) {
        this.comentarioRegProm = comentarioRegProm;
    }

    public int getRegistroRegProm() {
        return registroRegProm;
    }

    public void setRegistroRegProm(int registroRegProm) {
        this.registroRegProm = registroRegProm;
    }

    public Date getFechaCreacionRegProm() {
        return fechaCreacionRegProm;
    }

    public void setFechaCreacionRegProm(Date fechaCreacionRegProm) {
        this.fechaCreacionRegProm = fechaCreacionRegProm;
    }

    public int getUsuarioRegistroRegProm() {
        return usuarioRegistroRegProm;
    }

    public void setUsuarioRegistroRegProm(int usuarioRegistroRegProm) {
        this.usuarioRegistroRegProm = usuarioRegistroRegProm;
    }

    public Criterio getIdCriterio() {
        return idCriterio;
    }

    public void setIdCriterio(Criterio idCriterio) {
        this.idCriterio = idCriterio;
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
        hash += (idRegistroPromocion != null ? idRegistroPromocion.hashCode() : 0);
        return hash;
    }    
}

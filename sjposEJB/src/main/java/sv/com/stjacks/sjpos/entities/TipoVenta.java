package sv.com.stjacks.sjpos.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * @author Javier Ramirez
 * The persistent class for the tipo_venta database table.
 * 
 */
@Entity
@Table(name = "tipo_venta")
@NamedQueries({
    @NamedQuery(name = "TipoVenta.findAll", query = "SELECT t FROM TipoVenta t")
    , @NamedQuery(name = "TipoVenta.findByIdTipoVenta", query = "SELECT t FROM TipoVenta t WHERE t.idTipoVenta = :idTipoVenta")
    , @NamedQuery(name = "TipoVenta.findByDescripcionTpoVta", query = "SELECT t FROM TipoVenta t WHERE t.descripcionTpoVta = :descripcionTpoVta")
    , @NamedQuery(name = "TipoVenta.findByEstadoTpoVta", query = "SELECT t FROM TipoVenta t WHERE t.estadoTpoVta = :estadoTpoVta")})
public class TipoVenta implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tipo_venta")
    private Integer idTipoVenta;

    @Column(name = "descripcion_tpo_vta")
    private String descripcionTpoVta;

    @Column(name = "estado_tpo_vta")
    private boolean estadoTpoVta;

    public TipoVenta() {
    }

    public TipoVenta(Integer idTipoVenta) {
        this.idTipoVenta = idTipoVenta;
    }

    public TipoVenta(Integer idTipoVenta, String descripcionTpoVta, boolean estadoTpoVta) {
        this.idTipoVenta = idTipoVenta;
        this.descripcionTpoVta = descripcionTpoVta;
        this.estadoTpoVta = estadoTpoVta;
    }

    public Integer getIdTipoVenta() {
        return idTipoVenta;
    }

    public void setIdTipoVenta(Integer idTipoVenta) {
        this.idTipoVenta = idTipoVenta;
    }

    public String getDescripcionTpoVta() {
        return descripcionTpoVta;
    }

    public void setDescripcionTpoVta(String descripcionTpoVta) {
        this.descripcionTpoVta = descripcionTpoVta;
    }

    public boolean getEstadoTpoVta() {
        return estadoTpoVta;
    }

    public void setEstadoTpoVta(boolean estadoTpoVta) {
        this.estadoTpoVta = estadoTpoVta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTipoVenta != null ? idTipoVenta.hashCode() : 0);
        return hash;
    }
}

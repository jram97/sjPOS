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
@Table(name = "tipo_salida")
@NamedQueries({
    @NamedQuery(name = "TipoSalida.findAll", query = "SELECT t FROM TipoSalida t")
    , @NamedQuery(name = "TipoSalida.findByIdTipoSalida", query = "SELECT t FROM TipoSalida t WHERE t.idTipoSalida = :idTipoSalida")
    , @NamedQuery(name = "TipoSalida.findByDescripcion", query = "SELECT t FROM TipoSalida t WHERE t.descripcion = :descripcion")
    , @NamedQuery(name = "TipoSalida.findByEstado", query = "SELECT t FROM TipoSalida t WHERE t.estado = :estado")})
public class TipoSalida implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tipo_salida")
    private Integer idTipoSalida;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "estado")
    private boolean estado;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tipoSalida")
    private List<Salida> salidaList;

    public TipoSalida() {
    }

    public TipoSalida(Integer idTipoSalida) {
        this.idTipoSalida = idTipoSalida;
    }

    public TipoSalida(Integer idTipoSalida, String descripcion, boolean estado) {
        this.idTipoSalida = idTipoSalida;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    public Integer getIdTipoSalida() {
        return idTipoSalida;
    }

    public void setIdTipoSalida(Integer idTipoSalida) {
        this.idTipoSalida = idTipoSalida;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public List<Salida> getSalidaList() {
        return salidaList;
    }

    public void setSalidaList(List<Salida> salidaList) {
        this.salidaList = salidaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTipoSalida != null ? idTipoSalida.hashCode() : 0);
        return hash;
    }
 
}

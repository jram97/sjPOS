package sv.com.stjacks.sjpos.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name = "parametro")
@NamedQueries({
    @NamedQuery(name = "Parametro.findAll", query = "SELECT p FROM Parametro p")
    , @NamedQuery(name = "Parametro.findByIdParametro", query = "SELECT p FROM Parametro p WHERE p.idParametro = :idParametro")
    , @NamedQuery(name = "Parametro.findByNombreParam", query = "SELECT p FROM Parametro p WHERE p.nombreParam = :nombreParam")
    , @NamedQuery(name = "Parametro.findByValorParam", query = "SELECT p FROM Parametro p WHERE p.valorParam = :valorParam")
    , @NamedQuery(name = "Parametro.findByEstadoParam", query = "SELECT p FROM Parametro p WHERE p.estadoParam = :estadoParam")})
public class Parametro implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id_parametro")
    private Integer idParametro;

    @Column(name = "nombre_param")
    private String nombreParam;

    @Column(name = "valor_param")
    private String valorParam;

    @Column(name = "estado_param")
    private boolean estadoParam;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idParametro")
    private List<PaisParametro> paisParametroList;

    public Parametro() {
    }

    public Parametro(Integer idParametro) {
        this.idParametro = idParametro;
    }

    public Parametro(Integer idParametro, String nombreParam, String valorParam, boolean estadoParam) {
        this.idParametro = idParametro;
        this.nombreParam = nombreParam;
        this.valorParam = valorParam;
        this.estadoParam = estadoParam;
    }

    public Integer getIdParametro() {
        return idParametro;
    }

    public void setIdParametro(Integer idParametro) {
        this.idParametro = idParametro;
    }

    public String getNombreParam() {
        return nombreParam;
    }

    public void setNombreParam(String nombreParam) {
        this.nombreParam = nombreParam;
    }

    public String getValorParam() {
        return valorParam;
    }

    public void setValorParam(String valorParam) {
        this.valorParam = valorParam;
    }

    public boolean getEstadoParam() {
        return estadoParam;
    }

    public void setEstadoParam(boolean estadoParam) {
        this.estadoParam = estadoParam;
    }

    public List<PaisParametro> getPaisParametroList() {
        return paisParametroList;
    }

    public void setPaisParametroList(List<PaisParametro> paisParametroList) {
        this.paisParametroList = paisParametroList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idParametro != null ? idParametro.hashCode() : 0);
        return hash;
    }

}

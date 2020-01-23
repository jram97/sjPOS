package sv.com.stjacks.sjpos.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import sv.com.stjacks.sjpos.entities.Pais;

/**
 *
 * @author jramirez
 */
@Entity
@Table(name = "pais_parametro")
@NamedQueries({
    @NamedQuery(name = "PaisParametro.findAll", query = "SELECT p FROM PaisParametro p")
    , @NamedQuery(name = "PaisParametro.findByIdPaisParametro", query = "SELECT p FROM PaisParametro p WHERE p.idPaisParametro = :idPaisParametro")})
public class PaisParametro implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id_pais_parametro")
    private Integer idPaisParametro;

    @JoinColumn(name = "id_pais", referencedColumnName = "id_pais")
    @ManyToOne(optional = false)
    private Pais idPais;

    @JoinColumn(name = "id_parametro", referencedColumnName = "id_parametro")
    @ManyToOne(optional = false)
    private Parametro idParametro;

    public PaisParametro() {
    }

    public PaisParametro(Integer idPaisParametro) {
        this.idPaisParametro = idPaisParametro;
    }

    public Integer getIdPaisParametro() {
        return idPaisParametro;
    }

    public void setIdPaisParametro(Integer idPaisParametro) {
        this.idPaisParametro = idPaisParametro;
    }

    public Pais getIdPais() {
        return idPais;
    }

    public void setIdPais(Pais idPais) {
        this.idPais = idPais;
    }

    public Parametro getIdParametro() {
        return idParametro;
    }

    public void setIdParametro(Parametro idParametro) {
        this.idParametro = idParametro;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPaisParametro != null ? idPaisParametro.hashCode() : 0);
        return hash;
    }
}

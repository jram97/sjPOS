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
@Table(name = "criterio")
@NamedQueries({
    @NamedQuery(name = "Criterio.findAll", query = "SELECT c FROM Criterio c")
    , @NamedQuery(name = "Criterio.findByIdCriterio", query = "SELECT c FROM Criterio c WHERE c.idCriterio = :idCriterio")
    , @NamedQuery(name = "Criterio.findByTablaCriterio", query = "SELECT c FROM Criterio c WHERE c.tablaCriterio = :tablaCriterio")
    , @NamedQuery(name = "Criterio.findByEstadoCriterio", query = "SELECT c FROM Criterio c WHERE c.estadoCriterio = :estadoCriterio")
    , @NamedQuery(name = "Criterio.findByNombreCriterio", query = "SELECT c FROM Criterio c WHERE c.nombreCriterio = :nombreCriterio")})
public class Criterio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id_criterio")
    private Integer idCriterio;

    @Column(name = "tabla_criterio")
    private String tablaCriterio;

    @Column(name = "estado_criterio")
    private boolean estadoCriterio;

    @Column(name = "nombre_criterio")
    private String nombreCriterio;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCriterio")
    private List<RegistroPromocion> registroPromocionList;

    public Criterio() {
    }

    public Criterio(Integer idCriterio) {
        this.idCriterio = idCriterio;
    }

    public Criterio(Integer idCriterio, String tablaCriterio, boolean estadoCriterio, String nombreCriterio) {
        this.idCriterio = idCriterio;
        this.tablaCriterio = tablaCriterio;
        this.estadoCriterio = estadoCriterio;
        this.nombreCriterio = nombreCriterio;
    }

    public Integer getIdCriterio() {
        return idCriterio;
    }

    public void setIdCriterio(Integer idCriterio) {
        this.idCriterio = idCriterio;
    }

    public String getTablaCriterio() {
        return tablaCriterio;
    }

    public void setTablaCriterio(String tablaCriterio) {
        this.tablaCriterio = tablaCriterio;
    }

    public boolean getEstadoCriterio() {
        return estadoCriterio;
    }

    public void setEstadoCriterio(boolean estadoCriterio) {
        this.estadoCriterio = estadoCriterio;
    }

    public String getNombreCriterio() {
        return nombreCriterio;
    }

    public void setNombreCriterio(String nombreCriterio) {
        this.nombreCriterio = nombreCriterio;
    }

    public List<RegistroPromocion> getRegistroPromocionList() {
        return registroPromocionList;
    }

    public void setRegistroPromocionList(List<RegistroPromocion> registroPromocionList) {
        this.registroPromocionList = registroPromocionList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCriterio != null ? idCriterio.hashCode() : 0);
        return hash;
    }
  
}

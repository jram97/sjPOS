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
@Table(name = "tipo_promocion")
@NamedQueries({
    @NamedQuery(name = "TipoPromocion.findAll", query = "SELECT t FROM TipoPromocion t")
    , @NamedQuery(name = "TipoPromocion.findByIdTipoPromocion", query = "SELECT t FROM TipoPromocion t WHERE t.idTipoPromocion = :idTipoPromocion")
    , @NamedQuery(name = "TipoPromocion.findByTipoProm", query = "SELECT t FROM TipoPromocion t WHERE t.tipoProm = :tipoProm")
    , @NamedQuery(name = "TipoPromocion.findByEstadoTpoProm", query = "SELECT t FROM TipoPromocion t WHERE t.estadoTpoProm = :estadoTpoProm")})
public class TipoPromocion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tipo_promocion")
    private Integer idTipoPromocion;

    @Column(name = "tipo_prom")
    private String tipoProm;

    @Column(name = "estado_tpo_prom")
    private boolean estadoTpoProm;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTipoPromocion")
    private List<Promocion> promocionList;

    public TipoPromocion() {
    }

    public TipoPromocion(Integer idTipoPromocion) {
        this.idTipoPromocion = idTipoPromocion;
    }

    public TipoPromocion(Integer idTipoPromocion, String tipoProm, boolean estadoTpoProm) {
        this.idTipoPromocion = idTipoPromocion;
        this.tipoProm = tipoProm;
        this.estadoTpoProm = estadoTpoProm;
    }

    public Integer getIdTipoPromocion() {
        return idTipoPromocion;
    }

    public void setIdTipoPromocion(Integer idTipoPromocion) {
        this.idTipoPromocion = idTipoPromocion;
    }

    public String getTipoProm() {
        return tipoProm;
    }

    public void setTipoProm(String tipoProm) {
        this.tipoProm = tipoProm;
    }

    public boolean getEstadoTpoProm() {
        return estadoTpoProm;
    }

    public void setEstadoTpoProm(boolean estadoTpoProm) {
        this.estadoTpoProm = estadoTpoProm;
    }

    public List<Promocion> getPromocionList() {
        return promocionList;
    }

    public void setPromocionList(List<Promocion> promocionList) {
        this.promocionList = promocionList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTipoPromocion != null ? idTipoPromocion.hashCode() : 0);
        return hash;
    }
 
}

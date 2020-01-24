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
@Table(name = "tipo_cambio")
@NamedQueries({
    @NamedQuery(name = "TipoCambio.findAll", query = "SELECT t FROM TipoCambio t")
    , @NamedQuery(name = "TipoCambio.findByIdTipoCambio", query = "SELECT t FROM TipoCambio t WHERE t.idTipoCambio = :idTipoCambio")
    , @NamedQuery(name = "TipoCambio.findByDescripcionTpoCamb", query = "SELECT t FROM TipoCambio t WHERE t.descripcionTpoCamb = :descripcionTpoCamb")
    , @NamedQuery(name = "TipoCambio.findByEstadoTpoCamb", query = "SELECT t FROM TipoCambio t WHERE t.estadoTpoCamb = :estadoTpoCamb")})
public class TipoCambio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tipo_cambio")
    private Integer idTipoCambio;

    @Column(name = "descripcion_tpo_camb")
    private String descripcionTpoCamb;

    @Column(name = "estado_tpo_camb")
    private boolean estadoTpoCamb;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTipoCambio")
    private List<ProductoCambio> productoCambioList;

    public TipoCambio() {
    }

    public TipoCambio(Integer idTipoCambio) {
        this.idTipoCambio = idTipoCambio;
    }

    public TipoCambio(Integer idTipoCambio, String descripcionTpoCamb, boolean estadoTpoCamb) {
        this.idTipoCambio = idTipoCambio;
        this.descripcionTpoCamb = descripcionTpoCamb;
        this.estadoTpoCamb = estadoTpoCamb;
    }

    public Integer getIdTipoCambio() {
        return idTipoCambio;
    }

    public void setIdTipoCambio(Integer idTipoCambio) {
        this.idTipoCambio = idTipoCambio;
    }

    public String getDescripcionTpoCamb() {
        return descripcionTpoCamb;
    }

    public void setDescripcionTpoCamb(String descripcionTpoCamb) {
        this.descripcionTpoCamb = descripcionTpoCamb;
    }

    public boolean getEstadoTpoCamb() {
        return estadoTpoCamb;
    }

    public void setEstadoTpoCamb(boolean estadoTpoCamb) {
        this.estadoTpoCamb = estadoTpoCamb;
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
        hash += (idTipoCambio != null ? idTipoCambio.hashCode() : 0);
        return hash;
    }

}

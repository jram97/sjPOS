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
@Table(name = "salida")
@NamedQueries({
    @NamedQuery(name = "Salida.findAll", query = "SELECT s FROM Salida s")
    , @NamedQuery(name = "Salida.findByIdSalida", query = "SELECT s FROM Salida s WHERE s.idSalida = :idSalida")
    , @NamedQuery(name = "Salida.findByFechaSal", query = "SELECT s FROM Salida s WHERE s.fechaSal = :fechaSal")
    , @NamedQuery(name = "Salida.findByComentarioSal", query = "SELECT s FROM Salida s WHERE s.comentarioSal = :comentarioSal")
    , @NamedQuery(name = "Salida.findByUsuarioGeneradaSal", query = "SELECT s FROM Salida s WHERE s.usuarioGeneradaSal = :usuarioGeneradaSal")
    , @NamedQuery(name = "Salida.findByDestinoSal", query = "SELECT s FROM Salida s WHERE s.destinoSal = :destinoSal")})
public class Salida implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_salida")
    private Integer idSalida;

    @Column(name = "fecha_sal")
    @Temporal(TemporalType.DATE)
    private Date fechaSal;

    @Column(name = "comentario_sal")
    private String comentarioSal;

    @Column(name = "usuario_generada_sal")
    private int usuarioGeneradaSal;

    @Column(name = "destino_sal")
    private String destinoSal;

    @JoinColumn(name = "tipo_salida", referencedColumnName = "id_tipo_salida")
    @ManyToOne(optional = false)
    private TipoSalida tipoSalida;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idSalida")
    private List<ProductoSalida> productoSalidaList;

    public Salida() {
    }

    public Salida(Integer idSalida) {
        this.idSalida = idSalida;
    }

    public Salida(Integer idSalida, Date fechaSal, String comentarioSal, int usuarioGeneradaSal, String destinoSal) {
        this.idSalida = idSalida;
        this.fechaSal = fechaSal;
        this.comentarioSal = comentarioSal;
        this.usuarioGeneradaSal = usuarioGeneradaSal;
        this.destinoSal = destinoSal;
    }

    public Integer getIdSalida() {
        return idSalida;
    }

    public void setIdSalida(Integer idSalida) {
        this.idSalida = idSalida;
    }

    public Date getFechaSal() {
        return fechaSal;
    }

    public void setFechaSal(Date fechaSal) {
        this.fechaSal = fechaSal;
    }

    public String getComentarioSal() {
        return comentarioSal;
    }

    public void setComentarioSal(String comentarioSal) {
        this.comentarioSal = comentarioSal;
    }

    public int getUsuarioGeneradaSal() {
        return usuarioGeneradaSal;
    }

    public void setUsuarioGeneradaSal(int usuarioGeneradaSal) {
        this.usuarioGeneradaSal = usuarioGeneradaSal;
    }

    public String getDestinoSal() {
        return destinoSal;
    }

    public void setDestinoSal(String destinoSal) {
        this.destinoSal = destinoSal;
    }

    public TipoSalida getTipoSalida() {
        return tipoSalida;
    }

    public void setTipoSalida(TipoSalida tipoSalida) {
        this.tipoSalida = tipoSalida;
    }

    public List<ProductoSalida> getProductoSalidaList() {
        return productoSalidaList;
    }

    public void setProductoSalidaList(List<ProductoSalida> productoSalidaList) {
        this.productoSalidaList = productoSalidaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSalida != null ? idSalida.hashCode() : 0);
        return hash;
    }
  
}

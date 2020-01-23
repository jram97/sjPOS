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
@Table(name = "ingreso")
@NamedQueries({
    @NamedQuery(name = "Ingreso.findAll", query = "SELECT i FROM Ingreso i")
    , @NamedQuery(name = "Ingreso.findByIdIngreso", query = "SELECT i FROM Ingreso i WHERE i.idIngreso = :idIngreso")
    , @NamedQuery(name = "Ingreso.findByFechaIngr", query = "SELECT i FROM Ingreso i WHERE i.fechaIngr = :fechaIngr")
    , @NamedQuery(name = "Ingreso.findByEstadoIngr", query = "SELECT i FROM Ingreso i WHERE i.estadoIngr = :estadoIngr")
    , @NamedQuery(name = "Ingreso.findByCreditoFiscalIngr", query = "SELECT i FROM Ingreso i WHERE i.creditoFiscalIngr = :creditoFiscalIngr")
    , @NamedQuery(name = "Ingreso.findByComentarioIngr", query = "SELECT i FROM Ingreso i WHERE i.comentarioIngr = :comentarioIngr")
    , @NamedQuery(name = "Ingreso.findByUsuarioGenera", query = "SELECT i FROM Ingreso i WHERE i.usuarioGenera = :usuarioGenera")})
public class Ingreso implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ingreso")
    private Integer idIngreso;

    @Column(name = "fecha_ingr")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaIngr;

    @Column(name = "estado_ingr")
    private boolean estadoIngr;

    @Column(name = "credito_fiscal_ingr")
    private String creditoFiscalIngr;

    @Column(name = "comentario_ingr")
    private String comentarioIngr;

    @Column(name = "usuario_genera")
    private int usuarioGenera;

    @JoinColumn(name = "id_tienda", referencedColumnName = "id_tienda")
    @ManyToOne(optional = false)
    private Tienda idTienda;

    public Ingreso() {
    }

    public Ingreso(Integer idIngreso) {
        this.idIngreso = idIngreso;
    }

    public Ingreso(Integer idIngreso, Date fechaIngr, boolean estadoIngr, String creditoFiscalIngr, int usuarioGenera) {
        this.idIngreso = idIngreso;
        this.fechaIngr = fechaIngr;
        this.estadoIngr = estadoIngr;
        this.creditoFiscalIngr = creditoFiscalIngr;
        this.usuarioGenera = usuarioGenera;
    }

    public Integer getIdIngreso() {
        return idIngreso;
    }

    public void setIdIngreso(Integer idIngreso) {
        this.idIngreso = idIngreso;
    }

    public Date getFechaIngr() {
        return fechaIngr;
    }

    public void setFechaIngr(Date fechaIngr) {
        this.fechaIngr = fechaIngr;
    }

    public boolean getEstadoIngr() {
        return estadoIngr;
    }

    public void setEstadoIngr(boolean estadoIngr) {
        this.estadoIngr = estadoIngr;
    }

    public String getCreditoFiscalIngr() {
        return creditoFiscalIngr;
    }

    public void setCreditoFiscalIngr(String creditoFiscalIngr) {
        this.creditoFiscalIngr = creditoFiscalIngr;
    }

    public String getComentarioIngr() {
        return comentarioIngr;
    }

    public void setComentarioIngr(String comentarioIngr) {
        this.comentarioIngr = comentarioIngr;
    }

    public int getUsuarioGenera() {
        return usuarioGenera;
    }

    public void setUsuarioGenera(int usuarioGenera) {
        this.usuarioGenera = usuarioGenera;
    }

    public Tienda getIdTienda() {
        return idTienda;
    }

    public void setIdTienda(Tienda idTienda) {
        this.idTienda = idTienda;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idIngreso != null ? idIngreso.hashCode() : 0);
        return hash;
    }

}

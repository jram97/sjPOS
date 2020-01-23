package sv.com.stjacks.sjpos.entities;

import java.io.Serializable;
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

/**
 *
 * @author jramirez
 */
@Entity
@Table(name = "cliente_promocion")
@NamedQueries({
    @NamedQuery(name = "ClientePromocion.findAll", query = "SELECT c FROM ClientePromocion c")
    , @NamedQuery(name = "ClientePromocion.findByIdClientePromocion", query = "SELECT c FROM ClientePromocion c WHERE c.idClientePromocion = :idClientePromocion")
    , @NamedQuery(name = "ClientePromocion.findByEstado", query = "SELECT c FROM ClientePromocion c WHERE c.estado = :estado")})
public class ClientePromocion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idClientePromocion;

    @Column(name = "estado")
    private boolean estado;
    
    @JoinColumn(name = "id_cliente", referencedColumnName = "id_cliente")
    @ManyToOne(optional = false)
    private Cliente idCliente;
    
    @JoinColumn(name = "id_promocion", referencedColumnName = "id_promocion")
    @ManyToOne(optional = false)
    private Promocion idPromocion;

    public ClientePromocion() {
    }

    public ClientePromocion(Integer idClientePromocion) {
        this.idClientePromocion = idClientePromocion;
    }

    public ClientePromocion(Integer idClientePromocion, boolean estado) {
        this.idClientePromocion = idClientePromocion;
        this.estado = estado;
    }

    public Integer getIdClientePromocion() {
        return idClientePromocion;
    }

    public void setIdClientePromocion(Integer idClientePromocion) {
        this.idClientePromocion = idClientePromocion;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Cliente getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Cliente idCliente) {
        this.idCliente = idCliente;
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
        hash += (idClientePromocion != null ? idClientePromocion.hashCode() : 0);
        return hash;
    }
 
}

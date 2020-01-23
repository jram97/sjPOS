package sv.com.stjacks.sjpos.entities;

import java.io.Serializable;
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

/**
 *
 * @author Javier Ramírez
 */
@Entity
@Table(name = "promocion_venta")
@NamedQueries({
    @NamedQuery(name = "PromocionVenta.findAll", query = "SELECT p FROM PromocionVenta p")
    , @NamedQuery(name = "PromocionVenta.findByIdPromocionVenta", query = "SELECT p FROM PromocionVenta p WHERE p.idPromocionVenta = :idPromocionVenta")
    , @NamedQuery(name = "PromocionVenta.findByEstadoPromVta", query = "SELECT p FROM PromocionVenta p WHERE p.estadoPromVta = :estadoPromVta")})
public class PromocionVenta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_promocion_venta")
    private Integer idPromocionVenta;

    @Column(name = "estado_prom_vta")
    private boolean estadoPromVta;

    @JoinColumn(name = "id_promocion", referencedColumnName = "id_promocion")
    @ManyToOne(optional = false)
    private Promocion idPromocion;

    @JoinColumn(name = "id_venta", referencedColumnName = "id_venta")
    @ManyToOne(optional = false)
    private Venta venta;

    public PromocionVenta() {
    }

    public PromocionVenta(Integer idPromocionVenta) {
        this.idPromocionVenta = idPromocionVenta;
    }

    public PromocionVenta(Integer idPromocionVenta, boolean estadoPromVta) {
        this.idPromocionVenta = idPromocionVenta;
        this.estadoPromVta = estadoPromVta;
    }

    public Integer getIdPromocionVenta() {
        return idPromocionVenta;
    }

    public void setIdPromocionVenta(Integer idPromocionVenta) {
        this.idPromocionVenta = idPromocionVenta;
    }

    public boolean getEstadoPromVta() {
        return estadoPromVta;
    }

    public void setEstadoPromVta(boolean estadoPromVta) {
        this.estadoPromVta = estadoPromVta;
    }

    public Promocion getIdPromocion() {
        return idPromocion;
    }

    public void setIdPromocion(Promocion idPromocion) {
        this.idPromocion = idPromocion;
    }

    public Venta getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(Venta idVenta) {
        this.idVenta = idVenta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPromocionVenta != null ? idPromocionVenta.hashCode() : 0);
        return hash;
    }
}

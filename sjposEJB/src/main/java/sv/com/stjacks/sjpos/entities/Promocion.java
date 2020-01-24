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
@Table(name = "promocion")
@NamedQueries({
    @NamedQuery(name = "Promocion.findAll", query = "SELECT p FROM Promocion p")
    , @NamedQuery(name = "Promocion.findByIdPromocion", query = "SELECT p FROM Promocion p WHERE p.idPromocion = :idPromocion")
    , @NamedQuery(name = "Promocion.findByDescripcionProm", query = "SELECT p FROM Promocion p WHERE p.descripcionProm = :descripcionProm")
    , @NamedQuery(name = "Promocion.findByEstadoProm", query = "SELECT p FROM Promocion p WHERE p.estadoProm = :estadoProm")
    , @NamedQuery(name = "Promocion.findByPorcentajeProm", query = "SELECT p FROM Promocion p WHERE p.porcentajeProm = :porcentajeProm")
    , @NamedQuery(name = "Promocion.findByCantidadMinimaProm", query = "SELECT p FROM Promocion p WHERE p.cantidadMinimaProm = :cantidadMinimaProm")
    , @NamedQuery(name = "Promocion.findByAplicarProm", query = "SELECT p FROM Promocion p WHERE p.aplicarProm = :aplicarProm")
    , @NamedQuery(name = "Promocion.findByFechaInicioProm", query = "SELECT p FROM Promocion p WHERE p.fechaInicioProm = :fechaInicioProm")
    , @NamedQuery(name = "Promocion.findByFechaFinProm", query = "SELECT p FROM Promocion p WHERE p.fechaFinProm = :fechaFinProm")
    , @NamedQuery(name = "Promocion.findByUsuarioCreadaProm", query = "SELECT p FROM Promocion p WHERE p.usuarioCreadaProm = :usuarioCreadaProm")
    , @NamedQuery(name = "Promocion.findByFechaCreadaProm", query = "SELECT p FROM Promocion p WHERE p.fechaCreadaProm = :fechaCreadaProm")})
public class Promocion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_promocion")
    private Integer idPromocion;

    @Column(name = "descripcion_prom")
    private String descripcionProm;

    @Column(name = "estado_prom")
    private boolean estadoProm;

    @Column(name = "porcentaje_prom")
    private double porcentajeProm;

    @Column(name = "cantidad_minima_prom")
    private Integer cantidadMinimaProm;

    @Column(name = "aplicar_prom")
    private Integer aplicarProm;

    @Column(name = "fecha_inicio_prom")
    @Temporal(TemporalType.DATE)
    private Date fechaInicioProm;

    @Column(name = "fecha_fin_prom")
    @Temporal(TemporalType.DATE)
    private Date fechaFinProm;

    @Column(name = "usuario_creada_prom")
    private int usuarioCreadaProm;

    @Column(name = "fecha_creada_prom")
    @Temporal(TemporalType.DATE)
    private Date fechaCreadaProm;

    @OneToMany(mappedBy = "promicion")
    private List<ProductoVenta> productoVentaList;

    @JoinColumn(name = "id_tipo_promocion", referencedColumnName = "id_tipo_promocion")
    @ManyToOne(optional = false)
    private TipoPromocion idTipoPromocion;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPromocion")
    private List<RegistroPromocion> registroPromocionList;

    @OneToMany
    private List<Venta> ventaList;

    public Promocion() {
    }

    public Promocion(Integer idPromocion) {
        this.idPromocion = idPromocion;
    }

    public Promocion(Integer idPromocion, String descripcionProm, boolean estadoProm, double porcentajeProm, Date fechaInicioProm, Date fechaFinProm, int usuarioCreadaProm, Date fechaCreadaProm) {
        this.idPromocion = idPromocion;
        this.descripcionProm = descripcionProm;
        this.estadoProm = estadoProm;
        this.porcentajeProm = porcentajeProm;
        this.fechaInicioProm = fechaInicioProm;
        this.fechaFinProm = fechaFinProm;
        this.usuarioCreadaProm = usuarioCreadaProm;
        this.fechaCreadaProm = fechaCreadaProm;
    }

    public Integer getIdPromocion() {
        return idPromocion;
    }

    public void setIdPromocion(Integer idPromocion) {
        this.idPromocion = idPromocion;
    }

    public String getDescripcionProm() {
        return descripcionProm;
    }

    public void setDescripcionProm(String descripcionProm) {
        this.descripcionProm = descripcionProm;
    }

    public boolean getEstadoProm() {
        return estadoProm;
    }

    public void setEstadoProm(boolean estadoProm) {
        this.estadoProm = estadoProm;
    }

    public double getPorcentajeProm() {
        return porcentajeProm;
    }

    public void setPorcentajeProm(double porcentajeProm) {
        this.porcentajeProm = porcentajeProm;
    }

    public Integer getCantidadMinimaProm() {
        return cantidadMinimaProm;
    }

    public void setCantidadMinimaProm(Integer cantidadMinimaProm) {
        this.cantidadMinimaProm = cantidadMinimaProm;
    }

    public Integer getAplicarProm() {
        return aplicarProm;
    }

    public void setAplicarProm(Integer aplicarProm) {
        this.aplicarProm = aplicarProm;
    }

    public Date getFechaInicioProm() {
        return fechaInicioProm;
    }

    public void setFechaInicioProm(Date fechaInicioProm) {
        this.fechaInicioProm = fechaInicioProm;
    }

    public Date getFechaFinProm() {
        return fechaFinProm;
    }

    public void setFechaFinProm(Date fechaFinProm) {
        this.fechaFinProm = fechaFinProm;
    }

    public int getUsuarioCreadaProm() {
        return usuarioCreadaProm;
    }

    public void setUsuarioCreadaProm(int usuarioCreadaProm) {
        this.usuarioCreadaProm = usuarioCreadaProm;
    }

    public Date getFechaCreadaProm() {
        return fechaCreadaProm;
    }

    public void setFechaCreadaProm(Date fechaCreadaProm) {
        this.fechaCreadaProm = fechaCreadaProm;
    }

    public List<ProductoVenta> getProductoVentaList() {
        return productoVentaList;
    }

    public void setProductoVentaList(List<ProductoVenta> productoVentaList) {
        this.productoVentaList = productoVentaList;
    }

    public TipoPromocion getIdTipoPromocion() {
        return idTipoPromocion;
    }

    public void setIdTipoPromocion(TipoPromocion idTipoPromocion) {
        this.idTipoPromocion = idTipoPromocion;
    }


    public List<RegistroPromocion> getRegistroPromocionList() {
        return registroPromocionList;
    }

    public void setRegistroPromocionList(List<RegistroPromocion> registroPromocionList) {
        this.registroPromocionList = registroPromocionList;
    }

    public List<Venta> getVentaList() {
        return ventaList;
    }

    public void setVentaList(List<Venta> ventaList) {
        this.ventaList = ventaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPromocion != null ? idPromocion.hashCode() : 0);
        return hash;
    }
}

package sv.com.stjacks.sjpos.entities;

import java.io.Serializable;
import javax.persistence.*;

import sv.com.stjacks.sjpos.entities.Pedido;

import java.util.Date;
import java.util.List;


/**
 * The persistent class for the tienda database table.
 * 
 */
@Entity
@Table(name="tienda")
@NamedQueries({
    @NamedQuery(name = "Tienda.findAll", query = "SELECT t FROM Tienda t"),
    @NamedQuery(name = "Tienda.findByIdTienda", query = "SELECT t FROM Tienda t WHERE t.idTienda = :idTienda"),
    @NamedQuery(name = "Tienda.findByNombreTda", query = "SELECT t FROM Tienda t WHERE t.nombreTda = :nombreTda"),
    @NamedQuery(name = "Tienda.findByTelefonoTda", query = "SELECT t FROM Tienda t WHERE t.telefonoTda = :telefonoTda"),
    @NamedQuery(name = "Tienda.findByDireccionTda", query = "SELECT t FROM Tienda t WHERE t.direccionTda = :direccionTda"),
    @NamedQuery(name = "Tienda.findByEmailTda", query = "SELECT t FROM Tienda t WHERE t.emailTda = :emailTda"),
    @NamedQuery(name = "Tienda.findByEstadoTda", query = "SELECT t FROM Tienda t WHERE t.estadoTda = :estadoTda"),
    @NamedQuery(name = "Tienda.findByLatitudTda", query = "SELECT t FROM Tienda t WHERE t.latitudTda = :latitudTda"),
    @NamedQuery(name = "Tienda.findByLongitudTda", query = "SELECT t FROM Tienda t WHERE t.longitudTda = :longitudTda"),
    @NamedQuery(name = "Tienda.findByFechaRegistroTda", query = "SELECT t FROM Tienda t WHERE t.fechaRegistroTda = :fechaRegistroTda")})
public class Tienda implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_tienda", unique=true, nullable=false)
	private Integer idTienda;

	@Column(name="direccion_tda", nullable=false, length=200)
	private String direccionTda;

	@Column(name="email_tda", length=75)
	private String emailTda;

	@Column(name="estado_tda", nullable=false)
	private Boolean estadoTda;

	@Temporal(TemporalType.DATE)
	@Column(name="fecha_registro_tda", nullable=false)
	private Date fechaRegistroTda;

	@Column(name="latitud_tda", nullable=false)
	private double latitudTda;

	@Column(name="longitud_tda", nullable=false)
	private double longitudTda;

	@Column(name="nombre_tda", nullable=false, length=100)
	private String nombreTda;

	@Column(name="telefono_tda", nullable=false, length=15)
	private String telefonoTda;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "tienda")
    private List<TipoDocumentoTienda> tipoDocumentoTiendaList;
	
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tienda")
    private List<FormaPagoTienda> formaPagoTiendaList;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTienda")
    private List<Pedido> pedidoList;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTiendaOrigenTrf")
    private List<Transferencia> transferenciaListGenerada;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTiendaDestinoTrf")
    private List<Transferencia> transferenciaListRecibida;
    
    @JoinColumn(name = "id_pais", referencedColumnName = "id_pais", nullable = false)
    @ManyToOne(optional = false)
    private Pais idPais;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTienda")
    private List<Ingreso> ingresoList;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tienda")
    private List<Caja> cajaList;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTienda")
    private List<ProductoTienda> productoTiendaList;

	public Tienda() {
	}

	public Integer getIdTienda() {
		return this.idTienda;
	}

	public void setIdTienda(Integer idTienda) {
		this.idTienda = idTienda;
	}

	public String getDireccionTda() {
		return this.direccionTda;
	}

	public void setDireccionTda(String direccionTda) {
		this.direccionTda = direccionTda;
	}

	public String getEmailTda() {
		return this.emailTda;
	}

	public void setEmailTda(String emailTda) {
		this.emailTda = emailTda;
	}

	public Boolean getEstadoTda() {
		return this.estadoTda;
	}

	public void setEstadoTda(Boolean estadoTda) {
		this.estadoTda = estadoTda;
	}

	public Date getFechaRegistroTda() {
		return this.fechaRegistroTda;
	}

	public void setFechaRegistroTda(Date fechaRegistroTda) {
		this.fechaRegistroTda = fechaRegistroTda;
	}

	public double getLatitudTda() {
		return this.latitudTda;
	}

	public void setLatitudTda(double latitudTda) {
		this.latitudTda = latitudTda;
	}

	public double getLongitudTda() {
		return this.longitudTda;
	}

	public void setLongitudTda(double longitudTda) {
		this.longitudTda = longitudTda;
	}

	public String getNombreTda() {
		return this.nombreTda;
	}

	public void setNombreTda(String nombreTda) {
		this.nombreTda = nombreTda;
	}

	public String getTelefonoTda() {
		return this.telefonoTda;
	}

	public void setTelefonoTda(String telefonoTda) {
		this.telefonoTda = telefonoTda;
	}

	public List<TipoDocumentoTienda> getTipoDocumentoTiendaList() {
		return tipoDocumentoTiendaList;
	}

	public void setTipoDocumentoTiendaList(List<TipoDocumentoTienda> tipoDocumentoTiendaList) {
		this.tipoDocumentoTiendaList = tipoDocumentoTiendaList;
	}

	public List<FormaPagoTienda> getFormaPagoTiendaList() {
		return formaPagoTiendaList;
	}

	public void setFormaPagoTiendaList(List<FormaPagoTienda> formaPagoTiendaList) {
		this.formaPagoTiendaList = formaPagoTiendaList;
	}

	public List<Pedido> getPedidoList() {
		return pedidoList;
	}

	public void setPedidoList(List<Pedido> pedidoList) {
		this.pedidoList = pedidoList;
	}

	public List<Transferencia> getTransferenciaListGenerada() {
		return transferenciaListGenerada;
	}

	public void setTransferenciaListGenerada(List<Transferencia> transferenciaListGenerada) {
		this.transferenciaListGenerada = transferenciaListGenerada;
	}

	public List<Transferencia> getTransferenciaListRecibida() {
		return transferenciaListRecibida;
	}

	public void setTransferenciaListRecibida(List<Transferencia> transferenciaListRecibida) {
		this.transferenciaListRecibida = transferenciaListRecibida;
	}

	public Pais getIdPais() {
		return idPais;
	}

	public void setIdPais(Pais idPais) {
		this.idPais = idPais;
	}

	public List<Ingreso> getIngresoList() {
		return ingresoList;
	}

	public void setIngresoList(List<Ingreso> ingresoList) {
		this.ingresoList = ingresoList;
	}

	public List<Caja> getCajaList() {
		return cajaList;
	}

	public void setCajaList(List<Caja> cajaList) {
		this.cajaList = cajaList;
	}

	public List<ProductoTienda> getProductoTiendaList() {
		return productoTiendaList;
	}

	public void setProductoTiendaList(List<ProductoTienda> productoTiendaList) {
		this.productoTiendaList = productoTiendaList;
	}

}
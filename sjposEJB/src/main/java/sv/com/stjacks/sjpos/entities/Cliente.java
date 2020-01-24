package sv.com.stjacks.sjpos.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;


/**
 * The persistent class for the cliente database table.
 * 
 */
@Entity
@Table(name="cliente")
@NamedQueries({
    @NamedQuery(name = "Cliente.findAll", query = "SELECT c FROM Cliente c"),
    @NamedQuery(name = "Cliente.findByIdCliente", query = "SELECT c FROM Cliente c WHERE c.idCliente = :idCliente"),
    @NamedQuery(name = "Cliente.findByIdUsuario", query = "SELECT c FROM Cliente c WHERE c.idUsuario = :idUsuario"),
    @NamedQuery(name = "Cliente.findByNombreCliente", query = "SELECT c FROM Cliente c WHERE c.nombreCliente = :nombreCliente"),
    @NamedQuery(name = "Cliente.findByEstadoCli", query = "SELECT c FROM Cliente c WHERE c.estadoCli = :estadoCli"),
    @NamedQuery(name = "Cliente.findByPuntosCli", query = "SELECT c FROM Cliente c WHERE c.puntosCli = :puntosCli"),
    @NamedQuery(name = "Cliente.findByEmailCli", query = "SELECT c FROM Cliente c WHERE c.emailCli = :emailCli"),
    @NamedQuery(name = "Cliente.findByTelefonoCli", query = "SELECT c FROM Cliente c WHERE c.telefonoCli = :telefonoCli"),
    @NamedQuery(name = "Cliente.findByDireccionCli", query = "SELECT c FROM Cliente c WHERE c.direccionCli = :direccionCli"),
    @NamedQuery(name = "Cliente.findByCedulaCli", query = "SELECT c FROM Cliente c WHERE c.cedulaCli = :cedulaCli")})
public class Cliente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_cliente", unique=true, nullable=false)
	private Integer idCliente;

	@Column(name="cedula_cli", nullable=false, length=20)
	private String cedulaCli;

	@Column(name="direccion_cli", nullable=false, length=200)
	private String direccionCli;

	@Column(name="email_cli", nullable=false, length=100)
	private String emailCli;

	@Column(name="estado_cli", nullable=false)
	private Boolean estadoCli;

	@Column(name="id_usuario")
	private Integer idUsuario;

	@Column(name="nombre_cliente", nullable=false, length=100)
	private String nombreCliente;

	@Column(name="puntos_cli")
	private Integer puntosCli;

	@Column(name="telefono_cli", nullable=false, length=15)
	private String telefonoCli;
	
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cliente")
    private List<Venta> ventaList;
    
    @JoinColumn(name = "id_tipo_cliente", referencedColumnName = "id_tipo_cliente", nullable = false)
    @ManyToOne(optional = false)
    private TipoCliente idTipoCliente;

	public Cliente() {
	}

	public Integer getIdCliente() {
		return this.idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public String getCedulaCli() {
		return this.cedulaCli;
	}

	public void setCedulaCli(String cedulaCli) {
		this.cedulaCli = cedulaCli;
	}

	public String getDireccionCli() {
		return this.direccionCli;
	}

	public void setDireccionCli(String direccionCli) {
		this.direccionCli = direccionCli;
	}

	public String getEmailCli() {
		return this.emailCli;
	}

	public void setEmailCli(String emailCli) {
		this.emailCli = emailCli;
	}

	public Boolean getEstadoCli() {
		return this.estadoCli;
	}

	public void setEstadoCli(Boolean estadoCli) {
		this.estadoCli = estadoCli;
	}

	public Integer getIdUsuario() {
		return this.idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNombreCliente() {
		return this.nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public Integer getPuntosCli() {
		return this.puntosCli;
	}

	public void setPuntosCli(Integer puntosCli) {
		this.puntosCli = puntosCli;
	}

	public String getTelefonoCli() {
		return this.telefonoCli;
	}

	public void setTelefonoCli(String telefonoCli) {
		this.telefonoCli = telefonoCli;
	}

	public List<Venta> getVentaList() {
		return ventaList;
	}

	public void setVentaList(List<Venta> ventaList) {
		this.ventaList = ventaList;
	}

	public void setIdTipoCliente(TipoCliente idTipoCliente) {
		this.idTipoCliente = idTipoCliente;
	}
}
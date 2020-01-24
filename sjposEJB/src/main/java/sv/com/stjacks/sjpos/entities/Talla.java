package sv.com.stjacks.sjpos.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;

/**
 * The persistent class for the talla database table.
 * 
 */
@Entity
@Table(name = "talla")
@NamedQueries({ @NamedQuery(name = "Talla.findAll", query = "SELECT t FROM Talla t"),
		@NamedQuery(name = "Talla.findByIdTalla", query = "SELECT t FROM Talla t WHERE t.idTalla = :idTalla"),
		@NamedQuery(name = "Talla.findByTalla", query = "SELECT t FROM Talla t WHERE t.talla = :talla"),
		@NamedQuery(name = "Talla.findByEstaturaTll", query = "SELECT t FROM Talla t WHERE t.estaturaTll = :estaturaTll"),
		@NamedQuery(name = "Talla.findByPesoTll", query = "SELECT t FROM Talla t WHERE t.pesoTll = :pesoTll"),
		@NamedQuery(name = "Talla.findByEstadoTll", query = "SELECT t FROM Talla t WHERE t.estadoTll = :estadoTll"),
		@NamedQuery(name = "Talla.findByFechaRegistroTll", query = "SELECT t FROM Talla t WHERE t.fechaRegistroTll = :fechaRegistroTll") })
public class Talla implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_talla", unique = true, nullable = false)
	private Integer idTalla;

	@Column(name = "estado_tll", nullable = false)
	private Boolean estadoTll;

	@Column(name = "estatura_tll", nullable = false)
	private double estaturaTll;

	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_registro_tll", nullable = false)
	private Date fechaRegistroTll;

	@Column(name = "peso_tll", nullable = false)
	private double pesoTll;

	@Column(nullable = false, length = 10)
	private String talla;
	
//	@OneToMany(mappedBy = "idTalla")
//    private List<Producto> productoList;

	public Talla() {
	}

	public Integer getIdTalla() {
		return this.idTalla;
	}

	public void setIdTalla(Integer idTalla) {
		this.idTalla = idTalla;
	}

	public Boolean getEstadoTll() {
		return this.estadoTll;
	}

	public void setEstadoTll(Boolean estadoTll) {
		this.estadoTll = estadoTll;
	}

	public double getEstaturaTll() {
		return this.estaturaTll;
	}

	public void setEstaturaTll(double estaturaTll) {
		this.estaturaTll = estaturaTll;
	}

	public Date getFechaRegistroTll() {
		return this.fechaRegistroTll;
	}

	public void setFechaRegistroTll(Date fechaRegistroTll) {
		this.fechaRegistroTll = fechaRegistroTll;
	}

	public double getPesoTll() {
		return this.pesoTll;
	}

	public void setPesoTll(double pesoTll) {
		this.pesoTll = pesoTll;
	}

	public String getTalla() {
		return this.talla;
	}

	public void setTalla(String talla) {
		this.talla = talla;
	}

//	public List<Producto> getProductoList() {
//		return productoList;
//	}
//
//	public void setProductoList(List<Producto> productoList) {
//		this.productoList = productoList;
//	}

	
}
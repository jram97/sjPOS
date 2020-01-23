package sv.com.stjacks.sjpos.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tipo_documento database table.
 * 
 */
@Entity
@Table(name="tipo_documento")
@NamedQueries({
    @NamedQuery(name = "TipoDocumento.findAll", query = "SELECT t FROM TipoDocumento t"),
    @NamedQuery(name = "TipoDocumento.findByIdTipoDocumento", query = "SELECT t FROM TipoDocumento t WHERE t.idTipoDocumento = :idTipoDocumento"),
    @NamedQuery(name = "TipoDocumento.findByNombreTpoDoc", query = "SELECT t FROM TipoDocumento t WHERE t.nombreTpoDoc = :nombreTpoDoc"),
    @NamedQuery(name = "TipoDocumento.findByEstadoTpoDoc", query = "SELECT t FROM TipoDocumento t WHERE t.estadoTpoDoc = :estadoTpoDoc")})
public class TipoDocumento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_tipo_documento", unique=true, nullable=false)
	private Integer idTipoDocumento;

	@Column(name="estado_tpo_doc", nullable=false)
	private Boolean estadoTpoDoc;

	public List<TipoDocumentoTienda> getTipoDocumentoTiendaList() {
		return tipoDocumentoTiendaList;
	}

	public void setTipoDocumentoTiendaList(List<TipoDocumentoTienda> tipoDocumentoTiendaList) {
		this.tipoDocumentoTiendaList = tipoDocumentoTiendaList;
	}

	public List<Venta> getVentaList() {
		return ventaList;
	}

	public void setVentaList(List<Venta> ventaList) {
		this.ventaList = ventaList;
	}

	@Column(name="nombre_tpo_doc", nullable=false, length=100)
	private String nombreTpoDoc;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "idTipoDocumento")
    private List<TipoDocumentoTienda> tipoDocumentoTiendaList;
	
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTipoDocumento")
    private List<Venta> ventaList;

	public TipoDocumento() {
	}

	public Integer getIdTipoDocumento() {
		return this.idTipoDocumento;
	}

	public void setIdTipoDocumento(Integer idTipoDocumento) {
		this.idTipoDocumento = idTipoDocumento;
	}

	public Boolean getEstadoTpoDoc() {
		return this.estadoTpoDoc;
	}

	public void setEstadoTpoDoc(Boolean estadoTpoDoc) {
		this.estadoTpoDoc = estadoTpoDoc;
	}

	public String getNombreTpoDoc() {
		return this.nombreTpoDoc;
	}

	public void setNombreTpoDoc(String nombreTpoDoc) {
		this.nombreTpoDoc = nombreTpoDoc;
	}

}
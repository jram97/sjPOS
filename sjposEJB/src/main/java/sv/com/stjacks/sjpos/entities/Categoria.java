package sv.com.stjacks.sjpos.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the categoria database table.
 * 
 */
@Entity
@NamedQueries({
	@NamedQuery(name="Categoria.findAll", query="SELECT c FROM Categoria c"),
	@NamedQuery(name="Categoria.findById", query="SELECT c FROM Categoria c WHERE c.idCategoria = :idCategoria ")
})
public class Categoria implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_categoria")
	private Integer idCategoria;

	@Column(name="estado_cat")
	private Boolean estadoCat;

	@Temporal(TemporalType.DATE)
	@Column(name="fecha_registro_cat")
	private Date fechaRegistroCat;

	@Column(name="nombre_cat")
	private String nombreCat;

	public Categoria() {
	}

	public Integer getIdCategoria() {
		return this.idCategoria;
	}

	public void setIdCategoria(Integer idCategoria) {
		this.idCategoria = idCategoria;
	}

	public Boolean getEstadoCat() {
		return this.estadoCat;
	}

	public void setEstadoCat(Boolean estadoCat) {
		this.estadoCat = estadoCat;
	}

	public Date getFechaRegistroCat() {
		return this.fechaRegistroCat;
	}

	public void setFechaRegistroCat(Date fechaRegistroCat) {
		this.fechaRegistroCat = fechaRegistroCat;
	}

	public String getNombreCat() {
		return this.nombreCat;
	}

	public void setNombreCat(String nombreCat) {
		this.nombreCat = nombreCat;
	}

}
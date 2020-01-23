package sv.com.stjacks.sjpos.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the pais database table.
 * 
 */
@Entity
@Table(name="pais")
@NamedQueries({
	@NamedQuery(name="Pais.findAll", query="SELECT p FROM Pais p"),
	@NamedQuery(name="Pais.findById", query="SELECT p FROM Pais p where p.idPais = :idPais")
})
public class Pais implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_pais")
	private Integer idPais;

	@Column(name="estado_pais")
	private Boolean estadoPais;

	@Column(name="moneda_pais")
	private String monedaPais;

	@Column(name="nombre_pais")
	private String nombrePais;

	public Pais() {
	}

	public Integer getIdPais() {
		return this.idPais;
	}

	public void setIdPais(Integer idPais) {
		this.idPais = idPais;
	}

	public Boolean getEstadoPais() {
		return this.estadoPais;
	}

	public void setEstadoPais(Boolean estadoPais) {
		this.estadoPais = estadoPais;
	}

	public String getMonedaPais() {
		return this.monedaPais;
	}

	public void setMonedaPais(String monedaPais) {
		this.monedaPais = monedaPais;
	}

	public String getNombrePais() {
		return this.nombrePais;
	}

	public void setNombrePais(String nombrePais) {
		this.nombrePais = nombrePais;
	}

}
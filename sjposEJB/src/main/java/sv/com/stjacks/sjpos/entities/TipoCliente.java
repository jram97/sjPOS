package sv.com.stjacks.sjpos.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tipo_cliente database table.
 * 
 */
@Entity
@Table(name="tipo_cliente")
@NamedQueries({
		@NamedQuery(name="TipoCliente.findAll", query="SELECT t FROM TipoCliente t"),
		@NamedQuery(name="TipoCliente.findById", query="SELECT t FROM TipoCliente t WHERE t.idTipoCliente = :idTipoCliente")
})
public class TipoCliente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_tipo_cliente")
	private Integer idTipoCliente;

	@Column(name="estado_tpo_cli")
	private Boolean estadoTpoCli;

	@Column(name="tipo_cliente")
	private String tipoCliente;

	public TipoCliente() {
	}

	public Integer getIdTipoCliente() {
		return this.idTipoCliente;
	}

	public void setIdTipoCliente(Integer idTipoCliente) {
		this.idTipoCliente = idTipoCliente;
	}

	public Boolean getEstadoTpoCli() {
		return this.estadoTpoCli;
	}

	public void setEstadoTpoCli(Boolean estadoTpoCli) {
		this.estadoTpoCli = estadoTpoCli;
	}

	public String getTipoCliente() {
		return this.tipoCliente;
	}

	public void setTipoCliente(String tipoCliente) {
		this.tipoCliente = tipoCliente;
	}

}
package sv.com.stjacks.sjpos.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the forma_pago_tienda database table.
 * 
 */
@Entity
@Table(name="forma_pago_tienda")
@NamedQueries({
	@NamedQuery(name="FormaPagoTienda.findAll", query="SELECT f FROM FormaPagoTienda f"),
	@NamedQuery(name="FormaPagoTienda.findById", query="SELECT f FROM FormaPagoTienda f WHERE f.idFormaPagoTienda = :idFormaPagoTienda"),
	@NamedQuery(name="FormaPagoTienda.findbyIdTienda", query="SELECT f FROM FormaPagoTienda f WHERE f.idTienda = :idTienda")
})
public class FormaPagoTienda implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_forma_pago_tienda")
	private Integer idFormaPagoTienda;

	@Column(name="id_forma_pago")
	private Integer idFormaPago;

	@Column(name="id_tienda")
	private Integer idTienda;

	public FormaPagoTienda() {
	}

	public Integer getIdFormaPagoTienda() {
		return this.idFormaPagoTienda;
	}

	public void setIdFormaPagoTienda(Integer idFormaPagoTienda) {
		this.idFormaPagoTienda = idFormaPagoTienda;
	}

	public Integer getIdFormaPago() {
		return this.idFormaPago;
	}

	public void setIdFormaPago(Integer idFormaPago) {
		this.idFormaPago = idFormaPago;
	}

	public Integer getIdTienda() {
		return this.idTienda;
	}

	public void setIdTienda(Integer idTienda) {
		this.idTienda = idTienda;
	}

}
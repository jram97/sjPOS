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
	@NamedQuery(name="FormaPagoTienda.findbyIdTienda", query="SELECT f FROM FormaPagoTienda f WHERE f.tienda = :tienda")
})
public class FormaPagoTienda implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_forma_pago_tienda")
	private Integer idFormaPagoTienda;

	@JoinColumn(name="id_forma_pago", referencedColumnName= "id_forma_pago")
	@ManyToOne
	private FormaPago formaPago;

	@JoinColumn(name="id_tienda", referencedColumnName="id_tienda")
	@ManyToOne
	private Tienda tienda;

	public FormaPagoTienda() {
	}

	public Integer getIdFormaPagoTienda() {
		return idFormaPagoTienda;
	}

	public void setIdFormaPagoTienda(Integer idFormaPagoTienda) {
		this.idFormaPagoTienda = idFormaPagoTienda;
	}

	public FormaPago getFormaPago() {
		return formaPago;
	}

	public void setFormaPago(FormaPago formaPago) {
		this.formaPago = formaPago;
	}

	public Tienda getTienda() {
		return tienda;
	}

	public void setTienda(Tienda tienda) {
		this.tienda = tienda;
	}


}
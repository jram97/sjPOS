package sv.com.stjacks.sjpos.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Alex Enrique Lemus Guzmán
 */
@Entity
@Table(name = "forma_pago")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "FormaPago.findAll", query = "SELECT f FROM FormaPago f"),
		@NamedQuery(name = "FormaPago.findByIdFormaPago", query = "SELECT f FROM FormaPago f WHERE f.idFormaPago = :idFormaPago"),
		@NamedQuery(name = "FormaPago.findByFormaPago", query = "SELECT f FROM FormaPago f WHERE f.formaPago = :formaPago"),
		@NamedQuery(name = "FormaPago.findByEstadoFmaPgo", query = "SELECT f FROM FormaPago f WHERE f.estadoFmaPgo = :estadoFmaPgo") })
public class FormaPago implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "id_forma_pago")
	private Integer idFormaPago;

	@Basic(optional = false)
	@Column(name = "forma_pago")
	private String formaPago;

	@Basic(optional = false)
	@Column(name = "estado_fma_pgo")
	private boolean estadoFmaPgo;

	@OneToMany(targetEntity = FormaPagoTienda.class, cascade = CascadeType.ALL, mappedBy = "formaPago")
	private List<FormaPagoTienda> formaPagoTiendaList;

	@OneToMany(targetEntity = Venta.class, cascade = CascadeType.ALL, mappedBy = "formaPago")
	private List<Venta> ventaList;

	public FormaPago() {
	}

	public FormaPago(Integer idFormaPago) {
		this.idFormaPago = idFormaPago;
	}

	public FormaPago(Integer idFormaPago, String formaPago, boolean estadoFmaPgo) {
		this.idFormaPago = idFormaPago;
		this.formaPago = formaPago;
		this.estadoFmaPgo = estadoFmaPgo;
	}

	public Integer getIdFormaPago() {
		return idFormaPago;
	}

	public void setIdFormaPago(Integer idFormaPago) {
		this.idFormaPago = idFormaPago;
	}

	public String getFormaPago() {
		return formaPago;
	}

	public void setFormaPago(String formaPago) {
		this.formaPago = formaPago;
	}

	public boolean getEstadoFmaPgo() {
		return estadoFmaPgo;
	}

	public void setEstadoFmaPgo(boolean estadoFmaPgo) {
		this.estadoFmaPgo = estadoFmaPgo;
	}

	@XmlTransient
	public List<FormaPagoTienda> getFormaPagoTiendaList() {
		return formaPagoTiendaList;
	}

	public void setFormaPagoTiendaList(List<FormaPagoTienda> formaPagoTiendaList) {
		this.formaPagoTiendaList = formaPagoTiendaList;
	}

	@XmlTransient
	public List<Venta> getVentaList() {
		return ventaList;
	}

	public void setVentaList(List<Venta> ventaList) {
		this.ventaList = ventaList;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (idFormaPago != null ? idFormaPago.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof FormaPago)) {
			return false;
		}
		FormaPago other = (FormaPago) object;
		if ((this.idFormaPago == null && other.idFormaPago != null)
				|| (this.idFormaPago != null && !this.idFormaPago.equals(other.idFormaPago))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "entities.FormaPago[ idFormaPago=" + idFormaPago + " ]";
	}

}
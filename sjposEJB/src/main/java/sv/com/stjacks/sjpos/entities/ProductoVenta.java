package sv.com.stjacks.sjpos.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * The persistent class for the producto_venta database table.
 * 
 */
@Entity
@Table(name = "producto_venta")
@NamedQueries({ @NamedQuery(name = "ProductoVenta.findAll", query = "SELECT p FROM ProductoVenta p"),
		@NamedQuery(name = "ProductoVenta.findByIdProductoVenta", query = "SELECT p FROM ProductoVenta p WHERE p.idProductoVenta = :idProductoVenta"),
		@NamedQuery(name = "ProductoVenta.findByCantidadProdVta", query = "SELECT p FROM ProductoVenta p WHERE p.cantidadProdVta = :cantidadProdVta"),
		@NamedQuery(name = "ProductoVenta.findByPrecioProdVta", query = "SELECT p FROM ProductoVenta p WHERE p.precioProdVta = :precioProdVta"),
		@NamedQuery(name = "ProductoVenta.findByDescuentoProdVta", query = "SELECT p FROM ProductoVenta p WHERE p.descuentoProdVta = :descuentoProdVta"),
		@NamedQuery(name = "ProductoVenta.findByEstadoProdVta", query = "SELECT p FROM ProductoVenta p WHERE p.estadoProdVta = :estadoProdVta") })
public class ProductoVenta implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_producto_venta", unique = true, nullable = false)
	private Integer idProductoVenta;

	@Column(name = "cantidad_prod_vta", nullable = false)
	private Integer cantidadProdVta;

	@Column(name = "descuento_prod_vta", nullable = false)
	private double descuentoProdVta;

	@Column(name = "estado_prod_vta", nullable = false)
	private Boolean estadoProdVta;

	@Column(name = "precio_prod_vta", nullable = false)
	private double precioProdVta;

	@JoinColumn(name = "id_producto_tienda", referencedColumnName = "id_producto_tienda", nullable = false)
	@ManyToOne(optional = false)
	private ProductoTienda productoTienda;
	
	@JoinColumn(name = "id_promicion", referencedColumnName = "id_promocion")
	@ManyToOne
	private Promocion promicion;
	
	@JoinColumn(name = "id_venta", referencedColumnName = "id_venta", nullable = false)
	@ManyToOne(optional = false)
	private Venta venta;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "idProductoVenta")
	private List<ProductoCambio> productoCambioList;

	public ProductoVenta() {
	}

	public Integer getIdProductoVenta() {
		return this.idProductoVenta;
	}

	public void setIdProductoVenta(Integer idProductoVenta) {
		this.idProductoVenta = idProductoVenta;
	}

	public Integer getCantidadProdVta() {
		return this.cantidadProdVta;
	}

	public void setCantidadProdVta(Integer cantidadProdVta) {
		this.cantidadProdVta = cantidadProdVta;
	}

	public double getDescuentoProdVta() {
		return this.descuentoProdVta;
	}

	public void setDescuentoProdVta(double descuentoProdVta) {
		this.descuentoProdVta = descuentoProdVta;
	}

	public Boolean getEstadoProdVta() {
		return this.estadoProdVta;
	}

	public void setEstadoProdVta(Boolean estadoProdVta) {
		this.estadoProdVta = estadoProdVta;
	}

	public double getPrecioProdVta() {
		return this.precioProdVta;
	}

	public void setPrecioProdVta(double precioProdVta) {
		this.precioProdVta = precioProdVta;
	}

	public ProductoTienda getIdProductoTienda() {
		return idProductoTienda;
	}

	public void setIdProductoTienda(ProductoTienda idProductoTienda) {
		this.idProductoTienda = idProductoTienda;
	}

	public Promocion getIdPromicion() {
		return idPromicion;
	}

	public void setIdPromicion(Promocion idPromicion) {
		this.idPromicion = idPromicion;
	}

	public Venta getIdVenta() {
		return idVenta;
	}

	public void setIdVenta(Venta idVenta) {
		this.idVenta = idVenta;
	}

	public List<ProductoCambio> getProductoCambioList() {
		return productoCambioList;
	}

	public void setProductoCambioList(List<ProductoCambio> productoCambioList) {
		this.productoCambioList = productoCambioList;
	}

}
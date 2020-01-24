package sv.com.stjacks.sjpos.ejb3;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import sv.com.stjacks.sjpos.entities.ProductoVenta;

/**
 * 
 * @author cchavez
 *
 */

/**
 * Session Bean implementation class ProductoVentaBean
 */
@Stateless
@LocalBean
public class ProductoVentaBean extends GenericDAOJpa<ProductoVenta, Integer> implements ProductoVentaBeanRemote, ProductoVentaBeanLocal {

	public ProductoVentaBean(Class<ProductoVenta> entity) {
		super(entity);
		// TODO Auto-generated constructor stub
	}

}

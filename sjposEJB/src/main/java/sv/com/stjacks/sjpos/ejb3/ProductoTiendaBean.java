package sv.com.stjacks.sjpos.ejb3;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import sv.com.stjacks.sjpos.entities.ProductoTienda;

/**
 * Session Bean implementation class ProductoTiendaBean
 */
@Stateless
@LocalBean
public class ProductoTiendaBean extends GenericDAOJpa<ProductoTienda, Integer> implements ProductoTiendaBeanRemote, ProductoTiendaBeanLocal {

	public ProductoTiendaBean(Class<ProductoTienda> entity) {
		super(entity);
		// TODO Auto-generated constructor stub
	}



}

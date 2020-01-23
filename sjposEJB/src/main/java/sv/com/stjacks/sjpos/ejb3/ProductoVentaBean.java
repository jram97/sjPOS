package sv.com.stjacks.sjpos.ejb3;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;

import sv.com.stjacks.sjpos.entities.ProductoVenta;

/**
 * Session Bean implementation class ProductoVentaBean
 */
@Stateless
@LocalBean
public class ProductoVentaBean extends GenericDAOJpa<ProductoVenta, Integer> implements ProductoVentaBeanRemote, ProductoVentaBeanLocal {

}

package sv.com.stjacks.ejb3;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import sv.com.stjacks.entities.Producto;

/**
 * Session Bean implementation class ProductoBean
 */
@Stateless
public class ProductoBean extends GenericDAO<Producto, Integer> implements ProductoBeanRemote, ProductoBeanLocal {
       
	@PersistenceContext(unitName="sjPOSEJB")
	private EntityManager em;
	
    public ProductoBean() {
        super(Producto.class);
    }

}

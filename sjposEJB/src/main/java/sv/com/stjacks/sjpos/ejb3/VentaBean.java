package sv.com.stjacks.ejb3;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import sv.com.stjacks.entities.Venta;

/**
 * Session Bean implementation class VentaBean
 */
@Stateless
public class VentaBean extends GenericDAO<Venta, Integer> implements VentaBeanRemote, VentaBeanLocal {
	
	@PersistenceContext(unitName="sjPOSEJB")
	private EntityManager em;

    public VentaBean() {
        super(Venta.class);
    }

}

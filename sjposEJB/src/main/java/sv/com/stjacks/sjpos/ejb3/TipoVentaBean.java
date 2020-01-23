package sv.com.stjacks.sjpos.ejb3;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import sv.com.stjacks.sjpos.entities.TipoVenta;

/**
 * Session Bean implementation class TipoVentaBean
 */
@Stateless
@LocalBean
public class TipoVentaBean extends GenericDAOJpa<TipoVenta, Integer> implements TipoVentaBeanRemote, TipoVentaBeanLocal {

	@PersistenceContext(unitName = "sjPOSEJB")
	private EntityManager em;
	
    /**
     * Default constructor. 
     */
    public TipoVentaBean() {
        // TODO Auto-generated constructor stub
    }

}
package sv.com.stjacks.sjpos.ejb3;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import sv.com.stjacks.sjpos.entities.Caja;

/**
 * Session Bean implementation class CajaBean
 */
@Stateless
public class CajaBean extends GenericDAOJpa<Caja, Integer> implements CajaBeanRemote, CajaBeanLocal {
	
    public CajaBean() {
        super(Caja.class);
    }

}

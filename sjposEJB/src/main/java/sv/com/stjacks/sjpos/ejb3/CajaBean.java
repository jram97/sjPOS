package sv.com.stjacks.sjpos.ejb3;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import sv.com.stjacks.sjpos.entities.Caja;

/**
 *
 * @author aguzman
 */
@Stateless
public class CajaBean extends GenericDAOJpa<Caja, Integer> implements CajaBeanLocal {

    @PersistenceContext(unitName = "sjPOSEJBPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CajaFacade() {
        super(Caja.class);
    }
    
}

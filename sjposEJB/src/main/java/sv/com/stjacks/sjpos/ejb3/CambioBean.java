package sv.com.stjacks.sjpos.ejb3;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import sv.com.stjacks.sjpos.entities.Cambio;

/**
 *
 * @author aguzman
 */
@Stateless
public class CambioBean extends GenericDAOJpa<Cambio, Integer> implements CambioFacadeLocal {

    @PersistenceContext(unitName = "sjPOSEJBPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CambioFacade() {
        super(Cambio.class);
    }
    
}

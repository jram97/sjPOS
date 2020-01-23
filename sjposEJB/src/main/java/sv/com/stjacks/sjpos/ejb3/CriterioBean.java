package sv.com.stjacks.sjpos.ejb3;


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import sv.com.stjacks.sjpos.entities.Criterio;
/**
 *
 * @author aguzman
 */
@Stateless
public class CriterioBean extends GenericDAOJpa<Criterio, Integer> implements CriterioFacadeLocal {

    @PersistenceContext(unitName = "sjPOSEJBPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CriterioFacade() {
        super(Criterio.class);
    }
    
}

package sv.com.stjacks.sjpos.ejb3;

import entities.TipoCambio;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author aguzman
 */
@Stateless
public class TipoCambioFacade extends AbstractFacade<TipoCambio> implements TipoCambioFacadeLocal {

    @PersistenceContext(unitName = "sjPOSEJBPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TipoCambioFacade() {
        super(TipoCambio.class);
    }
    
}

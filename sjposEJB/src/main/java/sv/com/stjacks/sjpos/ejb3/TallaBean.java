package sv.com.stjacks.sjpos.ejb3;

import entities.Talla;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author aguzman
 */
@Stateless
public class TallaFacade extends AbstractFacade<Talla> implements TallaFacadeLocal {

    @PersistenceContext(unitName = "sjPOSEJBPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TallaFacade() {
        super(Talla.class);
    }
    
}

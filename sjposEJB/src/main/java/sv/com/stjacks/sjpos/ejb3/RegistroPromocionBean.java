package sv.com.stjacks.sjpos.ejb3;

import entities.RegistroPromocion;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author aguzman
 */
@Stateless
public class RegistroPromocionFacade extends AbstractFacade<RegistroPromocion> implements RegistroPromocionFacadeLocal {

    @PersistenceContext(unitName = "sjPOSEJBPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public RegistroPromocionFacade() {
        super(RegistroPromocion.class);
    }
    
}

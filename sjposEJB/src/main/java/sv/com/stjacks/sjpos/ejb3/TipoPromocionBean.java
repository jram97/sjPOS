package sv.com.stjacks.sjpos.ejb3;

import entities.TipoPromocion;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author aguzman
 */
@Stateless
public class TipoPromocionFacade extends AbstractFacade<TipoPromocion> implements TipoPromocionFacadeLocal {

    @PersistenceContext(unitName = "sjPOSEJBPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TipoPromocionFacade() {
        super(TipoPromocion.class);
    }
    
}

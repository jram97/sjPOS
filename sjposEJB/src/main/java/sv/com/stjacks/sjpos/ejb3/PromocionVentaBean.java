package sv.com.stjacks.sjpos.ejb3;

import entities.PromocionVenta;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author aguzman
 */
@Stateless
public class PromocionVentaFacade extends AbstractFacade<PromocionVenta> implements PromocionVentaFacadeLocal {

    @PersistenceContext(unitName = "sjPOSEJBPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PromocionVentaFacade() {
        super(PromocionVenta.class);
    }
    
}

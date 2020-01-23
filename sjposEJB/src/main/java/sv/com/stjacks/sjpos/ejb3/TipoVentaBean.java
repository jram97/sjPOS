package sv.com.stjacks.sjpos.ejb3;

import entities.TipoVenta;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author aguzman
 */
@Stateless
public class TipoVentaFacade extends AbstractFacade<TipoVenta> implements TipoVentaFacadeLocal {

    @PersistenceContext(unitName = "sjPOSEJBPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TipoVentaFacade() {
        super(TipoVenta.class);
    }
    
}

package sv.com.stjacks.sjpos.ejb3;

import entities.ProductoCambio;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author aguzman
 */
@Stateless
public class ProductoCambioFacade extends AbstractFacade<ProductoCambio> implements ProductoCambioFacadeLocal {

    @PersistenceContext(unitName = "sjPOSEJBPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ProductoCambioFacade() {
        super(ProductoCambio.class);
    }
    
}

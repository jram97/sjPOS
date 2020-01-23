package sv.com.stjacks.sjpos.ejb3;

import entities.ProductoPromocion;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author aguzman
 */
@Stateless
public class ProductoPromocionFacade extends AbstractFacade<ProductoPromocion> implements ProductoPromocionFacadeLocal {

    @PersistenceContext(unitName = "sjPOSEJBPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ProductoPromocionFacade() {
        super(ProductoPromocion.class);
    }
    
}

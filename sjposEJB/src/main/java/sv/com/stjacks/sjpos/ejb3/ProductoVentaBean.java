package sv.com.stjacks.sjpos.ejb3;

import entities.ProductoVenta;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author aguzman
 */
@Stateless
public class ProductoVentaFacade extends AbstractFacade<ProductoVenta> implements ProductoVentaFacadeLocal {

    @PersistenceContext(unitName = "sjPOSEJBPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ProductoVentaFacade() {
        super(ProductoVenta.class);
    }
    
}

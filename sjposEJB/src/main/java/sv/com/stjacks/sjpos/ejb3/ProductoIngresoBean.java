package sv.com.stjacks.sjpos.ejb3;

import entities.ProductoIngreso;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author aguzman
 */
@Stateless
public class ProductoIngresoFacade extends AbstractFacade<ProductoIngreso> implements ProductoIngresoFacadeLocal {

    @PersistenceContext(unitName = "sjPOSEJBPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ProductoIngresoFacade() {
        super(ProductoIngreso.class);
    }
    
}

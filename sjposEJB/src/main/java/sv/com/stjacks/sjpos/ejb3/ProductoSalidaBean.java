package sv.com.stjacks.sjpos.ejb3;

import entities.ProductoSalida;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author aguzman
 */
@Stateless
public class ProductoSalidaFacade extends AbstractFacade<ProductoSalida> implements ProductoSalidaFacadeLocal {

    @PersistenceContext(unitName = "sjPOSEJBPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ProductoSalidaFacade() {
        super(ProductoSalida.class);
    }
    
}

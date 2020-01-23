package sv.com.stjacks.sjpos.ejb3;

import entities.ProductoTienda;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author aguzman
 */
@Stateless
public class ProductoTiendaFacade extends AbstractFacade<ProductoTienda> implements ProductoTiendaFacadeLocal {

    @PersistenceContext(unitName = "sjPOSEJBPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ProductoTiendaFacade() {
        super(ProductoTienda.class);
    }
    
}

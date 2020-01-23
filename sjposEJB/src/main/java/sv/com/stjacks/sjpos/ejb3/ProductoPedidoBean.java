package sv.com.stjacks.sjpos.ejb3;

import entities.ProductoPedido;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author aguzman
 */
@Stateless
public class ProductoPedidoFacade extends AbstractFacade<ProductoPedido> implements ProductoPedidoFacadeLocal {

    @PersistenceContext(unitName = "sjPOSEJBPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ProductoPedidoFacade() {
        super(ProductoPedido.class);
    }
    
}

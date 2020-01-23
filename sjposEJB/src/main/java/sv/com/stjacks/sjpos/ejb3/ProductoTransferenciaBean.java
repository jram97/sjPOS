package sv.com.stjacks.sjpos.ejb3;

import entities.ProductoTransferencia;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author aguzman
 */
@Stateless
public class ProductoTransferenciaFacade extends AbstractFacade<ProductoTransferencia> implements ProductoTransferenciaFacadeLocal {

    @PersistenceContext(unitName = "sjPOSEJBPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ProductoTransferenciaFacade() {
        super(ProductoTransferencia.class);
    }
    
}

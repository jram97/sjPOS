package sv.com.stjacks.sjpos.ejb3;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import sv.com.stjacks.sjpos.entities.ClientePromocion;

/**
 *
 * @author aguzman
 */
@Stateless
public class ClientePromocionBean extends GenericDAOJpa<ClientePromocion, Integer> implements ClientePromocionFacadeLocal {

    @PersistenceContext(unitName = "sjPOSEJBPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ClientePromocionFacade() {
        super(ClientePromocion.class);
    }
    
}

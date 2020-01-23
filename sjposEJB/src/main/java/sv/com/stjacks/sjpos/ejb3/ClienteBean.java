package sv.com.stjacks.sjpos.ejb3;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import sv.com.stjacks.sjpos.entities.Cliente;

/**
 *
 * @author aguzman
 */
@Stateless
public class ClienteBean extends GenericDAOJpa<Cliente, Integer> implements ClienteFacadeLocal {

    @PersistenceContext(unitName = "sjPOSEJBPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ClienteFacade() {
        super(Cliente.class);
    }
    
}

package sv.com.stjacks.sjpos.ejb3;


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import sv.com.stjacks.sjpos.entities.FormaPago;

/**
 *
 * @author aguzman
 */
@Stateless
public class FormaPagoBean extends GenericDAOJpa<FormaPago, Integer> implements FormaPagoFacadeLocal {

    @PersistenceContext(unitName = "sjPOSEJBPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public FormaPagoFacade() {
        super(FormaPago.class);
    }
    
}
package sv.com.stjacks.sjpos.ejb3;


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import sv.com.stjacks.sjpos.entities.FormaPagoTienda;

/**
 *
 * @author aguzman
 */
@Stateless
public class FormaPagoTiendaBean extends GenericDAOJpa<FormaPagoTienda, Integer> implements FormaPagoTiendaFacadeLocal {

    @PersistenceContext(unitName = "sjPOSEJBPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public FormaPagoTiendaFacade() {
        super(FormaPagoTienda.class);
    }
    
}

package sv.com.stjacks.ejb3;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import sv.com.stjacks.entities.FormaPago;

/**
 * Session Bean implementation class FormaPagoBean
 */
@Stateless
public class FormaPagoBean extends GenericDAO<FormaPago, Integer> implements FormaPagoBeanRemote, FormaPagoBeanLocal {

	@PersistenceContext(unitName="sjPOSEJB")
	private EntityManager em;
    
    public FormaPagoBean() {
        super(FormaPago.class);
    }

}

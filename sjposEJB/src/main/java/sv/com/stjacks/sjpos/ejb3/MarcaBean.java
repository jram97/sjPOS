package sv.com.stjacks.ejb3;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import sv.com.stjacks.entities.Marca;

/**
 * Session Bean implementation class MarcaBean
 */
@Stateless
public class MarcaBean extends GenericDAO<Marca, Integer> implements MarcaBeanRemote, MarcaBeanLocal {

	@PersistenceContext(unitName= "sjPOSEJB")
	private EntityManager em;
	
    public MarcaBean() {
    	super(Marca.class);
    }

}
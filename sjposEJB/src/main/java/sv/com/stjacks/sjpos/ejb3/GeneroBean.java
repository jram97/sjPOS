package sv.com.stjacks.sjpos.ejb3;

import javax.ejb.Local;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;

import sv.com.stjacks.sjpos.entities.Genero;

/**
 * Session Bean implementation class GeneroBean
 */
@Stateless
@Local(GenericDAOJpa.class)
@LocalBean
public class GeneroBean extends GenericDAOJpa<Genero, Integer> implements GeneroBeanRemote, GeneroBeanLocal {

	@PersistenceContext(unitName = "sjPOSEJB", type = PersistenceContextType.EXTENDED)
	private EntityManager em;
	
    /**
     * Default constructor. 
     */
    public GeneroBean() {
        // TODO Auto-generated constructor stub
    }

}

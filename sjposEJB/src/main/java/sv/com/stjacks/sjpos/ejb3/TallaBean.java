package sv.com.stjacks.sjpos.ejb3;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;

import sv.com.stjacks.sjpos.entities.Talla;

/**
 * 
 * @author cchavez
 *
 */

/**
 * Session Bean implementation class TallaBean
 */
@Stateless
@LocalBean
public class TallaBean extends GenericDAOJpa<Talla, Integer> implements TallaBeanRemote, TallaBeanLocal {

	public TallaBean() {
		super(Talla.class);
		// TODO Auto-generated constructor stub
	}

}

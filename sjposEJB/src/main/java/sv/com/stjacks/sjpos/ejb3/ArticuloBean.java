package sv.com.stjacks.sjpos.ejb3;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import sv.com.stjacks.sjpos.entities.Articulo;

/**
 * Session Bean implementation class ArticuloBean
 */
@Stateless
@LocalBean
public class ArticuloBean extends GenericDAOJpa<Articulo, Integer> implements ArticuloBeanRemote, ArticuloBeanLocal {

	public ArticuloBean(Class<Articulo> entity) {
		super(entity);
		// TODO Auto-generated constructor stub
	}


}

package sv.com.stjacks.sjpos.ejb3;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import sv.com.stjacks.sjpos.entities.Categoria;

/**
 * Session Bean implementation class CategoriaBean
 */
@Stateless
@LocalBean
public class CategoriaBean extends  GenericDAOJpa<Categoria, Integer> implements CategoriaBeanRemote, CategoriaBeanLocal {

	public CategoriaBean(Class<Categoria> entity) {
		super(entity);
		// TODO Auto-generated constructor stub
	}


}

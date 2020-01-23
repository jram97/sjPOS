package sv.com.stjacks.sjpos.ejb3;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import sv.com.stjacks.sjpos.entities.Articulo;

/**
 * Session Bean implementation class ArticuloBean
 */
@Stateless
@LocalBean
public class ArticuloBean extends GenericDAOJpa<Articulo, Integer> implements ArticuloBeanRemote, ArticuloBeanLocal {


    @PersistenceContext(unitName = "sjPOSEJBPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ArticuloFacade() {
        super(Articulo.class);
    }

	@Override
	public void create(Articulo articulo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void edit(Articulo articulo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(Articulo articulo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Articulo find(Object id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Articulo> findRange(int[] range) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return 0;
	}

}

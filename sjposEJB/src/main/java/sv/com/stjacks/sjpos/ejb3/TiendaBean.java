package sv.com.stjacks.sjpos.ejb3;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;

import sv.com.stjacks.sjpos.entities.Tienda;;

/**
 * Session Bean implementation class TiendaBean
 */
@Stateless
@LocalBean
public class TiendaBean extends GenericDAOJpa<Tienda, Integer> implements TiendaBeanRemote, TiendaBeanLocal {

}

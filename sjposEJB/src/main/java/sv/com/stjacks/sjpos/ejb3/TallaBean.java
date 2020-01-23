package sv.com.stjacks.sjpos.ejb3;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;

import sv.com.stjacks.sjpos.entities.Talla;

/**
 * Session Bean implementation class TallaBean
 */
@Stateless
@LocalBean
public class TallaBean extends GenericDAOJpa<Talla, Integer> implements TallaBeanRemote, TallaBeanLocal {

}
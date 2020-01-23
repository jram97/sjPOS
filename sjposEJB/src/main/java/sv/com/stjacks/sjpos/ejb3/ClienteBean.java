package sv.com.stjacks.sjpos.ejb3;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;

import sv.com.stjacks.sjpos.entities.Cliente;;

/**
 * Session Bean implementation class ClienteBean
 */
@Stateless
@LocalBean
public class ClienteBean extends GenericDAOJpa<Cliente, Integer> implements ClienteBeanRemote, ClienteBeanLocal {

}

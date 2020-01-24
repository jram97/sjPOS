package sv.com.stjacks.sjpos.ejb3;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import sv.com.stjacks.sjpos.entities.Cliente;;

/**
 * 
 * @author cchavez
 *
 */

/**
 * Session Bean implementation class ClienteBean
 */
@Stateless
@LocalBean
public class ClienteBean extends GenericDAOJpa<Cliente, Integer> implements ClienteBeanRemote, ClienteBeanLocal {

	public ClienteBean(Class<Cliente> entity) {
		super(entity);
		// TODO Auto-generated constructor stub
	}

}
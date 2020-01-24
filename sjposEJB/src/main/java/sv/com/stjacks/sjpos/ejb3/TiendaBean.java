package sv.com.stjacks.sjpos.ejb3;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import sv.com.stjacks.sjpos.entities.Tienda;;

/**
 * 
 * @author cchavez
 *
 */

/**
 * Session Bean implementation class TiendaBean
 */
@Stateless
@LocalBean
public class TiendaBean extends GenericDAOJpa<Tienda, Integer> implements TiendaBeanRemote, TiendaBeanLocal {

}

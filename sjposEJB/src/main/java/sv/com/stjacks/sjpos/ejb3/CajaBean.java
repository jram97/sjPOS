package sv.com.stjacks.sjpos.ejb3;

import javax.ejb.Stateless;

import sv.com.stjacks.sjpos.entities.Caja;

/**
*
* @author Alex Enrique Lemus Guzm�n
*/
@Stateless
public class CajaBean extends GenericDAOJpa<Caja, Integer> implements CajaBeanRemote, CajaBeanLocal {

	public CajaBean(Class<Caja> entity) {
		super(entity);
		// TODO Auto-generated constructor stub
	}
	

}

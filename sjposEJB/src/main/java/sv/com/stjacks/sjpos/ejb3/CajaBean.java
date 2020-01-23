package sv.com.stjacks.sjpos.ejb3;

import javax.ejb.Stateless;

import sv.com.stjacks.sjpos.entities.Caja;

/**
*
* @author Alex Enrique Lemus Guzmán
*/
@Stateless
public class CajaBean extends GenericDAOJpa<Caja, Integer> implements CajaBeanRemote, CajaBeanLocal {
	
    public CajaBean() {
        
    }

}

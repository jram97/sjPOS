package sv.com.stjacks.sjpos.ejb3;

import javax.ejb.Stateless;

import sv.com.stjacks.sjpos.entities.Venta;
/**
*
* @author Alex Enrique Lemus Guzmán
*/
@Stateless
public class VentaBean extends GenericDAOJpa<Venta, Integer> implements VentaBeanRemote, VentaBeanLocal {

    public VentaBean() {
        
    }

}

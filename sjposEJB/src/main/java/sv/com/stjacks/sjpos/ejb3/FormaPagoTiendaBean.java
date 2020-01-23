package sv.com.stjacks.sjpos.ejb3;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import sv.com.stjacks.sjpos.entities.FormaPagoTienda;

/**
 * Session Bean implementation class FormaPagoTiendaBean
 */
@Stateless
@LocalBean
public class FormaPagoTiendaBean extends GenericDAOJpa <FormaPagoTienda, Integer> implements FormaPagoTiendaBeanRemote, FormaPagoTiendaBeanLocal {

    /**
     * Default constructor. 
     */
    public FormaPagoTiendaBean() {
        // TODO Auto-generated constructor stub
    }
    

}

package sv.com.stjacks.sjpos.ejb3;

import javax.ejb.Stateless;

import sv.com.stjacks.sjpos.entities.FormaPago;
/**
*
* @author Alex Enrique Lemus Guzmán
*/
@Stateless
public class FormaPagoBean extends GenericDAOJpa<FormaPago, Integer> implements FormaPagoBeanRemote, FormaPagoBeanLocal {

	public FormaPagoBean(Class<FormaPago> entity) {
		super(entity);
		// TODO Auto-generated constructor stub
	}
    

}

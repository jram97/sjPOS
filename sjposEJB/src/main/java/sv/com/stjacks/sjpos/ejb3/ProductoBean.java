package sv.com.stjacks.sjpos.ejb3;

import javax.ejb.Stateless;

import sv.com.stjacks.sjpos.entities.Producto;
/**
*
* @author Alex Enrique Lemus Guzm�n
*/
@Stateless
public class ProductoBean extends GenericDAOJpa<Producto, Integer> implements ProductoBeanRemote, ProductoBeanLocal {

	public ProductoBean(Class<Producto> entity) {
		super(entity);
		// TODO Auto-generated constructor stub
	}


}

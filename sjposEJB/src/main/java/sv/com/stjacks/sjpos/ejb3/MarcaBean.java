package sv.com.stjacks.sjpos.ejb3;

import javax.ejb.Stateless;

import sv.com.stjacks.sjpos.entities.Marca;
/**
*
* @author Alex Enrique Lemus Guzmán
*/
@Stateless
public class MarcaBean extends GenericDAOJpa<Marca, Integer> implements MarcaBeanRemote, MarcaBeanLocal {

	public MarcaBean(Class<Marca> entity) {
		super(entity);
		// TODO Auto-generated constructor stub
	}


}
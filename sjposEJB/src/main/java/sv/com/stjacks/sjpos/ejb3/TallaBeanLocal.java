package sv.com.stjacks.sjpos.ejb3;

import javax.ejb.Local;

import sv.com.stjacks.sjpos.dao.GenericDAO;
import sv.com.stjacks.sjpos.entities.Talla;

@Local
public interface TallaBeanLocal extends GenericDAO<Talla, Integer>{
	
}

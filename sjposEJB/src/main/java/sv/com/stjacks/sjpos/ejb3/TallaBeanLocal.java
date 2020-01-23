package sv.com.stjacks.sjpos.ejb3;

import entities.Talla;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author aguzman
 */
@Local
public interface TallaFacadeLocal {

    void create(Talla talla);

    void edit(Talla talla);

    void remove(Talla talla);

    Talla find(Object id);

    List<Talla> findAll();

    List<Talla> findRange(int[] range);

    int count();
    
}

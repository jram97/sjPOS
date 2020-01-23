package sv.com.stjacks.sjpos.ejb3;

import java.util.List;
import javax.ejb.Local;

import sv.com.stjacks.sjpos.entities.Cambio;

/**
 *
 * @author aguzman
 */
@Local
public interface CambioBeanLocal {

    void create(Cambio cambio);

    void edit(Cambio cambio);

    void remove(Cambio cambio);

    Cambio find(Object id);

    List<Cambio> findAll();

    List<Cambio> findRange(int[] range);

    int count();
    
}

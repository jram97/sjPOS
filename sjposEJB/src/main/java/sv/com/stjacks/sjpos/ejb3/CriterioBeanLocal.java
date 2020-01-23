package sv.com.stjacks.sjpos.ejb3;


import java.util.List;
import javax.ejb.Local;

import sv.com.stjacks.sjpos.entities.Criterio;

/**
 *
 * @author aguzman
 */
@Local
public interface CriterioBeanLocal {

    void create(Criterio criterio);

    void edit(Criterio criterio);

    void remove(Criterio criterio);

    Criterio find(Object id);

    List<Criterio> findAll();

    List<Criterio> findRange(int[] range);

    int count();
    
}

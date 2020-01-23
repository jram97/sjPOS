package sv.com.stjacks.sjpos.ejb3;

import java.util.List;
import javax.ejb.Local;

import sv.com.stjacks.sjpos.entities.Caja;

/**
 *
 * @author aguzman
 */
@Local
public interface CajaBeanLocal {

    void create(Caja caja);

    void edit(Caja caja);

    void remove(Caja caja);

    Caja find(Object id);

    List<Caja> findAll();

    List<Caja> findRange(int[] range);

    int count();
    
}

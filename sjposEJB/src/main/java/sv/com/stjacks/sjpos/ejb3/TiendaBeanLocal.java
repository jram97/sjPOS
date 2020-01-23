package sv.com.stjacks.sjpos.ejb3;

import entities.Tienda;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author aguzman
 */
@Local
public interface TiendaFacadeLocal {

    void create(Tienda tienda);

    void edit(Tienda tienda);

    void remove(Tienda tienda);

    Tienda find(Object id);

    List<Tienda> findAll();

    List<Tienda> findRange(int[] range);

    int count();
    
}

package sv.com.stjacks.sjpos.ejb3;

import entities.Salida;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author aguzman
 */
@Local
public interface SalidaFacadeLocal {

    void create(Salida salida);

    void edit(Salida salida);

    void remove(Salida salida);

    Salida find(Object id);

    List<Salida> findAll();

    List<Salida> findRange(int[] range);

    int count();
    
}

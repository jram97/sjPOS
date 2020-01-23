package sv.com.stjacks.sjpos.ejb3;

import entities.Parametro;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author aguzman
 */
@Local
public interface ParametroFacadeLocal {

    void create(Parametro parametro);

    void edit(Parametro parametro);

    void remove(Parametro parametro);

    Parametro find(Object id);

    List<Parametro> findAll();

    List<Parametro> findRange(int[] range);

    int count();
    
}

package sv.com.stjacks.sjpos.ejb3;

import entities.PaisParametro;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author aguzman
 */
@Local
public interface PaisParametroFacadeLocal {

    void create(PaisParametro paisParametro);

    void edit(PaisParametro paisParametro);

    void remove(PaisParametro paisParametro);

    PaisParametro find(Object id);

    List<PaisParametro> findAll();

    List<PaisParametro> findRange(int[] range);

    int count();
    
}

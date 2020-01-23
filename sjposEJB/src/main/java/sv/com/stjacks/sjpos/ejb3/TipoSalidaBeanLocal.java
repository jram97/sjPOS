package sv.com.stjacks.sjpos.ejb3;

import entities.TipoSalida;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author aguzman
 */
@Local
public interface TipoSalidaFacadeLocal {

    void create(TipoSalida tipoSalida);

    void edit(TipoSalida tipoSalida);

    void remove(TipoSalida tipoSalida);

    TipoSalida find(Object id);

    List<TipoSalida> findAll();

    List<TipoSalida> findRange(int[] range);

    int count();
    
}

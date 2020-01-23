package sv.com.stjacks.sjpos.ejb3;

import entities.TipoPromocion;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author aguzman
 */
@Local
public interface TipoPromocionFacadeLocal {

    void create(TipoPromocion tipoPromocion);

    void edit(TipoPromocion tipoPromocion);

    void remove(TipoPromocion tipoPromocion);

    TipoPromocion find(Object id);

    List<TipoPromocion> findAll();

    List<TipoPromocion> findRange(int[] range);

    int count();
    
}

package sv.com.stjacks.sjpos.ejb3;

import entities.RegistroPromocion;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author aguzman
 */
@Local
public interface RegistroPromocionFacadeLocal {

    void create(RegistroPromocion registroPromocion);

    void edit(RegistroPromocion registroPromocion);

    void remove(RegistroPromocion registroPromocion);

    RegistroPromocion find(Object id);

    List<RegistroPromocion> findAll();

    List<RegistroPromocion> findRange(int[] range);

    int count();
    
}

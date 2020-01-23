package sv.com.stjacks.sjpos.ejb3;

import entities.Promocion;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author aguzman
 */
@Local
public interface PromocionFacadeLocal {

    void create(Promocion promocion);

    void edit(Promocion promocion);

    void remove(Promocion promocion);

    Promocion find(Object id);

    List<Promocion> findAll();

    List<Promocion> findRange(int[] range);

    int count();
    
}

package sv.com.stjacks.sjpos.ejb3;

import entities.Ingreso;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author aguzman
 */
@Local
public interface IngresoFacadeLocal {

    void create(Ingreso ingreso);

    void edit(Ingreso ingreso);

    void remove(Ingreso ingreso);

    Ingreso find(Object id);

    List<Ingreso> findAll();

    List<Ingreso> findRange(int[] range);

    int count();
    
}

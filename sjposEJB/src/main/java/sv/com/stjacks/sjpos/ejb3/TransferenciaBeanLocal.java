package sv.com.stjacks.sjpos.ejb3;

import entities.Transferencia;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author aguzman
 */
@Local
public interface TransferenciaFacadeLocal {

    void create(Transferencia transferencia);

    void edit(Transferencia transferencia);

    void remove(Transferencia transferencia);

    Transferencia find(Object id);

    List<Transferencia> findAll();

    List<Transferencia> findRange(int[] range);

    int count();
    
}

package sv.com.stjacks.sjpos.ejb3;

import entities.TipoCambio;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author aguzman
 */
@Local
public interface TipoCambioFacadeLocal {

    void create(TipoCambio tipoCambio);

    void edit(TipoCambio tipoCambio);

    void remove(TipoCambio tipoCambio);

    TipoCambio find(Object id);

    List<TipoCambio> findAll();

    List<TipoCambio> findRange(int[] range);

    int count();
    
}

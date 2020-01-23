package sv.com.stjacks.sjpos.ejb3;

import java.util.List;
import javax.ejb.Local;

import sv.com.stjacks.sjpos.entities.ClientePromocion;

/**
 *
 * @author aguzman
 */
@Local
public interface ClientePromocionBeanLocal {

    void create(ClientePromocion clientePromocion);

    void edit(ClientePromocion clientePromocion);

    void remove(ClientePromocion clientePromocion);

    ClientePromocion find(Object id);

    List<ClientePromocion> findAll();

    List<ClientePromocion> findRange(int[] range);

    int count();
    
}

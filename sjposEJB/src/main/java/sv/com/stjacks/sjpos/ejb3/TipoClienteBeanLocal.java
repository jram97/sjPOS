package sv.com.stjacks.sjpos.ejb3;

import entities.TipoCliente;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author aguzman
 */
@Local
public interface TipoClienteFacadeLocal {

    void create(TipoCliente tipoCliente);

    void edit(TipoCliente tipoCliente);

    void remove(TipoCliente tipoCliente);

    TipoCliente find(Object id);

    List<TipoCliente> findAll();

    List<TipoCliente> findRange(int[] range);

    int count();
    
}

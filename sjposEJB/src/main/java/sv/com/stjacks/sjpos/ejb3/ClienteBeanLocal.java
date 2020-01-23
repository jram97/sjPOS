package sv.com.stjacks.sjpos.ejb3;

import java.util.List;
import javax.ejb.Local;

import sv.com.stjacks.sjpos.entities.Cliente;

/**
 *
 * @author aguzman
 */
@Local
public interface ClienteBeanLocal {

    void create(Cliente cliente);

    void edit(Cliente cliente);

    void remove(Cliente cliente);

    Cliente find(Object id);

    List<Cliente> findAll();

    int count();
    
}

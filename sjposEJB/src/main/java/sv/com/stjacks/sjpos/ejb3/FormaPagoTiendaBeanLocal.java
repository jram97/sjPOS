package sv.com.stjacks.sjpos.ejb3;


import java.util.List;
import javax.ejb.Local;

import sv.com.stjacks.sjpos.entities.FormaPagoTienda;

/**
 *
 * @author aguzman
 */
@Local
public interface FormaPagoTiendaBeanLocal {

    void create(FormaPagoTienda formaPagoTienda);

    void edit(FormaPagoTienda formaPagoTienda);

    void remove(FormaPagoTienda formaPagoTienda);

    FormaPagoTienda find(Object id);

    List<FormaPagoTienda> findAll();

    List<FormaPagoTienda> findRange(int[] range);

    int count();
    
}

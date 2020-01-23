package sv.com.stjacks.sjpos.ejb3;


import java.util.List;
import javax.ejb.Local;

import sv.com.stjacks.sjpos.entities.FormaPago;

/**
 *
 * @author aguzman
 */
@Local
public interface FormaPagoBeanLocal {

    void create(FormaPago formaPago);

    void edit(FormaPago formaPago);

    void remove(FormaPago formaPago);

    FormaPago find(Object id);

    List<FormaPago> findAll();

    List<FormaPago> findRange(int[] range);

    int count();
    
}

package sv.com.stjacks.sjpos.ejb3;

import entities.ProductoCambio;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author aguzman
 */
@Local
public interface ProductoCambioFacadeLocal {

    void create(ProductoCambio productoCambio);

    void edit(ProductoCambio productoCambio);

    void remove(ProductoCambio productoCambio);

    ProductoCambio find(Object id);

    List<ProductoCambio> findAll();

    List<ProductoCambio> findRange(int[] range);

    int count();
    
}

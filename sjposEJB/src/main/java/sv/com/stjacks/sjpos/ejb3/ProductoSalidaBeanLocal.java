package sv.com.stjacks.sjpos.ejb3;

import entities.ProductoSalida;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author aguzman
 */
@Local
public interface ProductoSalidaFacadeLocal {

    void create(ProductoSalida productoSalida);

    void edit(ProductoSalida productoSalida);

    void remove(ProductoSalida productoSalida);

    ProductoSalida find(Object id);

    List<ProductoSalida> findAll();

    List<ProductoSalida> findRange(int[] range);

    int count();
    
}

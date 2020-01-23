package sv.com.stjacks.sjpos.ejb3;

import entities.ProductoTienda;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author aguzman
 */
@Local
public interface ProductoTiendaFacadeLocal {

    void create(ProductoTienda productoTienda);

    void edit(ProductoTienda productoTienda);

    void remove(ProductoTienda productoTienda);

    ProductoTienda find(Object id);

    List<ProductoTienda> findAll();

    List<ProductoTienda> findRange(int[] range);

    int count();
    
}

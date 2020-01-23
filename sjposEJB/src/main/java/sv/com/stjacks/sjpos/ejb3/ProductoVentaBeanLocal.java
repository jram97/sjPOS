package sv.com.stjacks.sjpos.ejb3;

import entities.ProductoVenta;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author aguzman
 */
@Local
public interface ProductoVentaFacadeLocal {

    void create(ProductoVenta productoVenta);

    void edit(ProductoVenta productoVenta);

    void remove(ProductoVenta productoVenta);

    ProductoVenta find(Object id);

    List<ProductoVenta> findAll();

    List<ProductoVenta> findRange(int[] range);

    int count();
    
}

package sv.com.stjacks.sjpos.ejb3;

import entities.ProductoPromocion;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author aguzman
 */
@Local
public interface ProductoPromocionFacadeLocal {

    void create(ProductoPromocion productoPromocion);

    void edit(ProductoPromocion productoPromocion);

    void remove(ProductoPromocion productoPromocion);

    ProductoPromocion find(Object id);

    List<ProductoPromocion> findAll();

    List<ProductoPromocion> findRange(int[] range);

    int count();
    
}

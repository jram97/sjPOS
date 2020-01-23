package sv.com.stjacks.sjpos.ejb3;

import entities.ProductoIngreso;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author aguzman
 */
@Local
public interface ProductoIngresoFacadeLocal {

    void create(ProductoIngreso productoIngreso);

    void edit(ProductoIngreso productoIngreso);

    void remove(ProductoIngreso productoIngreso);

    ProductoIngreso find(Object id);

    List<ProductoIngreso> findAll();

    List<ProductoIngreso> findRange(int[] range);

    int count();
    
}

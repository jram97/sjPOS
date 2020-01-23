package sv.com.stjacks.sjpos.ejb3;

import entities.ProductoPedido;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author aguzman
 */
@Local
public interface ProductoPedidoFacadeLocal {

    void create(ProductoPedido productoPedido);

    void edit(ProductoPedido productoPedido);

    void remove(ProductoPedido productoPedido);

    ProductoPedido find(Object id);

    List<ProductoPedido> findAll();

    List<ProductoPedido> findRange(int[] range);

    int count();
    
}

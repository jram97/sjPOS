package sv.com.stjacks.sjpos.ejb3;

import entities.ProductoTransferencia;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author aguzman
 */
@Local
public interface ProductoTransferenciaFacadeLocal {

    void create(ProductoTransferencia productoTransferencia);

    void edit(ProductoTransferencia productoTransferencia);

    void remove(ProductoTransferencia productoTransferencia);

    ProductoTransferencia find(Object id);

    List<ProductoTransferencia> findAll();

    List<ProductoTransferencia> findRange(int[] range);

    int count();
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

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

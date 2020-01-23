/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

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

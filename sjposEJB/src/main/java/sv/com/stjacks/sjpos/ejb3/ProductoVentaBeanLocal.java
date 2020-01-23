/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

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

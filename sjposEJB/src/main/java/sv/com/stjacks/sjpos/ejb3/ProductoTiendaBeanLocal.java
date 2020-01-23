/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

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

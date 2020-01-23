/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

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

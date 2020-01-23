/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import entities.ProductoCambio;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author aguzman
 */
@Local
public interface ProductoCambioFacadeLocal {

    void create(ProductoCambio productoCambio);

    void edit(ProductoCambio productoCambio);

    void remove(ProductoCambio productoCambio);

    ProductoCambio find(Object id);

    List<ProductoCambio> findAll();

    List<ProductoCambio> findRange(int[] range);

    int count();
    
}

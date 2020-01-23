/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import entities.FormaPagoTienda;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author aguzman
 */
@Local
public interface FormaPagoTiendaFacadeLocal {

    void create(FormaPagoTienda formaPagoTienda);

    void edit(FormaPagoTienda formaPagoTienda);

    void remove(FormaPagoTienda formaPagoTienda);

    FormaPagoTienda find(Object id);

    List<FormaPagoTienda> findAll();

    List<FormaPagoTienda> findRange(int[] range);

    int count();
    
}

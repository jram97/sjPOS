/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import entities.ClientePromocion;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author aguzman
 */
@Local
public interface ClientePromocionFacadeLocal {

    void create(ClientePromocion clientePromocion);

    void edit(ClientePromocion clientePromocion);

    void remove(ClientePromocion clientePromocion);

    ClientePromocion find(Object id);

    List<ClientePromocion> findAll();

    List<ClientePromocion> findRange(int[] range);

    int count();
    
}

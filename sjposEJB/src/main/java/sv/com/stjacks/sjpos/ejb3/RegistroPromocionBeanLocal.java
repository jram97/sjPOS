/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import entities.RegistroPromocion;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author aguzman
 */
@Local
public interface RegistroPromocionFacadeLocal {

    void create(RegistroPromocion registroPromocion);

    void edit(RegistroPromocion registroPromocion);

    void remove(RegistroPromocion registroPromocion);

    RegistroPromocion find(Object id);

    List<RegistroPromocion> findAll();

    List<RegistroPromocion> findRange(int[] range);

    int count();
    
}

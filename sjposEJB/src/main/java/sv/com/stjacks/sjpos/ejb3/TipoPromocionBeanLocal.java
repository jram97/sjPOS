/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import entities.TipoPromocion;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author aguzman
 */
@Local
public interface TipoPromocionFacadeLocal {

    void create(TipoPromocion tipoPromocion);

    void edit(TipoPromocion tipoPromocion);

    void remove(TipoPromocion tipoPromocion);

    TipoPromocion find(Object id);

    List<TipoPromocion> findAll();

    List<TipoPromocion> findRange(int[] range);

    int count();
    
}

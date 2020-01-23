/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import entities.Cambio;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author aguzman
 */
@Local
public interface CambioFacadeLocal {

    void create(Cambio cambio);

    void edit(Cambio cambio);

    void remove(Cambio cambio);

    Cambio find(Object id);

    List<Cambio> findAll();

    List<Cambio> findRange(int[] range);

    int count();
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import entities.Salida;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author aguzman
 */
@Local
public interface SalidaFacadeLocal {

    void create(Salida salida);

    void edit(Salida salida);

    void remove(Salida salida);

    Salida find(Object id);

    List<Salida> findAll();

    List<Salida> findRange(int[] range);

    int count();
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import entities.Transferencia;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author aguzman
 */
@Local
public interface TransferenciaFacadeLocal {

    void create(Transferencia transferencia);

    void edit(Transferencia transferencia);

    void remove(Transferencia transferencia);

    Transferencia find(Object id);

    List<Transferencia> findAll();

    List<Transferencia> findRange(int[] range);

    int count();
    
}

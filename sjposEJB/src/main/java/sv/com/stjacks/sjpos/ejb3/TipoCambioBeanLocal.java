/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import entities.TipoCambio;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author aguzman
 */
@Local
public interface TipoCambioFacadeLocal {

    void create(TipoCambio tipoCambio);

    void edit(TipoCambio tipoCambio);

    void remove(TipoCambio tipoCambio);

    TipoCambio find(Object id);

    List<TipoCambio> findAll();

    List<TipoCambio> findRange(int[] range);

    int count();
    
}

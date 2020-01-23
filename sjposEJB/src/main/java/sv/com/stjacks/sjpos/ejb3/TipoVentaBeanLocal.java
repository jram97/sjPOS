/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import entities.TipoVenta;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author aguzman
 */
@Local
public interface TipoVentaFacadeLocal {

    void create(TipoVenta tipoVenta);

    void edit(TipoVenta tipoVenta);

    void remove(TipoVenta tipoVenta);

    TipoVenta find(Object id);

    List<TipoVenta> findAll();

    List<TipoVenta> findRange(int[] range);

    int count();
    
}

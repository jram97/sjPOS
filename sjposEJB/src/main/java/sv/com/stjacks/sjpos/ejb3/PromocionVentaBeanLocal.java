/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import entities.PromocionVenta;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author aguzman
 */
@Local
public interface PromocionVentaFacadeLocal {

    void create(PromocionVenta promocionVenta);

    void edit(PromocionVenta promocionVenta);

    void remove(PromocionVenta promocionVenta);

    PromocionVenta find(Object id);

    List<PromocionVenta> findAll();

    List<PromocionVenta> findRange(int[] range);

    int count();
    
}

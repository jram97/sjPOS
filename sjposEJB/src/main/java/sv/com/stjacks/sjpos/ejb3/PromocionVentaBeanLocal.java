package sv.com.stjacks.sjpos.ejb3;

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

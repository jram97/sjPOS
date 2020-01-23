package sv.com.stjacks.sjpos.ejb3;

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

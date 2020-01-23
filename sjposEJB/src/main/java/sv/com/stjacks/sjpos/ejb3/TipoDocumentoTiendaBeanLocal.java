package sv.com.stjacks.sjpos.ejb3;

import entities.TipoDocumentoTienda;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author aguzman
 */
@Local
public interface TipoDocumentoTiendaFacadeLocal {

    void create(TipoDocumentoTienda tipoDocumentoTienda);

    void edit(TipoDocumentoTienda tipoDocumentoTienda);

    void remove(TipoDocumentoTienda tipoDocumentoTienda);

    TipoDocumentoTienda find(Object id);

    List<TipoDocumentoTienda> findAll();

    List<TipoDocumentoTienda> findRange(int[] range);

    int count();
    
}

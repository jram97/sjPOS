/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

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

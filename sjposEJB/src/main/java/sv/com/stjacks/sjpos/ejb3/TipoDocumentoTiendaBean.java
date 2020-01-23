package sv.com.stjacks.sjpos.ejb3;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import sv.com.stjacks.sjpos.entities.TipoDocumentoTienda;

/**
 * Session Bean implementation class TipoDocumentoTiendaBean
 */
@Stateless
@LocalBean
public class TipoDocumentoTiendaBean extends GenericDAOJpa<TipoDocumentoTienda, Integer> implements TipoDocumentoTiendaBeanRemote, TipoDocumentoTiendaBeanLocal {

    public TipoDocumentoTiendaBean() {

    }

}

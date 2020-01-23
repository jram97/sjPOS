package sv.com.stjacks.sjpos.ejb3;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;

import sv.com.stjacks.sjpos.entities.TipoDocumento;;

/**
 * Session Bean implementation class TipoDocumentoBean
 */
@Stateless
@LocalBean
public class TipoDocumentoBean extends GenericDAOJpa<TipoDocumento, Integer> implements TipoDocumentoBeanRemote, TipoDocumentoBeanLocal {

}

package sv.com.stjacks.sjpos.ejb3;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import sv.com.stjacks.sjpos.entities.TipoDocumento;;

/**
 * 
 * @author cchavez
 *
 */

/**
 * Session Bean implementation class TipoDocumentoBean
 */
@Stateless
@LocalBean
public class TipoDocumentoBean extends GenericDAOJpa<TipoDocumento, Integer> implements TipoDocumentoBeanRemote, TipoDocumentoBeanLocal {

	public TipoDocumentoBean(Class<TipoDocumento> entity) {
		super(entity);
		// TODO Auto-generated constructor stub
	}

}

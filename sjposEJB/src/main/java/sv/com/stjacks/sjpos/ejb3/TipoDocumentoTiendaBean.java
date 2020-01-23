package sv.com.stjacks.sjpos.ejb3;

import entities.TipoDocumentoTienda;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author aguzman
 */
@Stateless
public class TipoDocumentoTiendaFacade extends AbstractFacade<TipoDocumentoTienda> implements TipoDocumentoTiendaFacadeLocal {

    @PersistenceContext(unitName = "sjPOSEJBPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TipoDocumentoTiendaFacade() {
        super(TipoDocumentoTienda.class);
    }
    
}

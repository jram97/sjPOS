package sv.com.stjacks.sjpos.ejb3;

import entities.TipoSalida;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author aguzman
 */
@Stateless
public class TipoSalidaFacade extends AbstractFacade<TipoSalida> implements TipoSalidaFacadeLocal {

    @PersistenceContext(unitName = "sjPOSEJBPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TipoSalidaFacade() {
        super(TipoSalida.class);
    }
    
}

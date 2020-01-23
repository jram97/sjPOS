package sv.com.stjacks.sjpos.ejb3;

import entities.Salida;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author aguzman
 */
@Stateless
public class SalidaFacade extends AbstractFacade<Salida> implements SalidaFacadeLocal {

    @PersistenceContext(unitName = "sjPOSEJBPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public SalidaFacade() {
        super(Salida.class);
    }
    
}

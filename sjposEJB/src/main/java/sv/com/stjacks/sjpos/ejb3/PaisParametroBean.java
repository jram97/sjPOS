/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import entities.PaisParametro;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author aguzman
 */
@Stateless
public class PaisParametroFacade extends AbstractFacade<PaisParametro> implements PaisParametroFacadeLocal {

    @PersistenceContext(unitName = "sjPOSEJBPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PaisParametroFacade() {
        super(PaisParametro.class);
    }
    
}

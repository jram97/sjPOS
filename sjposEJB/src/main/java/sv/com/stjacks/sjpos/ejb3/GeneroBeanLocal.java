/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import entities.Genero;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author aguzman
 */
@Local
public interface GeneroFacadeLocal {

    void create(Genero genero);

    void edit(Genero genero);

    void remove(Genero genero);

    Genero find(Object id);

    List<Genero> findAll();

    List<Genero> findRange(int[] range);

    int count();
    
}

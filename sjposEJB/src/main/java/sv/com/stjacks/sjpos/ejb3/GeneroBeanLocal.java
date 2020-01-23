package sv.com.stjacks.sjpos.ejb3;

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

package sv.com.stjacks.sjpos.ejb3;

import java.util.List;
import javax.ejb.Local;

import sv.com.stjacks.sjpos.entities.Categoria;

/**
 *
 * @author aguzman
 */
@Local
public interface CategoriaBeanLocal {

    void create(Categoria categoria);

    void edit(Categoria categoria);

    void remove(Categoria categoria);

    Categoria find(Object id);

    List<Categoria> findAll();

    List<Categoria> findRange(int[] range);

    int count();
    
}

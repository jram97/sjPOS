package sv.com.stjacks.sjpos.ejb3;


import java.util.List;
import javax.ejb.Local;

import sv.com.stjacks.sjpos.entities.Articulo;

/**
 *
 * @author aguzman
 */
@Local
public interface ArticuloBeanLocal{

    void insert(Articulo articulo);

    void update(Articulo articulo);

    void delete(Articulo articulo);

    Articulo get(Object id);

    List<Articulo> findAll();    
}

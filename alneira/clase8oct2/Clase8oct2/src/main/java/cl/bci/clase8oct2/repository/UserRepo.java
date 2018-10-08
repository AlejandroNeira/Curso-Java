package cl.bci.clase8oct2.repository;

import cl.bci.clase8oct2.entity.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<User, Integer> {

    @Query("SELECT u from User u where u.nombre=?1 and u.clave=?2")
    User validar(String nombre, String clave);
}

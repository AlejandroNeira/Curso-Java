package cl.bci.clase10.repository;

import cl.bci.clase10.entity.Autor;
import org.springframework.data.repository.CrudRepository;

public interface AutorRepo extends CrudRepository<Autor, Integer> {
}

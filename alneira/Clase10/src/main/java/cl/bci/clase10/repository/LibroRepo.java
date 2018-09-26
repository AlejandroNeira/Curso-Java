package cl.bci.clase10.repository;

import cl.bci.clase10.entity.Libro;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

public interface LibroRepo extends CrudRepository<Libro, Integer> {
}

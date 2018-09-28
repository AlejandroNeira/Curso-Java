package cl.bci.clase28sep.repository;

import cl.bci.clase28sep.entity.Pelicula;
import org.springframework.data.repository.CrudRepository;

public interface PeliculaRepo extends CrudRepository<Pelicula, Integer> {
}

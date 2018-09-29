package cl.bci.demo.repository;

import cl.bci.demo.entity.Movie;
import org.springframework.data.repository.CrudRepository;

public interface MovieRepo extends CrudRepository<Movie, Integer> {

}

package cl.bci.clase10parte1.reposiroty;

import cl.bci.clase10parte1.entity.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepo extends CrudRepository<Author, Integer> {

}

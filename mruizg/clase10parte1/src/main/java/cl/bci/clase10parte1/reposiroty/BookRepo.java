package cl.bci.clase10parte1.reposiroty;

import cl.bci.clase10parte1.entity.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepo extends CrudRepository<Book, Integer> {

}

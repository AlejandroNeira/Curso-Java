package cl.bci.clase01oct2.repository;

import cl.bci.clase01oct2.entity.Ciudad;
import org.springframework.data.repository.CrudRepository;

public interface CiudadRepo extends CrudRepository<Ciudad, Integer> {
}

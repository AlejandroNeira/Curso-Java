package cl.bci.clase28sep.repository;

import cl.bci.clase28sep.entity.Mensaje;
import org.springframework.data.repository.CrudRepository;

public interface MensajeRepo extends CrudRepository<Mensaje, Integer> {
}

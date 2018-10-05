package cl.bci.clase5oct2.repository;

import cl.bci.clase5oct2.entity.Actor;
import org.springframework.data.repository.CrudRepository;

public interface ActorRepo extends CrudRepository<Actor, Integer> {
}

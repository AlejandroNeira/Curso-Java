package cl.bci.clase8oct2.repository;

import cl.bci.clase8oct2.entity.MiToken;
import org.springframework.data.repository.CrudRepository;

public interface MiTokenRepo extends CrudRepository<MiToken, Integer> {
}

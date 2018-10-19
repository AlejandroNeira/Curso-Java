package cl.bci.clase19oct.repository;

import cl.bci.clase19oct.entity.FruitType;
import org.springframework.data.repository.CrudRepository;

public interface FruitTypeRepo extends CrudRepository<FruitType,Integer> {
}

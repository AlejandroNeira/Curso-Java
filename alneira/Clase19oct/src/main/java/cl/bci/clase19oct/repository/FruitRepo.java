package cl.bci.clase19oct.repository;

import cl.bci.clase19oct.entity.Fruit;
import org.springframework.data.repository.CrudRepository;

public interface FruitRepo extends CrudRepository<Fruit,Integer> {
}

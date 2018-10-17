package cl.bci.clase17oct.repository;

import cl.bci.clase17oct.entity.Client;
import org.springframework.data.repository.CrudRepository;

public interface ClientRepo extends CrudRepository<Client,Integer> {
}

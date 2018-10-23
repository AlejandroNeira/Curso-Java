package cl.bci.clase17oct.repository;

import cl.bci.clase17oct.entity.Customer;
import org.springframework.data.repository.CrudRepository;

public interface ClientRepo extends CrudRepository<Customer,Integer> {
}

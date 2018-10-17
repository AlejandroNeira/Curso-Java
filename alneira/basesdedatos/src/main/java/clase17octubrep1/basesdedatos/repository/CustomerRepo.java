package clase17octubrep1.basesdedatos.repository;

import clase17octubrep1.basesdedatos.entity.Customer;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerRepo extends CrudRepository<Customer,Integer> {

    @Query("select c from Customer c") public List<Customer> exampleList();

}

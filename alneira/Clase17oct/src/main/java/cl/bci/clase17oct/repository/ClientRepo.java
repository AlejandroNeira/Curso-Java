package cl.bci.clase17oct.repository;

import cl.bci.clase17oct.entity.Client;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ClientRepo extends CrudRepository<Client,Integer> {

    @Query("select c from Client c order by c.name")
    public List<Client> listarEjemplo();
}

package cl.bci.clase5oct2.repository;

import cl.bci.clase5oct2.entity.Taxi;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TaxiRepo extends CrudRepository<Taxi, Integer> {

    @Query("select t from Taxi t order by t.patente")
    public List<Taxi> listarOrdenado();

    @Query("select count(t) from Taxi t")
    public long contar();
}

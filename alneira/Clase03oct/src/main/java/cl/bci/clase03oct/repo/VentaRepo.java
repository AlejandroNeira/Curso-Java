package cl.bci.clase03oct.repo;

import cl.bci.clase03oct.entity.Venta;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface VentaRepo extends CrudRepository<Venta, Integer> {

    @Query("SELECT v FROM Venta v WHERE v.cliente.idCliente = ?1")
    List<Venta> listarPorCliente(Integer idCliente);
}

package cl.bci.clase03oct.repo;

import cl.bci.clase03oct.entity.Producto;
import cl.bci.clase03oct.entity.Venta;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductoRepo extends CrudRepository<Producto, Integer> {
}

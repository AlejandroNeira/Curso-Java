package cl.mruizg.demo.repositorio;

import cl.mruizg.demo.entidad.Pais;
import org.springframework.data.repository.CrudRepository;

public interface PaisRepo extends CrudRepository<Pais, Integer> {

    // esto implementa automaticamente las funciones CRUD



}

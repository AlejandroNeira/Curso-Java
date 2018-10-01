package cl.bci.clase01oct2.repository;

import cl.bci.clase01oct2.entity.Ciudad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface CiudadRepo3 extends JpaRepository<Ciudad, Integer> {


}

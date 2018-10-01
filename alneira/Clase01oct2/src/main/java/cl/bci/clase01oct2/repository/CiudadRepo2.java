package cl.bci.clase01oct2.repository;

import cl.bci.clase01oct2.entity.Ciudad;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class CiudadRepo2 {

    @PersistenceContext
    private EntityManager em;

    public List<Ciudad> listarTodo(){
        Query consulta = em.createQuery("SELECT c FROM Ciudad c join fetch c.pais p join fetch p.continente co");
        return consulta.getResultList();
    }

}

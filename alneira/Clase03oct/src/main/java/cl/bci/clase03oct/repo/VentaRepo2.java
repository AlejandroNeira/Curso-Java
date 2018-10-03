package cl.bci.clase03oct.repo;

import cl.bci.clase03oct.entity.Venta;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class VentaRepo2 {

    @PersistenceContext
    private EntityManager em;

    public List listarPorCliente(Integer idCliente){
        return em.createQuery("SELECT v FROM Venta v WHERE v.cliente.idCliente =: idCliente").setParameter("idCliente", idCliente).getResultList();
    }
}

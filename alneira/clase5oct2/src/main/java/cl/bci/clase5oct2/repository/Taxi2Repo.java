package cl.bci.clase5oct2.repository;

import cl.bci.clase5oct2.entity.Taxi;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

@Repository
public class Taxi2Repo {

    @PersistenceUnit
    private EntityManager em;

    public List<Taxi> listar(){
        Query consulta = em.createQuery("SELECT t from Taxi t order by t.patente");
        return consulta.getResultList()
    }

    public List<Taxi> lista2r(){
        CriteriaBuilder cd = em.getCriteriaBuilder();
        CriteriaQuery<Taxi> query = cd.createQuery(Taxi.class);
        Root<Taxi> raiz = query.from(Taxi.class);
        Query consulta = em.createQuery(query);
        return consulta.getResultList();
    }
}

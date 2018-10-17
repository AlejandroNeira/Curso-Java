package cl.bci.clase17oct.repository;

import cl.bci.clase17oct.valueobject.VentasAgrupadasVO;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class VentasRepo {

    @PersistenceContext
    EntityManager em;

    public List<VentasAgrupadasVO> ventasAgrupadas(){
        Query consulta = em.createQuery("select new cl.bci.clase17oct.valueobject.VentasAgrupadasVO(v.vendedor.name, count (v)) from Ventas v group by v.vendedor.name", VentasAgrupadasVO.class);
        return consulta.getResultList();
    }
}

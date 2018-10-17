package clase17octubrep1.basesdedatos.repository;

import clase17octubrep1.basesdedatos.valueobject.SellerGroupVO;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class SellerRepo {

    @PersistenceContext
    EntityManager em;

    public List<SellerGroupVO> groupList() {

        //crear Query
        Query request = em.createQuery("select new clase17octubrep1.basesdedatos.valueobject.SellerGroupVO(s.name, count(s)) from Seller s group by s.name"
                , SellerGroupVO.class);

        return request.getResultList();

    }

}

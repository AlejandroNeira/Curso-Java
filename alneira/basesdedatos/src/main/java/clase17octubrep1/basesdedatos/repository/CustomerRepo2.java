package clase17octubrep1.basesdedatos.repository;

import clase17octubrep1.basesdedatos.entity.Customer;
import clase17octubrep1.basesdedatos.valueobject.CustomerGroupVO;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class CustomerRepo2 {

    @PersistenceContext
    EntityManager em;

    public List<Customer> exampleList() {

        //crear Query
        Query request = em.createQuery("select c from Customer c order by c.name");

        return request.getResultList();

    }

    public List<Customer> exampleList2() {

        //crear Query
        Query request = em.createNamedQuery("customerlist");
        return request.getResultList();

    }

    public List<CustomerGroupVO> groupList() {

        clase17octubrep1.basesdedatos.valueobject.CustomerGroupVO obj = new clase17octubrep1.basesdedatos.valueobject.CustomerGroupVO("nombre",222L);

        //crear Query
        Query request = em.createQuery("select new clase17octubrep1.basesdedatos.valueobject.CustomerGroupVO(c.category.name, count(c)) from Customer c group by c.category.name"
                , CustomerGroupVO.class);

        return request.getResultList();

    }


}

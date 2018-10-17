package clase17octubrep1.basesdedatos.repository;

import clase17octubrep1.basesdedatos.entity.Customer;
import clase17octubrep1.basesdedatos.valueobject.CustomerGroupVO;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
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

    //usar procedimiento almacenado
    public List<Customer> spList(String inicio){

        StoredProcedureQuery request = em
                .createStoredProcedureQuery("customerlist", Customer.class);
        request.registerStoredProcedureParameter("inicio", String.class, ParameterMode.IN);
        request.setParameter("inicio", inicio);
        return request.getResultList();

    }


    //usar criteria
    public List<Customer> criteriaExample(){

        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Customer> cquery = cb.createQuery(Customer.class);
        Root from = cquery.from(Customer.class);
        cquery.orderBy(cb.asc(from.get("name")));
        Query request = em.createQuery(cquery);
        return request.getResultList();

    }





}

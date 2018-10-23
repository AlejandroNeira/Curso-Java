package cl.bci.clase17oct.repository;

import cl.bci.clase17oct.entity.Category;
import cl.bci.clase17oct.entity.Client;
import cl.bci.clase17oct.valueobject.ClientAgrupadoVO;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;
import java.util.List;

@Repository
public class ClientRepo2  {

    @PersistenceContext
    EntityManager em;

    public List<Client> listarEjemplo(){
        // (select c from Client c order by c.name", Client.class)
        Query consulta = em.createQuery("select c from Client c order by c.name");

        return consulta.getResultList();
    }

    public List<Client> listarEjemplo2(){
        Query consulta = em.createNamedQuery("listarclientes");
        return consulta.getResultList();
    }

    public List<Object[]> listarEjemplo3(){
        Query consulta = em.createNativeQuery("select * from client order by name");
        return consulta.getResultList();
    }

    public List<ClientAgrupadoVO> listarAgrupado(){
        Query consulta = em.createQuery("select new cl.bci.clase17oct.valueobject.ClientAgrupadoVO(c.category.name, count (c)) from Client c group by c.category.name", ClientAgrupadoVO.class);
        return consulta.getResultList();
    }

    public List<Client> spList(String inicio){

        StoredProcedureQuery request = em
                .createStoredProcedureQuery("listarclientes", Client.class);
        request.registerStoredProcedureParameter("inicio", String.class, ParameterMode.IN);
        request.setParameter("inicio", inicio);
        return request.getResultList();
    }

    @Transactional
    public int insertar(String name){
        int resultado = 0;
        Client client = new Client();
        client.setName(name);
        Category category = new Category();
        category.setIdCategory(1);
        category.setName("cat");
        client.setCategory(category);
        em.persist(client);
        return resultado;
    }
}

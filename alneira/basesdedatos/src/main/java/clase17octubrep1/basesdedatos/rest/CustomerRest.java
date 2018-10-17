package clase17octubrep1.basesdedatos.rest;

import clase17octubrep1.basesdedatos.entity.Customer;
import clase17octubrep1.basesdedatos.repository.CustomerRepo;
import clase17octubrep1.basesdedatos.repository.CustomerRepo2;
import clase17octubrep1.basesdedatos.valueobject.CustomerGroupVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerRest {

    @Autowired
    private CustomerRepo customerRepo;

    @Autowired
    private CustomerRepo2 customerRepo2;

    @GetMapping("/list")
    public List<Customer> list(){

        return customerRepo.exampleList();

    }

    @GetMapping("/list2")
    public List<Customer> list2(){

        return customerRepo2.exampleList();

    }

    @GetMapping("/list3")
    public List<Customer> list3(){

        return customerRepo2.exampleList2();

    }

    @GetMapping("/grouplist")
    public List<CustomerGroupVO> groupList(){

        return customerRepo2.groupList();

    }

}

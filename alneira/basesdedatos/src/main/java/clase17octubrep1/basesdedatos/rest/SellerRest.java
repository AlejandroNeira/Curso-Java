package clase17octubrep1.basesdedatos.rest;

import clase17octubrep1.basesdedatos.repository.SellerRepo;
import clase17octubrep1.basesdedatos.valueobject.SellerGroupVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/seller")
public class SellerRest {


    @Autowired
    private SellerRepo sellerRepo;

    @GetMapping("/grouplist")
    public List<SellerGroupVO> groupList(){

        return sellerRepo.groupList();

    }

}

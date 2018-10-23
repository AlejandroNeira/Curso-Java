package cl.bci.clase19oct.entity;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestFruit {


    @Test
    public void contextLoads() {

        //Version 1
        Fruit fruit = new Fruit();
        fruit.setIdFruit(1);
        fruit.setWeight(20);
        fruit.setUserName("Alejo");

        //Version 2
        Fruit fruit1= new Fruit(1,"Alejo",null, 20,0);

        //Version 3
        Fruit fruit2 = new Fruit();
        fruit2.setIdFruit(1).setWeight(20).setUserName("Alejo");

    }
}

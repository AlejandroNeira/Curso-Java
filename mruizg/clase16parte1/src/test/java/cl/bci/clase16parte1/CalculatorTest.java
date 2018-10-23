package cl.bci.clase16parte1;


import cl.bci.clase16parte1.model.Calculator;
import cl.bci.clase16parte1.service.CalculatorSrv;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.assertj.core.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTest {

    @Test
    public void addTest(){
        CalculatorSrv calculatorSrv = new CalculatorSrv();
        Calculator object = new Calculator(1,1);
        assertThat(calculatorSrv.add(object)).isEqualTo(2);
    }

    @Test
    public void subTest(){
        CalculatorSrv calculatorSrv = new CalculatorSrv();
        Calculator object = new Calculator(1,1);
        assertThat(calculatorSrv.sub(object)).isEqualTo(0);
    }

    @Test
    public void divTest(){
        CalculatorSrv calculatorSrv = new CalculatorSrv();
        Calculator object = new Calculator(9,3);
        assertThat(calculatorSrv.div(object)).isEqualTo(3);
    }





}

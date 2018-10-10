package cl.bci.clase10oct1;

import cl.bci.clase10oct1.modelo.Calculadora;
import cl.bci.clase10oct1.servicio.CalculadoraSrv;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.assertj.core.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculadoraTest {

    @Test
    public void sumarTest(){
        CalculadoraSrv calculadoraSrv = new CalculadoraSrv();
        Calculadora objeto = new Calculadora(1,1);
        assertThat(calculadoraSrv.sumar(objeto)).isEqualTo(1);
    }
}

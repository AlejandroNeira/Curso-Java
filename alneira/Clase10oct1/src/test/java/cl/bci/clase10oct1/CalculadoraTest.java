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

    CalculadoraSrv calculadoraSrv= new CalculadoraSrv();

    @Test
    public void sumarTest(){
        CalculadoraSrv calculadoraSrv = new CalculadoraSrv();
        Calculadora objeto = new Calculadora(1,1);
        assertThat(calculadoraSrv.sumar(objeto)).isEqualTo(2);

        assertThat(calculadoraSrv.sumar(new Calculadora(4,3))).isEqualTo(7);

        assertThat(calculadoraSrv.sumar(new Calculadora(0,0))).isEqualTo(0);
        assertThat(calculadoraSrv.sumar(new Calculadora(Integer.MAX_VALUE,1))).isEqualTo(Integer.MIN_VALUE);
    }


    //Restar
    @Test
    public void restarTest1(){
        assertThat(calculadoraSrv.restar(new Calculadora(5,3))).isEqualTo(2);
    }

    @Test
    public void restarTest2(){
        assertThat(calculadoraSrv.restar(new Calculadora(0,0))).isEqualTo(0);
    }

    @Test
    public void restarTest3(){
        assertThat(calculadoraSrv.restar(new Calculadora(0,9))).isEqualTo(-9);
    }

    @Test
    public void restarTest4(){
        assertThat(calculadoraSrv.restar(new Calculadora(Integer.MIN_VALUE,1))).isEqualTo(Integer.MAX_VALUE);
    }

    //Multiplicar
    @Test
    public void multiplicarTest1(){
        assertThat(calculadoraSrv.multiplicar(new Calculadora(1,5))).isEqualTo(5);
    }

    @Test
    public void multiplicarTest2(){
        assertThat(calculadoraSrv.multiplicar(new Calculadora(0,6))).isEqualTo(0);
    }

    @Test
    public void multiplicarTest3(){
        assertThat(calculadoraSrv.multiplicar(new Calculadora(0,0))).isEqualTo(0);
    }

    @Test
    public void multiplicarTest4(){
        assertThat(calculadoraSrv.multiplicar(new Calculadora(1,Integer.MAX_VALUE))).isEqualTo(Integer.MAX_VALUE);
    }

    //Dividir
    @Test
    public void dividirTest1(){
        assertThat(calculadoraSrv.dividir(new Calculadora(5,1))).isEqualTo(5);
    }

    @Test
    public void dividirTest2(){
        assertThat(calculadoraSrv.dividir(new Calculadora(0,6))).isEqualTo(0);
    }

    @Test
    public void dividirTest3(){
        assertThat(calculadoraSrv.dividir(new Calculadora(6,3))).isEqualTo(2);
    }

    @Test//(expected = ArithmeticException.class)
    public void dividirTest4(){
        assertThat(calculadoraSrv.dividir(new Calculadora(0,0))).isEqualTo(0);
    }
}

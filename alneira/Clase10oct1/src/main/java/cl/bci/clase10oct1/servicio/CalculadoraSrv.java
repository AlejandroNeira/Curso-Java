package cl.bci.clase10oct1.servicio;

import cl.bci.clase10oct1.modelo.Calculadora;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;



@Service
public class CalculadoraSrv {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    public int sumar(Calculadora calculadora){
        return calculadora.getN1() + calculadora.getN2();
    }

    public int restar(Calculadora calculadora){
        return calculadora.getN1() - calculadora.getN2();
    }

    public int multiplicar(Calculadora calculadora){
        return calculadora.getN1() * calculadora.getN2();
    }

    public double dividir(Calculadora calculadora){
        try{
            return calculadora.getN1() / calculadora.getN2();
        } catch (ArithmeticException e){
            logger.info("Cueck division por cero");
            return 0;
        }
    }
}

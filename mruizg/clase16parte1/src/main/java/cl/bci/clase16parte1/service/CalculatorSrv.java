package cl.bci.clase16parte1.service;

import cl.bci.clase16parte1.model.Calculator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;


@Service
public class CalculatorSrv {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    public int add(Calculator calculator){
        return calculator.getN1() + calculator.getN2();
    }

    public int sub(Calculator calculator){
        return calculator.getN1() - calculator.getN2();
    }

    public int div(Calculator calculator){
        try {
            return calculator.getN1() / calculator.getN2();
        } catch(ArithmeticException ex){
            logger.info("Quedo la caga");
            return 0;
        }
    }

    public int mul(Calculator calculator){
        long m = calculator.getN1()*calculator.getN2();
        return (int) m;
    }

}

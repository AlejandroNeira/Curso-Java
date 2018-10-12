package cl.bci.clase12oct.aspect;

import cl.bci.clase12oct.service.EncomiendaSrv;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class EncomiendaAspect {

    private Logger logger = LoggerFactory.getLogger(EncomiendaSrv.class);

    @Before("execution(* cl.bci.clase12oct.service.EncomiendaSrv.*(..))")
    public void antes(JoinPoint joinPoint){
        logger.info("[Inicio]"+joinPoint.getSignature().getName());
    }

    //@AfterReturning(pointcut="execution(* cl.bci.clase12oct.service.EncomiendaSrv(..))", returning="retVal")
    //public void despues(Object retVal){
    //    logger.info("[FIN]");
    //}

}

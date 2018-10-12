package cl.bci.clase12oct.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AroundAspect {

    @Around("execution(* cl.bci.clase12oct.service.EncomiendaSrv.mensaje(..))" +
    "&& args(texto)")
    public String menesaje(ProceedingJoinPoint proceedingJoinPoint, Object texto)throws Throwable{
        Object resultado = proceedingJoinPoint.proceed(new String[]{"nuevo mensaje"});

        return  (String) resultado;
    }
}

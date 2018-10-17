package cl.bci.clase12oct2.aspect;

import cl.bci.clase12oct2.service.ValidacionSrv;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import javax.servlet.http.HttpServletRequest;

@Aspect
@Configuration
public class AnotationAspect {

    @Autowired
    ValidacionSrv validacionSrv;

    @Autowired
    HttpServletRequest httpServletRequest;

    @Around("@annotation(cl.bci.clase12oct2.aspect.ValidacionToken.*))")
    public Object validaToken(ProceedingJoinPoint funcion) throws Throwable{
        return validate(getHeader("token"))? funcion.proceed(): null;
    }

    private boolean validate(String token) {
        if (validacionSrv.validar(token)){
            return true;
        }
        return false;
    }

    private String getHeader(String value){
        return httpServletRequest.getHeader("token");
    }
}

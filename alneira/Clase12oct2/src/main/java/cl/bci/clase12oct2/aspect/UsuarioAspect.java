package cl.bci.clase12oct2.aspect;

import cl.bci.clase12oct2.service.ValidacionSrv;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import javax.naming.AuthenticationException;
import javax.servlet.http.HttpServletRequest;

@Configuration
@Aspect
public class UsuarioAspect {

    @Autowired
    ValidacionSrv validacionSrv;

    @Autowired
    HttpServletRequest httpServletRequest;

    @Around("execution(* cl.bci.clase12oct2.controller.UsuarioRest.*())")
    public Object validaToken(ProceedingJoinPoint funcion) throws Throwable{
        return validate(getHeader("token"))? funcion.proceed(): null;
    }

    @Around("execution(* cl.bci.clase12oct2.controller.UsuarioRest.*(..)) && args(id)")
    public Object validaToken(ProceedingJoinPoint funcion, int id) throws Throwable{
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

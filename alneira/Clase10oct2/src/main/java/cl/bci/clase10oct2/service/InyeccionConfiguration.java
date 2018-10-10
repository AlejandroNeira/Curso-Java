package cl.bci.clase10oct2.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InyeccionConfiguration {

    @Bean
    @ConditionalOnProperty(name = "lenguaje", havingValue= "ingles", matchIfMissing = true)
    public LanguajeInterfaceSrv crear(){
        return new EnglishSrv();
    }

    @Bean
    @ConditionalOnProperty(name = "lenguaje", havingValue= "espanol")
    public LanguajeInterfaceSrv crearEsp(){
        return new SpanishSrv();
    }

}

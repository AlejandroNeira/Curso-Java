package cl.bci.clase12oct;

import cl.bci.clase12oct.entity.Encomienda;
import cl.bci.clase12oct.service.EncomiendaSrv;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EncomiendaSrvTest {

    @Autowired
    EncomiendaSrv encomiendaSrv;

    @Test
    public void test1(){
        //assertThat(encomiendaSrv.tiempoEnvio()).isEqualTo(0);
        assertThat(encomiendaSrv.mensaje("mensaje")).isEqualTo("este es un texto");
    }
}


package cl.bci.clase8oct2.rest;

import cl.bci.clase8oct2.entity.MiToken;
import cl.bci.clase8oct2.entity.User;
import cl.bci.clase8oct2.repository.MiTokenRepo;
import cl.bci.clase8oct2.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Calendar;
import java.util.Date;


@RestController
@RequestMapping("/usuario")
public class UserRest {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private MiTokenRepo miTokenRepo;

    @GetMapping("/login/{nombre}/{clave}")
    public User login(@PathVariable("nombre") String nombre, @PathVariable("clave") String clave) {
        return userRepo.validar(nombre,clave);
    }

    @PostMapping("/login")
    public String login(@RequestBody User user) {
        User user1 = userRepo.validar(user.getNombre(),user.getClave());
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MINUTE, 3);
        System.out.println(calendar);
        String token = user1 != null? "Mi token es " + miTokenRepo.save(new MiToken(calendar.getTime(), user)).getIdToken() : "User o Pass incorrecto";
        return token;
    }
}

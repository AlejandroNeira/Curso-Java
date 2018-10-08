package cl.bci.clase8oct2.rest;

import cl.bci.clase8oct2.entity.MiToken;
import cl.bci.clase8oct2.entity.User;
import cl.bci.clase8oct2.repository.MiTokenRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.Optional;

@RestController
@RequestMapping("/usar")
public class UsarTokenRest {

    @Autowired
    private MiTokenRepo miTokenRepo;

    @GetMapping("/token/{token}")
    public String token(@PathVariable("token") int token) {
        Optional<MiToken> leer = miTokenRepo.findById(token);
        return leer.isPresent() ? leer.get().getFecha().before(new Date()) ? "El token expiro" : "el usuario de ese token es " + leer.get().getUser().getNombre() : "el token no existe";
    }
}

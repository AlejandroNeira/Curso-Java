package cl.bci.clase5oct2.controller;

import cl.bci.clase5oct2.entity.Taxi;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Controller
@RequestMapping("/taxi/controller")
public class TaxiController {

    @GetMapping("")
    public String listar(Model model){
        RestTemplate restTemplate = new RestTemplate();
        Taxi[] taxis = restTemplate.getForObject("http://localhost:8080/taxi/",Taxi[].class);
        model.addAttribute("lista", taxis);
        return "taxi";
    }

    @GetMapping("/insertar")
    public String insertar(Model model){
        Taxi taxi = new Taxi();
        model.addAttribute("taxi", taxi);

        return "insertarTaxi";
    }

    @PostMapping("/insertar")
    public String insertar(Model model, Taxi taxi){
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.postForObject("http://localhost:8080/taxi/", taxi, Taxi.class);
        return "insertarTaxi";
    }

    @GetMapping("/{id}")
    public String modificar(Model modelo, @PathVariable("id") int id){
        RestTemplate restTemplate = new RestTemplate();
        Map<String, String> uriParameters = new HashMap<>();
        uriParameters.put("id", id+"");
        //Arreglar
        Taxi taxi = restTemplate.getForObject("http://localhost:8080/taxi/", Taxi.class, uriParameters);
        modelo.addAttribute("taxi",taxi);
        return "insertarTaxi";
    }

    @GetMapping("/delete")
    public String delete(Model model, Taxi taxi){
        RestTemplate restTemplate = new RestTemplate();

        return "taxi";
    }
}

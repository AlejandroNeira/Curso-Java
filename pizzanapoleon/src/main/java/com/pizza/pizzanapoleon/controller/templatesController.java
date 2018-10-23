package com.pizza.pizzanapoleon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("pizzas")
public class templatesController {

    @GetMapping("/")
    public String index(Model model){
        return "index";
    }

    @GetMapping("/login")
    public String login(Model model){
        return "login";
    }

    @GetMapping("/ordenar")
    public String ordenar(Model model){
        return "ordenar";
    }

    @GetMapping("/nosotros")
    public String nosotros(Model model){
        return "nosotros";
    }

}

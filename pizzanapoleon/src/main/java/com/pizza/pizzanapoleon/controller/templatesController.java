package com.pizza.pizzanapoleon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("pizzas")
public class templatesController {

    @GetMapping("/login")
    public String login(Model model){
        return "login";
    }

}

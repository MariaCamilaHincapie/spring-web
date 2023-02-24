package com.eamappp.springweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mensaje")

public class indexController {
    @GetMapping({ "/", "", "/index" })
    public String index(Model model) {
        model.addAttribute("titulo", "Hola Spring Boot");
        model.addAttribute("parrafo", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut sed.");
        return "index";
    }


    @GetMapping("/app")
    public String app(Model model) {
        model.addAttribute("mensaje", "que podemos hacer por ti");
        return "contactar";
    }
}

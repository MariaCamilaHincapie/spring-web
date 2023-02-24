package com.eamappp.springweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.eamappp.models.entity.Cliente;

@Controller
@RequestMapping("/cliente")

public class clientController {
    @GetMapping({ "/", ""})
    public String indexCliente(Model model) {
        Cliente cliente = new Cliente();
        model.addAttribute("titulo", "Perfil");
        model.addAttribute("Cliente", cliente);
        cliente.setNombre("Camila");
        cliente.setApellido("Hincapie");
        cliente.setEmail("hicapie.maria.6064@eam.edu.co");
        model.addAttribute("cuerpo", "perfil del cliente ".concat(cliente.getNombre()));
        return "cliente/index";
    }
}

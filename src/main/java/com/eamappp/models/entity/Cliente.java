package com.eamappp.models.entity;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.ModelAttribute;

public class Cliente {
    private String nombre;
    private String apellido;
    private String email;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public Cliente() {
    }
    
    public Cliente(String nombre, String apellido, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
    }

    @ModelAttribute("clientes")
    public List<Cliente> poblarClientes(){
        List<Cliente> clientes = Arrays.asList(new Cliente("Pepito","Perez","pepito@prueba.com"), new Cliente("cosme","fulanito","cosme@prueba.com"));
        return clientes;
    }

}

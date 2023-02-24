package com.eamappp.models.entity;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.ModelAttribute;

public class Vendedores {
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

    public Vendedores() {
    }

    public Vendedores(String nombre, String apellido, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
    }
    @ModelAttribute("vendedores")
    public List<Vendedores> poblarVendedores(){
        List<Vendedores> vendedores = Arrays.asList(new Vendedores("Pepito","Perez","pepito@prueba.com"), new Vendedores("cosme","fulanito","cosme@prueba.com"));
        return vendedores;
    }

}

package com.restservice.app1.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restservice.app1.modelos.Usuario;

@RestController
public class UsuariosController {
    
    @RequestMapping(value = "Usuario")
    public Usuario getUsuario(){
        return new Usuario("Juan","sanchez","sanchez@gmail.com",25);
    }
}

package com.restservice.app1.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restservice.app1.modelos.Usuario;

@RestController
public class Controller1 {
    
    @RequestMapping("usuarios")
    public List<Usuario> getUsuarios(){
        List<Usuario> usuarios = new ArrayList<Usuario>();
        usuarios.add(new Usuario("Juan", "Sanchez", "Sanchez123@gmail.com", 37));
        usuarios.add(new Usuario("Felipe", "Smith", "Smith123@gmail.com", 28));
        usuarios.add(new Usuario("Maria", "Aguilar", "Aguilar123@gmail.com", 27));
        usuarios.add(new Usuario("Lina", "Estrada", "Estrada123@gmail.com", 24));
        usuarios.add(new Usuario("Pepa", "Loaiza", "SLoaiza223@gmail.com", 30));

        return usuarios;
    }

}

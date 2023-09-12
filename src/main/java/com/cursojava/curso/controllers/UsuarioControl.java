package com.cursojava.curso.controllers;

import com.cursojava.curso.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioControl {
    @RequestMapping(value = "usuario/{id}")
    public Usuario getUsuario(@PathVariable Long id) {
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Carlos");
        usuario.setApellido("perez");
        usuario.setEmail("email@emal.com");
        usuario.setTelefong("123123");
        return usuario;
    }
    @RequestMapping(value = "usuarios")
    public List<Usuario> getUsuarios() {

         List<Usuario> usuarios = new ArrayList<>();

        Usuario usuario = new Usuario();
        usuario.setId(234L);
        usuario.setNombre("Carlos");
        usuario.setApellido("perez");
        usuario.setEmail("email@emal.com");
        usuario.setTelefong("123123");

        Usuario usuario2 = new Usuario();
        usuario2.setId(6767L);
        usuario2.setNombre("Pepe");
        usuario2.setApellido("Gomez");
        usuario2.setEmail("email@emal.com");
        usuario2.setTelefong("123123");

        Usuario usuario3 = new Usuario();
        usuario3.setId(878L);
        usuario3.setNombre("Juan");
        usuario3.setApellido("Kuope");
        usuario3.setEmail("email@emal.com");
        usuario3.setTelefong("123123");

        usuarios.add(usuario);
        usuarios.add(usuario2);
        usuarios.add(usuario3);

        return usuarios;
    }
    @RequestMapping(value = "usuario12")
    public Usuario editUsuario() {
        Usuario usuario = new Usuario();
        usuario.setNombre("Lulu");
        usuario.setApellido("Kass");
        usuario.setEmail("email@emal.com");
        usuario.setTelefong("123123");
        return usuario;
    }
    @RequestMapping(value = "usuario234")
    public Usuario deleteUsuario() {
        Usuario usuario = new Usuario();
        usuario.setNombre("Carlos");
        usuario.setApellido("perez");
        usuario.setEmail("email@emal.com");
        usuario.setTelefong("123123");
        return usuario;
    }
    @RequestMapping(value = "usuario33")
    public Usuario listUsuarios() {
        Usuario usuario = new Usuario();
        usuario.setNombre("Carlos");
        usuario.setApellido("perez");
        usuario.setEmail("email@emal.com");
        usuario.setTelefong("123123");
        return usuario;
    }

}

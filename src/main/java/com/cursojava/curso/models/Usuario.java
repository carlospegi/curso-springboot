package com.cursojava.curso.models;

public class Usuario {
    private Long id;
    private String nombre;
    private String apellido;
    private String email;
    private String telefong;
    private String password;

    public String getNombre() {
        return nombre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getTelefong() {
        return telefong;
    }

    public void setTelefong(String telefong) {
        this.telefong = telefong;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

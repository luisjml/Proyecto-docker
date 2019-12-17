package com.proyectod.proyectoDocker.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


public class Task {

    private String userName;
    private String descripcion;

    public Task(String userName, String descripcion) {
        this.userName = userName;
        this.descripcion = descripcion;
    }

    public String getUsername(){
        return userName;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}

package com.parcial.smarttraffic.model;

public class Ciudad {

    private String nombre;
    private int nivelTrafico;

    public Ciudad(String nombre, int nivelTrafico) {
        this.nombre = nombre;
        this.nivelTrafico = nivelTrafico;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNivelTrafico() {
        return nivelTrafico;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNivelTrafico(int nivelTrafico) {
        this.nivelTrafico = nivelTrafico;
    }
}

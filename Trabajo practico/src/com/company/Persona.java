package com.company;

public abstract class Persona {
    private String nombre;
    private String apellido;
    private int legajo;


    //Contructor
    public Persona(String nombre, String apellido, int legajo) {
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setLegajo(legajo);
    }

    //
    public abstract void modificarDatos();

    //Propiedades
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

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }


    //ToString
    public String toString() {
        String str = String.format("Nombre: %s\nApellido: %s\nLegajo N°: %d", this.nombre, this.apellido, this.legajo);
    return str;
    }
}

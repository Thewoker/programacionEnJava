package com.company;

import java.util.Scanner;

public class Estudiante extends Persona {
    public Estudiante(String nombre, String apellido, int legajo) {
        super(nombre, apellido, legajo);
    }

    //Metodo de Persona
    @Override
    public void modificarDatos() {
    Scanner s = new Scanner(System.in);

        System.out.println("Estas modificando los datos de:\n" + getApellido() + ", " +getNombre() + " "+ getLegajo() + "\n");
        System.out.println("Ingresa un Apellido: \n");
        this.setApellido(ValidacionDatos.ingresarSoloLetras());
        System.out.println("Ingresa un Nombre: \n");
        this.setNombre(ValidacionDatos.ingresarSoloLetras());
        System.out.println("Ingresa un Legajo: \n");
        this.setLegajo(ValidacionDatos.ingresarSoloNumeros());
        System.out.println(this.toString());
    }


    //ToString con los datos modif. al metodo de persona
    @Override
    public String toString() {
        return "Estudiante:\n" + super.toString();
    }
}

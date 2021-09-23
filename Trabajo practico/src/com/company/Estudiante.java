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

        System.out.println("Estas modificando los datos de:\n");
        System.out.println("Ingresa un nuevo nombre:\n");
        String nombre = s.nextLine();
        this.setNombre(nombre);
        System.out.println("Ingresa un nuevo apellido:\n");
        String apellido = s.nextLine();
        this.setApellido(apellido);
        System.out.println("Ingresa un nuevo numero de legajo:\n");
        int legajo = s.nextInt();
        this.setLegajo(legajo);
    }


    //ToString con los datos modif. al metodo de persona
    @Override
    public String toString() {
        return "Estudiante:/n" + super.toString();
    }
}

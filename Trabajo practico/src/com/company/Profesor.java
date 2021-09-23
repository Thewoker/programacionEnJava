package com.company;

import java.util.Scanner;

public class Profesor extends Persona{
    private double basico;
    private int antiguedad;
    public Profesor(String nombre, String apellido, int legajo, double basico, int antiguedad) {
        super(nombre, apellido, legajo);
        this.basico = basico;
        this.antiguedad = antiguedad;
    }
    //Propiedades
    public double getBasico() {
        return basico;
    }

    public void setBasico(double basico) {
        this.basico = basico;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
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


    //ToString muestra los datos modificados de el prof.
    @Override
    public String toString() {
        return "Profesor:/n" + super.toString();
    }


    //Calcula el sueldo
    public double calcularSueldo(){
        double sueldo = this.basico+((this.basico*0.10)*this.antiguedad);

        return sueldo;
    }
}

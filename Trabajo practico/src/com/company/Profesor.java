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

        System.out.println("Estas modificando los datos de: \n" + getApellido() + ", " + getNombre() + " " + getLegajo());
        System.out.println("Ingresa un nuevo nombre:\n");
        this.setNombre(ValidacionDatos.ingresarSoloLetras());
        System.out.println("Ingresa un nuevo apellido:\n");
        this.setApellido(ValidacionDatos.ingresarSoloLetras());
        System.out.println("Ingresa un nuevo numero de legajo:\n");
        this.setLegajo(ValidacionDatos.ingresarSoloNumeros());
        System.out.println("Ingresa Salario basico.");
        this.setBasico(ValidacionDatos.ingresarSoloNumerosD());
        System.out.println("Ingresa la antiguedad del profesor.");
        this.setAntiguedad(ValidacionDatos.ingresarSoloNumeros());
        System.out.println(this.toString());
    }


    //ToString muestra los datos modificados de el prof.
    @Override
    public String toString() {
        return "Profesor:\n" + super.toString();
    }


    //Calcula el sueldo
    public double calcularSueldo(){
        double sueldo = this.basico+((this.basico*0.10)*this.antiguedad);

        return sueldo;
    }
}

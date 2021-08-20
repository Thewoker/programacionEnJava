package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String nombre;
        int edad;
        float salario;
        boolean carnet = true;
        Scanner s = new Scanner(System.in);

        System.out.println("¿Cual es tu nombre?.");
        nombre = s.nextLine();

        System.out.println("¿Cual es tu edad?.");
        edad = s.nextInt();

        System.out.println("¿Cual es el salario que tu deseas?.");
        salario = s.nextFloat();

        System.out.println("Hola soy " + nombre + " tengo " + edad + ", y me gustaria un salario de " + salario +
                " en el futuro y el carnet es " + carnet);
    }
}

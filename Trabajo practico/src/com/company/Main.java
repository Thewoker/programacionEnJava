package com.company;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
    Estudiante est1 = new Estudiante("Leonel","Jara Ravarotto", 26209);
    Estudiante est2 = new Estudiante("Fernando","Jara",26210);
    Profesor prof1 = new Profesor("Facundo","Uferer",12345, 25000, 5);
    Profesor prof2 = new Profesor("Nicolas", "Pertile",14432,30000,5);

    ArrayList <Estudiante> coleccionEstudiantes = new ArrayList<>();
        coleccionEstudiantes.add(est1);
        coleccionEstudiantes.add(est2);

        System.out.println(coleccionEstudiantes.toString());


    Materia materia1 = new Materia("Laboratorio", prof1, coleccionEstudiantes);
    Materia materia2 = new Materia("Ingles", prof2, coleccionEstudiantes);
    ArrayList <Materia> coleccionMaterias = new ArrayList<>();
        coleccionMaterias.add(materia1);
        coleccionMaterias.add(materia2);

        System.out.println(materia1.toString());



    Carrera carrera1 = new Carrera("Tecnicatura Superior En Programacion", coleccionMaterias);
        ArrayList <Carrera> coleccionCarreras = new ArrayList<>();
        coleccionCarreras.add(carrera1);

        System.out.println(coleccionMaterias.toString());

    Facultad facultad1 = new Facultad("Utn Frre",coleccionCarreras);

        System.out.println(facultad1.toString());


    //prueba mod. datos est1 Exitosa!
    //est1.modificarDatos();
    System.out.println(est1);
    System.out.println(prof1);



    }

}

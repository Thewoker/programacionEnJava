package com.company;

import java.util.ArrayList;

public class Materia {
    private String nombre;
    private Profesor titular;
    private ArrayList<Estudiante> coleccionEstudiantes;     //Agregar los alumnos desde el main con var.add(objeto de estudiante);

    //Contructor
    public Materia(String nombre, Profesor titular, ArrayList<Estudiante> coleccionEstudiantes) {
        this.nombre = nombre;
        this.titular = titular;
        this.coleccionEstudiantes = coleccionEstudiantes;
    }

    //Propiedades
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Profesor getTitular() {
        return titular;
    }

    public void setTitular(Profesor titular) {
        this.titular = titular;
    }

    public ArrayList<Estudiante> getColeccionEstudiantes() {
        return coleccionEstudiantes;
    }

    public void setColeccionEstudiantes(ArrayList<Estudiante> coleccionEstudiantes) {
        this.coleccionEstudiantes = coleccionEstudiantes;
    }


    //Metodo Agregar Estudiante
        //Crear un obgeto alumno de tipo estudiante y pasarlo en main
    public void agregarEstidiante(Estudiante alumno){
        this.coleccionEstudiantes.add(alumno);
    }


    //Metodo Elliminar Estudiante
    public void  eliminarEstudiante(String nombre){
        this.coleccionEstudiantes.remove(nombre);
    }


    //Cambiar el Titular de la materia
    public void modificarTitular(String nombre, String apellido, int legajo,double basico, int antiguedad){
        Profesor titular = new Profesor(nombre,apellido,legajo,basico,antiguedad);
        this.setTitular(titular);
    }
}

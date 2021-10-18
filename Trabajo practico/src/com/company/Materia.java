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
        this.coleccionEstudiantes = new ArrayList<>();
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


    //Coleccion de estudiantes
    public ArrayList<Estudiante> getColeccionEstudiantes() {
        return coleccionEstudiantes;
    }

    public void setColeccionEstudiantes(ArrayList<Estudiante> coleccionEstudiantes) {
        this.coleccionEstudiantes = coleccionEstudiantes;
    }


    //Metodo ver cantidad de estudiantes que posee la materia
    public int verCantidad() {
        return this.coleccionEstudiantes.size();
    }

    public String listarContenidos() {
        String str = "Listado de Estudiantes en la materia " + this.nombre + "\n";
        for (Estudiante est : this.coleccionEstudiantes) {
            str += est.getApellido();
            str += " " + est.getNombre() + " \n";
        }
        return str;
    }


    //Metodo Agregar Estudiante
        //Crear un obgeto alumno de tipo estudiante y pasarlo en main
    public void agregarEstidiante(Estudiante alumno){
        this.coleccionEstudiantes.add(alumno);
    }


    //Metodo Elliminar Estudiante
    public void  eliminarEstudiante(int legajoEstudiante) {
        Boolean contiene = false;
        for (Estudiante x : this.coleccionEstudiantes) {
            contiene = false;
            if (x.getLegajo() == legajoEstudiante) {
                this.coleccionEstudiantes.remove(x);
                contiene = true;
            }
        }
        if (contiene= true)  System.out.println("El estudiante a sido removido con exito.");

        else System.out.println("No se encontro el numero de legajo en la lista.");
    }


    //Cambiar el Titular de la materia
    public void modificarTitular(String nombre, String apellido, int legajo,double basico, int antiguedad){
        Profesor titular = new Profesor(nombre,apellido,legajo,basico,antiguedad);
        this.setTitular(titular);
    }

    public String toString() {
        String str = String.format("Materia %s\n" + "%s\n" + "%s\n",this.nombre, this.titular, this.coleccionEstudiantes);
        return str;
    }

}

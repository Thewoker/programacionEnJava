package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Carrera implements Informacion{
    private String nombre;
    private ArrayList<Materia> coleccionMaterias;
    Scanner s = new Scanner(System.in);

    public Carrera(String nombre, ArrayList<Materia> coleccionMaterias) {
        this.nombre = nombre;
        this.coleccionMaterias = coleccionMaterias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Materia> getColeccionMaterias() {
        return coleccionMaterias;
    }

    public void setColeccionMaterias(ArrayList<Materia> coleccionMaterias) {
        this.coleccionMaterias = coleccionMaterias;
    }

    @Override
    public int verCantidad() {
        return this.coleccionMaterias.size();
    }

    @Override
    public String listaContenidos() {
        String str = "Listado de Materias en la Carrera " + this.nombre + "\n";
        for (Materia x : this.coleccionMaterias) {
            str += x.getNombre() + "\n";
        }
        return str;
    }


    public void agregarMaterias(Materia materia){
        this.coleccionMaterias.add(materia);
    }

    public void eliminarMateria(String nombreMateria) {
        boolean contiene = false;
        for (Materia x : coleccionMaterias) {
            if (x.getNombre() == nombreMateria) {
                coleccionMaterias.remove(x);
                contiene = true;
            }
        }
        if (contiene)
            System.out.println("La materia fue removida exitosamente.");
        else
            System.out.println("La materia no fue encontrada dentro de la lista.");
    }

    public void encontrarMateria(String nombreMateria) {
        boolean contiene = false;
        for (Materia x : coleccionMaterias) {
            if (x.getNombre() == nombreMateria) {
                System.out.println(x.toString());
                contiene = true;
                System.out.println("Materia encontrada.\nDesea eliminar esta materia de la carrera?.\nY.Si\nN.No");
                String str = s.nextLine();
                if (str== "Y"|| str == "y"){
                    this.coleccionMaterias.remove(x);
                }
            }
        }
        if (contiene)
            System.out.println("Materia encontrada");

            else
            System.out.println("La materia no se encuentra en la lista");
    }

    public String toString() {
        String str = String.format("CARRERA %s\n" + "%s\n", this.nombre, this.coleccionMaterias);
        return str;
    }

}


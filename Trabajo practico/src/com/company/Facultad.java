package com.company;

import java.util.ArrayList;

public class Facultad implements Informacion{
    private String nombre;
    private ArrayList<Carrera> coleccionCarreras;

    public Facultad(String nombre, ArrayList<Carrera> coleccionCarreras) {
        this.nombre = nombre;
        this.coleccionCarreras = coleccionCarreras;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Carrera> getColeccionCarreras() {
        return coleccionCarreras;
    }

    public void setColeccionCarreras(ArrayList<Carrera> coleccionCarreras) {
        this.coleccionCarreras = coleccionCarreras;
    }



    @Override
    public int verCantidad() {
        return this.coleccionCarreras.size();
    }

    @Override
    public String listaContenidos() {
        String str = "Listado de Carreras de la Facultad " + this.nombre + "\n";
        for (Carrera x : this.coleccionCarreras) {
            str += x.getNombre() + "\n";
        }
        return str;
    }

    public void agergarCarrera(Carrera carrera) {
        this.coleccionCarreras.add(carrera);
    }

    public void removerCarrera(String nombreCarrera) {
        boolean contiene = false;
        for (Carrera x : coleccionCarreras) {
            if (x.getNombre() == nombreCarrera) {
                this.coleccionCarreras.remove(x);
                contiene = true;
            }
        }

        if (contiene)
            System.out.println("La carrera fue removida de la lista exitosamente");
        else
            System.out.println("La carrera no se encuentra en la lista: " + this.coleccionCarreras.toString());
    }

    public String toString() {
        String str = String.format("Facultad %s\n" + "%s", this.nombre, this.coleccionCarreras);
        return str;
    }

}


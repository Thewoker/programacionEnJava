package com.company;

import java.util.ArrayList;

public class Carrera implements Informacion{
    private String nombre;
    private ArrayList<Materia> coleccionMaterias;

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
        return 0;
    }

    @Override
    public String listaContenidos() {
        return null;
    }


    public void agregarMaterias(Materia materia){
        this.coleccionMaterias.add(materia);
    }

    public void eliminarMaterias(Materia materia){
        this.coleccionMaterias.remove(materia);
    }

    public void encontrarMaterias(Materia materia){

    }
}


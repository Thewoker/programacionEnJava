package com.company;

public class Caja {
    private int ancho;
    private int alto;
    private int profundo;
    private int vol;

    public Caja() {
    }

    public Caja(int ancho, int alto, int profundo) {
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }

    public int volumen(){
        vol = ancho * alto * profundo;
        return vol;
    }
}

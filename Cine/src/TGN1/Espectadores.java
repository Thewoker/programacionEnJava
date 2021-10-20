package TGN1;

public class Espectadores extends Persona{
    private String fila;
    private int silla;

    public Espectadores(String nombre, int edad, String fila, int silla){
        super(nombre, edad);
        this.fila = fila;
        this.silla = silla;
    }

    public String getButaca(){
        // Asignar a una butaca definida por la Fila (una letra) y la Silla (un entero entero).
        return "Butaca: " + fila + " " + silla;
    }

    public void setFila(String fila) {
        this.fila = fila;
    }

    public void setSilla(int silla) {
        this.silla = silla;
    }

    @Override
    public String getTipo() {
        return "Espectador";
    }

    @Override
    public String toString() {
        return "\n Nombre:" + getNombre() +
                ", Edad: " + getEdad() +
                ", Fila: " + fila  +
                ", Silla:" + silla;
    }
}

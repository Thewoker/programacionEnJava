package TGN1;

public class Acomodadores extends Empleados implements ParaAcomodadores{
    private Salas sala;

    public Acomodadores(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public Salas getSala() {
        return sala;
    }

    @Override
    public void setSala(Salas sala) {
        this.sala = sala;
    }

    @Override
    public String getTipo() {
        return "Acomodador";
    }

    @Override
    public String toString() {
        return "\nAcomodador:\n" +
                "nombre:" + getNombre() +
                ", edad: " + getEdad() +
                ", sala: " + sala.getNombre() + "\n";
    }
}

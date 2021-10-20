package TGN1;

import java.util.Scanner;
import java.util.ArrayList;

import static java.lang.Integer.parseInt;

public class Cine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Salas sala01 = new Salas(3, "Sala 01");
        sala01.setPelicula("Joker");
        sala01.setEspectadores(cargarEspectadores(scanner, sala01.getCapacidad()));
        System.out.println(sala01.toString());

        Acomodadores acomodador1 = new Acomodadores("Juan", 33);
        acomodador1.setSala(sala01);
        acomodador1.setSueldo(50000);
        System.out.println(acomodador1.toString());

        Empleados empleado1 = new Empleados("Carlos", 50);
        System.out.println(empleado1.toString());

        scanner.close();

    }

    private static Espectadores[] cargarEspectadores(Scanner s, int cantidad) {
        Espectadores[] espectadores = new Espectadores[cantidad];
        ArrayList <Integer> coleccionEspectadores;
        coleccionEspectadores = new ArrayList<>();


        System.out.println("Ingresar los siguientes datos de los espectadores: ");

        String nombre;
        String edadString;
        int edad = 0;
        String fila;
        String sillaString;
        int silla = 0;


        for(int i = 0; i < espectadores.length; i++){

            System.out.println("\nEspectador " + (i+1) + ": ");

            nombre = validacionString("nombre: ", s);

            System.out.print("Edad: ");
            edadString = s.nextLine();

            try {
                edad = parseInt(edadString);
            }catch (Exception e){
                System.out.println("ERROR EN EL INGRESO DE DATOS");
                System.exit(1); //Finalizar programa
            }

            fila = ingresarSoloLetras();

            boolean correcto = false;
            do{
                int auxiliar = cantidad;
                System.out.print("Silla: ");
                sillaString = s.nextLine();

                //Verifico que el usuario ingreso un numero
                try {
                    silla = parseInt(sillaString);

                }catch (Exception e){
                    System.out.println("Error. No has ingresado un numero");
                }

                    if (silla > 0 && silla <= cantidad ) {
                        if(coleccionEspectadores.contains(silla) == false) {
                            correcto = true;
                            auxiliar--;
                            coleccionEspectadores.add(silla);
                        }
                        else System.out.println("Silla no disponible. Intente nuevamente.");
                    } else {
                        System.out.println("La silla ingresada no existe");
                    }

            }while (correcto== false);

            try {
                silla = parseInt(sillaString);
            }catch (Exception e){
                System.out.println("ERROR EN EL INGRESO DE DATOS");
                System.exit(1); //Finalizar programa
            }

            espectadores[i] = new Espectadores(nombre, edad, fila, silla);

        }

        return espectadores;
    }

    //Verifica que la cadena ingresada no sea una cadena vacia
    public static String validacionString(String peticion, Scanner scanner){
        String s1;

        do {
            System.out.print(peticion);
            s1 = scanner.nextLine();
        }while (s1.equals(""));

        return s1;
    }



    public static String ingresarSoloLetras() {
        Scanner str = new Scanner(System.in);
        String letras;
        int cont = 0;
        boolean condicion = false;
        do{
            System.out.print("Fila: ");
            letras = str.nextLine();


            for (int i = 0; i<letras.length(); i++){
                if (Character.isLetter(letras.charAt(i))){
                    cont ++;
                }
                else{
                    cont =2;
                }
            }


            if (cont > 1){
                System.out.println("Error solo puede contener  1 letras. Intente de nuevo\n");
                condicion = false;
                cont = 0;
            }
            else {
                condicion = true;
            }
        }
        while (condicion == false);

        return letras;
    }
}

package TGN1;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

import static java.awt.SystemColor.info;
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
        ArrayList <Integer> coleccionEspectadoresA;
        coleccionEspectadoresA = new ArrayList<>();
        ArrayList <Integer> coleccionEspectadoresB;
        coleccionEspectadoresB = new ArrayList<>();
        ArrayList <Integer> coleccionEspectadoresC;
        coleccionEspectadoresC = new ArrayList<>();
        ArrayList <Integer> coleccionEspectadoresD;
        coleccionEspectadoresD= new ArrayList<>();
        ArrayList <Integer> coleccionEspectadoresE;
        coleccionEspectadoresE = new ArrayList<>();
        ArrayList <Integer> coleccionEspectadoresF;
        coleccionEspectadoresF = new ArrayList<>();


        System.out.println("Ingresar los siguientes datos de los espectadores: ");

        String nombre;
        String edadString;
        int edad = 0;
        String fila;
        String sillaString;
        int silla = 0;
        boolean varInfo = false;

        for(int i = 0; i < espectadores.length; i++){

            System.out.println("\nEspectador " + (i+1) + ": ");

            nombre = validacionString("nombre: ", s);

            do {

                System.out.print("Edad: ");
                edadString = s.nextLine();

                try {
                    edad = parseInt(edadString);
                    varInfo = true;
                } catch (Exception e) {
                    System.out.println("ERROR EN EL INGRESO DE DATOS");
                    varInfo = false;
                }
            }while(varInfo == false);

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

                //Agregar la fila a la condicion del if de abajo asi tambien tiene en cuenta la fila, y agregar un if por cada fila
                switch (fila) {
                    case "a": {
                        if (silla > 0 && silla <= cantidad) {
                            if (coleccionEspectadoresA.contains(silla) == false) {
                                correcto = true;
                                auxiliar--;
                                coleccionEspectadoresA.add(silla);
                            } else System.out.println("Silla no disponible. Intente nuevamente.");

                        } else {
                            System.out.println("La silla ingresada no existe");
                        }
                    }
                    break;

                    case "b": {
                        if (silla > 0 && silla <= cantidad) {
                            if (coleccionEspectadoresB.contains(silla) == false) {
                                correcto = true;
                                auxiliar--;
                                coleccionEspectadoresB.add(silla);
                            } else System.out.println("Silla no disponible. Intente nuevamente.");

                        } else {
                            System.out.println("La silla ingresada no existe");
                        }
                    }
                    break;

                    case "c": {
                        if (silla > 0 && silla <= cantidad) {
                            if (coleccionEspectadoresC.contains(silla) == false) {
                                correcto = true;
                                auxiliar--;
                                coleccionEspectadoresC.add(silla);
                            } else System.out.println("Silla no disponible. Intente nuevamente.");

                        } else {
                            System.out.println("La silla ingresada no existe");
                        }
                    }
                    break;

                    case "d": {
                        if (silla > 0 && silla <= cantidad) {
                            if (coleccionEspectadoresD.contains(silla) == false) {
                                correcto = true;
                                auxiliar--;
                                coleccionEspectadoresD.add(silla);
                            } else System.out.println("Silla no disponible. Intente nuevamente.");

                        } else {
                            System.out.println("La silla ingresada no existe");
                        }
                    }
                    break;

                    case "e": {
                        if (silla > 0 && silla <= cantidad) {
                            if (coleccionEspectadoresE.contains(silla) == false) {
                                correcto = true;
                                auxiliar--;
                                coleccionEspectadoresE.add(silla);
                            } else System.out.println("Silla no disponible. Intente nuevamente.");

                        } else {
                            System.out.println("La silla ingresada no existe");
                        }
                    }
                    break;

                    case "f": {
                        if (silla > 0 && silla <= cantidad) {
                            if (coleccionEspectadoresF.contains(silla) == false) {
                                correcto = true;
                                auxiliar--;
                                coleccionEspectadoresF.add(silla);
                            } else System.out.println("Silla no disponible. Intente nuevamente.");

                        } else {
                            System.out.println("La silla ingresada no existe");
                        }
                    }
                    break;

                    default: {
                        System.out.println("Error fila ingresada invalida o fuera de los limites.(Ingresa solo minusculas)");

                    }
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
        List<String> varLetras;
        varLetras = new ArrayList<>();
        varLetras.add("a");
        varLetras.add("b");
        varLetras.add("c");
        varLetras.add("d");
        varLetras.add("e");
        varLetras.add("f");

        do {
            do {
                System.out.print("Fila (a-f): ");
                letras = str.nextLine();
                cont = 0;

                for (int i = 0; i < letras.length(); i++) {
                    if (Character.isLetter(letras.charAt(i))) {
                        cont++;
                    } else {
                        cont = 2;
                    }
                }


                if (cont > 1) {
                    System.out.println("Error solo puede contener  1 letras. Intente de nuevo\n");
                    condicion = false;
                    cont = 0;
                } else {
                    condicion = true;
                }
            }
            while (condicion == false);
        }while(varLetras.contains(letras) == false);
        return letras;
    }
}

package com.company;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ValidacionDatos {
    private static String letras;
    private static Boolean condicion;
    private static double numerosD;
    private static int numeros;
    private static Scanner str = new Scanner(System.in);;
    private static int cont;


    //Metodo ingrese solo letras
    public static String ingresarSoloLetras() {

        do{
            letras = str.nextLine();



            for (int i = 0; i<letras.length();i++){
                if (!Character.isLetter(letras.charAt(i))){
                    cont ++;
                }
            }


            if (cont >= 1){
                System.out.println("Error solo puede contener letras. Intente de nuevo\n");
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



    //Metodo ingrese un legajo
    public static int ingresarSoloNumeros(){
            try{
                numeros = str.nextInt();
            }catch (Exception e){
                System.out.println("Error ingrese solo se pueden ingresar numeros.\n");
            }

        return numeros;
    }
    public static double ingresarSoloNumerosD(){
        try{
            numerosD = str.nextDouble();
        }catch (Exception e){
            System.out.println("Error ingrese solo se pueden ingresar numeros.\n");
        }

        return numerosD;
    }

}

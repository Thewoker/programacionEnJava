package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s =  new Scanner(System.in);
        CuentaCorriente cuenta1 = new CuentaCorriente();
        CuentaCorriente cuenta2 = new CuentaCorriente();


        //Input name
        System.out.println("Ingresa nombre del cliente");
        String nombre1 = s.nextLine();
        cuenta1.setNombreTitular(nombre1);


        //Input cash
        System.out.println("Ingresa el saldo del cliente");
        double saldo1 = s.nextDouble();
        cuenta1.setSaldo(saldo1);


        //input ID account
        System.out.println("Ingresa numero de cuenta del cliente");
        long numeroCuenta1 = s.nextLong();
        cuenta1.setNumeroCuenta(numeroCuenta1);


        //Cliente 2

        //Input name
        System.out.println("Ingresa nombre del cliente");
        String nombre2 = s.nextLine();
        cuenta1.setNombreTitular(nombre2);

        //Input cash
        System.out.println("Ingresa el saldo del cliente");
        double saldo2 = s.nextDouble();
        cuenta2.setSaldo(saldo2);


        //input ID account
        System.out.println("Ingresa numero de cuenta del cliente");
        long numeroCuenta2 = s.nextLong();
        cuenta2.setNumeroCuenta(numeroCuenta2);




        //Print info
        System.out.println("\n\nLos datos del cliente son:\n");
        System.out.println("Nombre:\t" + cuenta1.getNombreTitular());
        System.out.println("Saldo de la cuenta:\t" + cuenta1.getSaldo());
        System.out.println("Numero de Cuenta:\t" + cuenta1.getNumeroCuenta() );





        //Print info
        System.out.println("\n\nLos datos del cliente son:\n");
        System.out.println("Nombre:\t" + cuenta2.getNombreTitular());
        System.out.println("Saldo de la cuenta:\t" + cuenta2.getSaldo());
        System.out.println("Numero de Cuenta:\t" + cuenta2.getNumeroCuenta() );



        cuenta1.setSaldo(cuenta1.getSaldo() - 2500);
        cuenta2.setSaldo(cuenta2.getSaldo() + 2500);
        System.out.println("\n\nSaldo de la cuenta 1 es: " + cuenta1.getSaldo() + "\nSaldo de la cuenta 2 es: " + cuenta2.getSaldo());


    }
}

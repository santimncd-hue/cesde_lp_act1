package com.example;

public class ConversionDeTipos {
    public static void demostrarCastingImplicitito() {

        int numeroEntero = 10;
        double numeroDouble = numeroEntero;

        System.out.println("int convertido a double: " + numeroDouble);

    }

    public static void demostrarCastingExplicito() {
    
        double precio = 19.99;
        int precioEntero = (int) precio;

        System.out.println("double original: " + precio);
        System.out.println("double convertido a int: " + precioEntero);
    }

    public static void demostrarProblemasDePrecision() {

        long numerogrande = 40000;
        short numeroPequeno = (short) numerogrande;

        System.out.println("long original: " + numerogrande);
        System.out.println("short convertido: " + numeroPequeno);

    }
}
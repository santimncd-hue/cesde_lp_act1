package com.example;

public class Operadores {
    public static void demostrarAritmeticos() {
        
        double nota1 = 4.0;
        double nota2 = 3.5;
        double nota3 = 5.0;

        double promedio = (nota1 + nota2 + nota3) / 3;

        System.out.println("Promedio: " + promedio);
    }

    public static void demostrarIncrementoDecremento() {

         int x = 5;

        System.out.println("Postincremento x++: " + (x++));
        System.out.println("Valor después de x++: " + x);

        int y = 5;

        System.out.println("Preincremento ++y: " + (++y));
        System.out.println("Valor después de ++y: " + y);

    }

    public static void demostrarRelacionales() {
        // TODO
    }

    public static void demostrarLogicos() {

        int numero = 25;

        boolean resultado = numero > 10 && numero < 50;

        System.out.println("¿El número está entre 10 y 50?: " + resultado);

    }

    public static void demostrarAsignacionCompuesta() {
        // TODO
    }

    public static void demostrarOperadorTernario() {
        
        int valor = -3;

        String estado = (valor >= 0) ? "Positivo" : "Negativo";

        System.out.println("El número es: " + estado);
    }
}
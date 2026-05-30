package com.example;

import java.util.Scanner;

public class EstructurasDeRepeticion {
    public static void ejemploWhile() {

        int contador = 10;

        while (contador >= 1) {

            System.out.println(contador);
            contador--;
        }
    }

    public static void ejemploDoWhile() {
        
        Scanner sc = new Scanner(System.in);

        int numero;

        do {
            System.out.print("Escribe un número (0 para salir): ");
            numero = sc.nextInt();

        } while (numero != 0);
    }

    public static void ejemploForClasico() {
        // TODO
    }

    public static void ejemploForAnidado() {

         for (int i = 1; i <= 10; i++) {

            System.out.println("Tabla del " + i);

            for (int j = 1; j <= 10; j++) {
            System.out.println(i + " x " + j + " = " + (i * j));
            }

            System.out.println();
        }
    }

    public static void ejemploBreakContinue() {
        
        
    }

    public static void ejemploEtiquetas() {
        // TODO
    }
}
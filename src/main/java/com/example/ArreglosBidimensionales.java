package com.example;

public class ArreglosBidimensionales {
    public static void declararCrearMatrices() {
        
        int[][] matriz = {
            {1, 2},
            {3, 4}
        };

        System.out.println(matriz[0][0]);
        System.out.println(matriz[1][1]);
    }

    public static void recorrerMatriz() {
        
         int[][] numeros = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

    }

    public static void ejemploUsosTipicos() {
        int[][] numeros = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int suma = 0;

        for (int i = 0; i < numeros.length; i++) {

            for (int j = 0; j < numeros[i].length; j++) {

                suma += numeros[i][j];
            }
        }

        System.out.println("Suma total: " + suma);
    }

    }

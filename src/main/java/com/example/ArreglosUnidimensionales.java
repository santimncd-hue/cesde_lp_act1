package com.example;

public class ArreglosUnidimensionales {
    public static void declararCrearInicializar() {
          
       int edad = 18;
       String nombre = "Santi";

  
    int[] numeros = {1, 2, 3, 4, 5};

    System.out.println("Nombre: " + nombre);
    System.out.println("Edad: " + edad);
}
    
    
    public static void mostrarLongitud() {
        int[] numeros = {10, 20, 30, 40, 50};

            System.out.println("Longitud del arreglo: " + numeros.length);
    }

    public static void recorrerConForClasico() {

         String[] peliculas = {
          "Matrix",
          "Interstellar",
          "Avatar",
          "Titanic",
          "Inception"
    };

    for (int i = 0; i < peliculas.length; i++) {
        System.out.println(peliculas[i]);
    }
    }

    public static void recorrerConForEach() {
        String[] peliculas = {
          "Matrix",
          "Interstellar",
          "Avatar",
          "Titanic",
          "Inception"
    };

    for (String pelicula : peliculas) {
        System.out.println(pelicula);
    }
    }

    public static int[] arrayComoParametroYRetorno(int[] array) {
         int[] invertido = new int[array.length];

          for (int i = 0; i < array.length; i++) {
          invertido[i] = array[array.length - 1 - i];
    }
        
        return array;
    }
}
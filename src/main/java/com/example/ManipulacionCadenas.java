package com.example;

public class ManipulacionCadenas {
    public static void demostrarConcatenacion() {
        
    }

    public static void demostrarMetodosUtiles() {
        
        String texto = "   Hola Mundo Java   ";

        System.out.println(texto.trim());

        System.out.println(texto.replace("a", "@"));

        String[] palabras = texto.trim().split(" ");

        for (String palabra : palabras) {
            System.out.println(palabra);
        }

    }

    public static void demostrarInmutabilidad() {

        String nombre = "Santi";

        String nuevoNombre = nombre.toUpperCase();

        System.out.println(nombre);
        System.out.println(nuevoNombre);

    }

    public static void usarStringBuilder() {
        
         StringBuilder sb = new StringBuilder();

        sb.append("Java ");
        sb.append("es ");
        sb.append("muy ");
        sb.append("útil.");

        System.out.println(sb);
    
        }
    }
package com.example;

public class VariablesYConstantes {
    public static void demostrarDeclaracionAsignacion() {        
        int edad = 20;
        double estatura = 1.8;
        System.out.println(edad);
        System.out.println(estatura);
    }

    public static void demostrarConvencionesNombres() {
        int puntuacionmaxjuego = 100;
        String nombreusuario = "Santi";
        double promedioNotasEstudiante = 4.5;

        System.out.println("Puntuación máxima: " + puntuacionmaxjuego);
        System.out.println("Nombre: " + nombreusuario);
        System.out.println("Promedio: " + promedioNotasEstudiante);
    }

    public static void demostrarConstantes() {
        final double PI = 3.1416;
    }
}
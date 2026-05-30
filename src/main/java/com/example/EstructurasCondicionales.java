package com.example;

public class EstructurasCondicionales {
    public static void ejemploIf() {
        // TODO
    }

    public static void ejemploIfElse() {

        int edad = 20;

        if (edad >= 18) {
            System.out.println("Puede votar");
        } else {
            System.out.println("No puede votar");
        }

    }

    public static void ejemploIfElseIfElse() {
        // TODO
    }

    public static void ejemploSwitch() {

        int dia = 3;

        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;

            case 2:
                System.out.println("Martes");
                break;

            case 3:
                System.out.println("Miércoles");
                break;

            case 4:
                System.out.println("Jueves");
                break;

            case 5:
                System.out.println("Viernes");
                break;

            case 6:
                System.out.println("Sábado");
                break;

            case 7:
                System.out.println("Domingo");
                break;

            default:
                System.out.println("Número inválido");
        }
    }

    public static void ejemploSwitchExpression() {
        String estacion = "Verano";

        String actividad = switch (estacion) {
            case "Verano" -> "Ir a la playa";
            case "Invierno" -> "Tomar chocolate caliente";
            case "Primavera" -> "Ver flores";
            case "Otoño" -> "Caminar entre hojas";
            default -> "Estación no válida";
        };

        System.out.println("Actividad: " + actividad);
    
        }
    }
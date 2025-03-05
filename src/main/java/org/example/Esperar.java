package org.example;

public class Esperar {
    public static void esperar(int segundos) {
        try {
            Thread.sleep(segundos * 1000); // Convierte segundos a milisegundos
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

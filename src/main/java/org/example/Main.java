package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();
        boolean i = true;
        while (i==true){
            System.out.println("Bienvenido a la Biblioteca Virtual\n" +
                    "Menu:\n" +
                    "1) Agregar un libro.\n" +
                    "2) Buscar libro por titulo.\n" +
                    "3) Buscar libro por autor.\n" +
                    "4) Lista de todos los libros.\n" +
                    "5) Salir de la biblioteca.\n" +
                    "Digite la opción que desea elegir:");
            int elec = scanner.nextInt();
            scanner.nextLine();
            switch (elec){
                case 1:
                    System.out.println("Ingrese el titulo del libro:");
                    String titulo = scanner.nextLine();
                    System.out.println("Ingrese el autor del libro "+titulo+":");
                    String autor = scanner.nextLine();
                    System.out.println("Ingrese el isbn del libro "+titulo+":");
                    String isbn = scanner.nextLine();

                    Libro libro = new Libro(titulo,autor,isbn,true);
                    biblioteca.agregarLibros(libro);
                    Esperar.esperar(2);
                    break;
                case 2:
                    System.out.println("Ingrese el titulo del libro que busca: ");
                    String tituloUsuario = scanner.nextLine();
                    biblioteca.buscarPorTitulo(tituloUsuario);
                    Esperar.esperar(3);
                    break;
                case 3:
                    System.out.println("Ingrese el autor del libro que busca: ");
                    String autorUsuario = scanner.nextLine();
                    biblioteca.buscarPorAutor(autorUsuario);
                    Esperar.esperar(3);
                    break;
                case 4:
                    biblioteca.listarLibros();
                    Esperar.esperar(3);
                    break;
                case 5:
                    System.out.println("Gracias por usar la Biblioteca Virtual");
                    System.out.println("Saliendo...");
                    i=false;
                    Esperar.esperar(3);
                    break;
                default:
                    System.out.println("Digitaste una opción incorrecta");
                    Esperar.esperar(3);
                    break;
            }
        }
    }
}
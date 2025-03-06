
package org.example;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Libro> libros;

    public Biblioteca() {
        this.libros = new ArrayList<>();
    }

    public void agregarLibros(Libro libro) {
        libros.add(libro);
        System.out.println("Libro agregado correctamente. \n");
    }

    public void buscarPorTitulo(String titulo) {
        boolean libroEncontrado = false;
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                System.out.println("✅ Libro encontrado:");
                libro.mostarInfo();
                libroEncontrado = true;
                break; // Salimos del bucle porque ya encontramos el libro
            }
        }
        if (!libroEncontrado) {
            System.out.println("❌ El libro no está en la base de datos.\n");
        }
    }

    public void buscarPorAutor(String autor) {
        boolean libroEncontrado = false;
        for (Libro libro : libros) {
            if (libro.getAutor().equalsIgnoreCase(autor)) {
                libro.mostarInfo(); // Corregido: antes estaba como mostarInfo()
                libroEncontrado = true;
            }
        }
        if (!libroEncontrado) {
            System.out.println("No se encontraron libros de este autor en la base de datos. \n");
        }
    }

    public void listarLibros() {
        if (libros.isEmpty()) {
            System.out.println("No hay libros en la biblioteca. \n");
            return;
        }
        System.out.println("Lista de Libros: ");
        for (Libro libro : libros) {
            libro.mostarInfo(); // Corregido: antes estaba como mostarInfo()
        }
    }
}

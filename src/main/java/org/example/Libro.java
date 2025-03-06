package org.example;
import java.security.PrivateKey;
public class Libro {
    private String titulo;
    private String autor;
    private String isbn;
    private boolean disponible;
    public Libro (String titulo, String autor, String isbn, boolean disponible){
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.disponible = true;
    }
    public String getTitulo (){
        return titulo;
    }
    public String getAutor (){
        return autor;
    }
    public String getIsbn (){
        return isbn;
    }
    public boolean estaDisponible () {
        return disponible;
    }

    public void setDisponible (){
        this.disponible= disponible;
    }
    public void setDisponible(boolean disponible){
        System.out.println("Titulo"+titulo);
        System.out.println("Autor"+autor);
        System.out.println("Isbn"+isbn);
        System.out.println("Disponible"+(disponible?"Si":"No"));
        System.out.println("|---------------------------------|");
    }

    public void mostarInfo() {
        System.out.println("📖 Título: " + titulo);
        System.out.println("✍️ Autor: " + autor);
        System.out.println("🔢 ISBN: " + isbn);
        System.out.println("📌 Disponible: " + (disponible ? "Sí" : "No"));
        System.out.println("---------------------------------");


    }
}


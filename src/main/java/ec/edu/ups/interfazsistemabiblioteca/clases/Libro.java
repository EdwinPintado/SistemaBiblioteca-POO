
package ec.edu.ups.interfazsistemabiblioteca.clases;

import ec.edu.ups.interfazsistemabiblioteca.clases.Autor;

/**
 *
 * @author kevin and Edwin
 */

public class Libro {

    private String isbn;
    private String titulo;
    private String editorial;
    private String anioPublicacion;
    
    private boolean disponible;
    private Autor autor;

    public Libro() {
    }

    public Libro(String isbn, String titulo, String editorial, String anioPublicacion) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.editorial = editorial;
        this.anioPublicacion = anioPublicacion;
    }

    public Libro(String isbn, String titulo, String editorial, String anioPublicacion, boolean disponible, Autor autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.editorial = editorial;
        this.anioPublicacion = anioPublicacion;
        this.disponible = disponible;
        this.autor = autor;
        
        this.disponible = true;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(String anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
    public boolean estaDisponible(){
        return disponible;
    }
    
    public void noEstaDisponible(boolean disponible){
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "Libro con " + "ISBN: " + isbn + "\ntitulo: " + titulo + "\neditorial: " + editorial + "\nanioPublicacion: " + anioPublicacion + "\nautor: " + autor + "\n";
    } 
}
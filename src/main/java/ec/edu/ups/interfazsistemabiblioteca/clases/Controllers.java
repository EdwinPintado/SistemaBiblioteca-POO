
package ec.edu.ups.interfazsistemabiblioteca.clases;

import java.awt.TextArea;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author katherine
 */
public class Controllers {
    

      private ArrayList<Autor> autores = new ArrayList<>();
    private ArrayList<Libro> libros = new ArrayList<>();
    private ArrayList<Usuario> usuarios = new ArrayList<>();
    private ArrayList<Bibliotecario> bibliotecarios = new ArrayList<>();
    private List<Prestamo> prestamos = new ArrayList<>();

    public ArrayList<Autor> getAutores() {
        return autores;
    }
    

    

    public void setAutores(ArrayList<Autor> autores) {
        this.autores = autores;
    }

    public Autor crearAutor(String cedula, String nombre, String ape,
            String tel, int dia, int mes, int anio,
            String nacionalidad, String generoLiterario,
            String bibliografia) {

        java.util.Date fNacimie = new java.util.Date(anio - 1900, mes - 1, dia);

        Autor autor = new Autor(cedula, nombre, ape, tel, fNacimie, nacionalidad, generoLiterario, bibliografia);
        autores.add(autor);

        System.out.println("Se guardo su autor :) ");
        return autor;
    }

    public ArrayList<Autor> mostrarAutor() {

        return autores;
    }

    public Prestamo crearPrestamo(int dia,
            int mes,
            int anio,
            int dia1,
            int mes2,
            int anio2,
            
            Usuario usuario,
            List<Libro> libros) {

        Date fechaSalida = new Date(anio - 1900, mes - 1, dia);
        Date fechaLimite = new Date(anio - 1900, mes - 1, dia);

        Prestamo prestamo = new Prestamo(
                fechaSalida,
                null,
                fechaLimite,
                
                usuario,
                libros
        );

        prestamos.add(prestamo);

        System.out.println("Préstamo guardado");

        return prestamo;

    }

    public boolean registrarDevolucion(Prestamo prestamo) {
        if (prestamo == null) {
                System.out.println("Prestamo no existe");
                return false;
            }
        prestamo.setFechaDevolucion(new Date());
        for(Libro libro : prestamo.getLibros()){
            libro.setDisponible(true);
        }
        System.out.println("Devolucion registrada");
        return true;

    }

    public Prestamo buscarPrestamo(String cedulaUsuario) {
        for (Prestamo prestamo : prestamos) {
            if (prestamo.getUsuario().getCedula().equals(cedulaUsuario))
            return prestamo;
        }
        return null;
    }
    // LIBROS
    
    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }
    
    public Libro crearLibro(String ISBN, String Titulo, String Editorial,
           int dia, int mes, int anio,
            Autor autor) {

        java.util.Date anioPublicacion = new java.util.Date(anio - 1900, mes - 1, dia);

        Libro libro = new Libro(ISBN, Titulo, Editorial,  anioPublicacion,  autor);
        libros.add(libro);

        System.out.println("Se guardo su libro :) ");
        return libro;
    }

    public ArrayList<Libro> mostrarLibro() {

        return libros;
    }
    
    // USUARIO
    
    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public Usuario crearUsuario(String cedula, String nombre, String ape,
            String tel, int dia, int mes, int anio,
            String correoElectronico, String direccion) {

        java.util.Date fNacimie = new java.util.Date(anio - 1900, mes - 1, dia);

        Usuario usuario = new Usuario(cedula, nombre, ape, tel, fNacimie, correoElectronico, direccion);
        usuarios.add(usuario);

        System.out.println("Se guardo su usuario :) ");
        return usuario;
    }

    public ArrayList<Usuario> mostrarUsuario() {
        return usuarios;
    }
    
    // BIBLIOTECARIO
    
    public ArrayList<Bibliotecario> getBibliotecarios() {
        return bibliotecarios;
    }

    public void setiBibliotecarios(ArrayList<Bibliotecario> bibliotecarios) {
        this.bibliotecarios = bibliotecarios;
    }

    public Bibliotecario crearBibliotecario(String cedula, String nombre, String ape,
            String tel, int dia, int mes, int anio,
            String codigo, String turno,
            String cargo) {

        java.util.Date fNacimie = new java.util.Date(anio - 1900, mes - 1, dia);

        Bibliotecario bibliotecario = new Bibliotecario(cedula, nombre, ape, tel, fNacimie, codigo, turno, cargo);
        bibliotecarios.add(bibliotecario);

        System.out.println("Se guardo su bibliotecario :) ");
        return bibliotecario;
    }

    public ArrayList<Bibliotecario> mostrarBibliotecario() {

        return bibliotecarios;
    }


}
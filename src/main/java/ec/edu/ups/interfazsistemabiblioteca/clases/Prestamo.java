package ec.edu.ups.interfazsistemabiblioteca.clases;


import ec.edu.ups.interfazsistemabiblioteca.clases.Bibliotecario;
import ec.edu.ups.interfazsistemabiblioteca.clases.Libro;
import ec.edu.ups.interfazsistemabiblioteca.clases.Usuario;
import java.util.Date;
import java.util.List;


/**
 *
 * @author kevin and Edwin
 */

public class Prestamo {
    private Date fechaSalida;
    private Date fechaDevolucion;
    private Date fechaLimite;
    

    
    private Bibliotecario bibliotecario;
    private Usuario usuario;
    
    // aqui se hace la asigno asignacion entre libro y prestamo 
    private  List<Libro> libros;

    public Prestamo() {
    }

    public Prestamo(Date fechaSalida, Date fechaDevolucion, Date fechaLimite, Bibliotecario bibliotecario, Usuario usuario, List<Libro> libros) {
        this.fechaSalida = fechaSalida;
        this.fechaDevolucion = fechaDevolucion;
        this.fechaLimite = fechaLimite;
        this.bibliotecario = bibliotecario;
        this.usuario = usuario;
        this.libros = libros;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public Date getFechaLimite() {
        return fechaLimite;
    }

    public void setFechaLimite(Date fechaLimite) {
        this.fechaLimite = fechaLimite;
    }

    public Bibliotecario getBibliotecario() {
        return bibliotecario;
    }

    public void setBibliotecario(Bibliotecario bibliotecario) {
        this.bibliotecario = bibliotecario;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }
    
 
}
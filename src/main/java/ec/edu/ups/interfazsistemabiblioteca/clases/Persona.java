
package ec.edu.ups.interfazsistemabiblioteca.clases;

import java.util.Date;

/**
 *
 * @author kevin and Edwin
 */

public class Persona {
    private String cedula;
    private String nombre;
    private String apellido;
    private String telefono;
    private Date fechaNacimiento;

    public Persona() {
    }
    
    

    public Persona(String cedula, String nombre, String apellido, String telefono, Date fechaNacimiento) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Date getFechaNacimineto() {
        return fechaNacimiento;
    }

    public void setFechaNacimineto(Date fechaNacimineto) {
        this.fechaNacimiento = fechaNacimineto;
    }
    public void mostrarDatos(){
        System.out.println("Nombre:" + nombre + apellido);
        System.out.println("Cedula: " + cedula);
        System.out.println("Telefono: " + telefono );
        System.out.println("Fecha de nacimiento: " + fechaNacimiento);
    }
    @Override
    public String toString() {
        return "\nPersona con " + "cedula: " + cedula + "\nNombre: " + nombre + "\nApellido: " + apellido + "\nTelefono: " + telefono + "\nFechaNacimiento: " + fechaNacimiento ;
    }  
}
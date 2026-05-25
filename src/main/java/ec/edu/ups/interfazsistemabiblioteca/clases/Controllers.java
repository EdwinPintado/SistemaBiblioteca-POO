/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
            Bibliotecario bibliotecario,
            List<Libro> libros) {

        Date fechaSalida = new Date(anio- 1900,mes-1,dia);
        Date fechaLimite = new Date(anio-1900,mes-1,dia);

            Prestamo prestamo = new Prestamo(
                    fechaSalida,
                    null,
                    fechaLimite,
                    bibliotecario,
                    null,
                    libros
            );

            prestamos.add(prestamo);

            System.out.println("Préstamo guardado");

            return prestamo;

        
    }
}

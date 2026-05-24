/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.interfazsistemabiblioteca.clases;

import java.util.ArrayList;


/**
 *
 * @author katherine
 */
public class Controllers {
    private ArrayList<Autor> autores = new ArrayList<>();
    
    public  Autor crearAutor(String cedula, String nombre, String ape,
                            String tel, int dia, int mes, int anio,
                            String nacionalidad, String generoLiterario,
                            String bibliografia) {
       
        java.util.Date fNacimie = new java.util.Date(anio - 1900, mes - 1, dia);

       

        Autor autor = new Autor(cedula, nombre, ape, tel, fNacimie, nacionalidad, generoLiterario, bibliografia);
        autores.add(autor);

        System.out.println("Se guardo su autor :) ");
        return autor;
    }

}

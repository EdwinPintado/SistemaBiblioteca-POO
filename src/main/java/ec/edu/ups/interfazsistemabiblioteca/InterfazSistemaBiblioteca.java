/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ec.edu.ups.interfazsistemabiblioteca;

import ec.edu.ups.interfazsistemabiblioteca.clases.Controllers;
import ec.edu.ups.interfazsistemabiblioteca.clases.EsquemaRaton;
import ec.edu.ups.interfazsistemabiblioteca.clases.Informacion;
import ec.edu.ups.interfazsistemabiblioteca.clases.PrestamosInterfaz;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.Point;

/**
 *
 * @author katherine
 */
public class InterfazSistemaBiblioteca {

    public static void main(String[] args) {
        Controllers con = new Controllers();
        Frame miVentana = new Frame();
        miVentana.setSize(500, 200);
        miVentana.setTitle("Biblioteca Sistema");

        miVentana.setBackground(Color.blue);
        miVentana.setLayout(new BorderLayout());
        Panel miPanel = new Panel(new GridLayout(2, 1));
        Label titulo = new Label("Le damos la bienvenida al sistema biblioteca , dirigida a cada estudiante con el objetivo ", Label.CENTER);
        Label titulo2 = new Label("de dar acceso a la educacion y conocimiento ,ofreciendo una gran variedad de opciones dirigidas a nuestros usuario...:)", Label.CENTER);
        miPanel.add(titulo);
        miPanel.add(titulo2);
        titulo.setBounds(10, 20, 150, 134);
        titulo.setBackground(Color.green);
        titulo.setFont(new Font("Allura", Font.PLAIN, 13));
        titulo.setForeground(Color.blue);
        titulo2.setBounds(10, 20, 150, 134);
        titulo2.setBackground(Color.black);
        titulo2.setFont(new Font("Allura", Font.PLAIN, 13));
        titulo2.setForeground(Color.green);
        miVentana.add(miPanel);
        miVentana.setLocation(new Point(100, 200));
        miVentana.setVisible(true);

        Panel miPanel2 = new Panel();
        miPanel2.setLayout(new GridLayout(4, 2, 5, 5));
        miPanel2.setPreferredSize(new Dimension(300, 500));
        Button boton1 = new Button("Autor");

        boton1.addMouseListener(new EsquemaRaton(con));

        miPanel2.add(boton1);
        Panel mipanel3 = new Panel();
        mipanel3.setLayout(new GridLayout(300, 500));
        mipanel3.setPreferredSize(new Dimension(300, 500));
        Button boton2 = new Button("Informacion Autor");
        
        boton2.addMouseListener(new Informacion(con));
        miPanel2.add(boton2);

        miPanel2.add(new Button("Usuario"));
        miPanel2.add(new Button("Informacion Usuario"));
        miPanel2.add(new Button("Libro"));
        miPanel2.add(new Button("Informacion Libro"));
        Panel mipanel7 = new Panel();
        mipanel7.setLayout(new GridLayout(300,500));
        mipanel7.setPreferredSize(new Dimension(300,500));
        Button b7 = new Button("Prestamo");
        b7.addMouseListener(new PrestamosInterfaz());
        miPanel2.add(b7);
        miPanel2.add(new Button("Devoluciones"));
        Panel c = new Panel(new FlowLayout(FlowLayout.CENTER, 20, 20));
        c.add(miPanel2);

        miVentana.add(miPanel, BorderLayout.NORTH);
        miVentana.add(c, BorderLayout.CENTER);

    }

}

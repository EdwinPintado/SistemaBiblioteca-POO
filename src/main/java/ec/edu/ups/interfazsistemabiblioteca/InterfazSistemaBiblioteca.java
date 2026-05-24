/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.ups.interfazsistemabiblioteca;

import ec.edu.ups.interfazsistemabiblioteca.clases.EsquemaRaton;
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
        Frame miVentana = new Frame();
        miVentana.setSize(500,200);
        miVentana.setTitle("Biblioteca Sistema");
        
        miVentana.setBackground(Color.blue);
        miVentana.setLayout(new BorderLayout());
        Panel miPanel = new Panel(new GridLayout(2,1));
        Label titulo = new Label("Le damos la bienvenida al sistema biblioteca , dirigida a cada estudiante con el objetivo ",Label.CENTER );
        Label titulo2 = new Label("de dar acceso a la educacion y conocimiento ,ofreciendo una gran variedad de opciones dirigidas a nuestros usuario...:)",Label.CENTER);
        miPanel.add(titulo);
        miPanel.add(titulo2);
        titulo.setBounds(10,20,150,134);
        titulo.setBackground(Color.green);
        titulo.setFont(new Font("Allura",Font.PLAIN,13));
        titulo.setForeground(Color.blue);
        titulo2.setBounds(10, 20, 150,134);
        titulo2.setBackground(Color.black);
        titulo2.setFont(new Font("Allura",Font.PLAIN,13));
        titulo2.setForeground(Color.green);
        miVentana.add(miPanel);
        miVentana.setLocation(new Point(100,200));
        miVentana.setVisible(true);
        
        Panel miPanel2 = new Panel();
        miPanel2.setLayout(new GridLayout(4,2,5,5));
        miPanel2.setPreferredSize(new Dimension(300,500));
        Button boton1 = new Button("Autor");
        boton1.addMouseListener(new EsquemaRaton());
        miPanel2.add(boton1);
        miPanel2.add(new Button("Informacion Autor"));
        miPanel2.add(new Button("Usuario"));
        miPanel2.add(new Button("Informacion Usuario"));
        miPanel2.add(new Button("Libro"));
        miPanel2.add(new Button("Informacion Libro"));
        miPanel2.add(new Button("Prestamos"));
        miPanel2.add(new Button("Devoluciones"));
        Panel c = new Panel(new FlowLayout(FlowLayout.CENTER,20,20));
        c.add(miPanel2);
        
        miVentana.add(miPanel,BorderLayout.NORTH);
        miVentana.add(c,BorderLayout.CENTER);
       
        
        
        
        
    }
    
}



package ec.edu.ups.interfazsistemabiblioteca;

import ec.edu.ups.interfazsistemabiblioteca.clases.Controllers;
import ec.edu.ups.interfazsistemabiblioteca.clases.Controllers;
import ec.edu.ups.interfazsistemabiblioteca.clases.Devolucion;
import ec.edu.ups.interfazsistemabiblioteca.clases.Devolucion;
import ec.edu.ups.interfazsistemabiblioteca.clases.EsquemaRaton;
import ec.edu.ups.interfazsistemabiblioteca.clases.EsquemaRaton;
import ec.edu.ups.interfazsistemabiblioteca.clases.EsquemaRatonLibros;
import ec.edu.ups.interfazsistemabiblioteca.clases.EsquemaRatonUser;
import ec.edu.ups.interfazsistemabiblioteca.clases.Informacion;
import ec.edu.ups.interfazsistemabiblioteca.clases.Informacion;
import ec.edu.ups.interfazsistemabiblioteca.clases.InformacionL;
import ec.edu.ups.interfazsistemabiblioteca.clases.InformacionU;
import ec.edu.ups.interfazsistemabiblioteca.clases.PrestamosInterfaz;
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
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author katherine
 */
public class InterfazSistemaBiblioteca implements MouseListener{

    

    @Override
    public void mouseClicked(MouseEvent e) {
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
        boton1.setBackground(Color.DARK_GRAY);

        miPanel2.add(boton1);
        Panel mipanel3 = new Panel();
        mipanel3.setLayout(new GridLayout(300, 500));
        mipanel3.setPreferredSize(new Dimension(300, 500));
        Button boton2 = new Button("Informacion Autor");
        
        boton2.addMouseListener(new Informacion(con));
        miPanel2.add(boton2);
        boton2.setBackground(Color.DARK_GRAY);
        Button b3 = new Button("Usuario");
        b3.addMouseListener(new EsquemaRatonUser(con));
        b3.setBackground(Color.DARK_GRAY);
        miPanel2.add(b3);
        Button b4 = new Button("Informacion Usuario");
        b4.addMouseListener(new InformacionU(con));
        b4.setBackground(Color.DARK_GRAY);
        
        miPanel2.add(b4);
        Button b5 = new Button("Libro");
        b5.setBackground(Color.DARK_GRAY);
        b5.addMouseListener(new EsquemaRatonLibros(con));
        b5.setBackground(Color.DARK_GRAY);
        miPanel2.add(b5);
        Button b6 = new Button("Informacion Libro");
        b6.setBackground(Color.DARK_GRAY);
        b6.addMouseListener(new InformacionL(con));
        b6.setBackground(Color.DARK_GRAY);
        miPanel2.add(b6);
        Panel mipanel7 = new Panel();
        mipanel7.setLayout(new GridLayout(500,500));
        mipanel7.setPreferredSize(new Dimension(300,500));
        Button b7 = new Button("Prestamo");
        b7.setBackground(Color.DARK_GRAY);
        b7.addMouseListener(new PrestamosInterfaz(con));
        miPanel2.add(b7);
        Button b8 = new Button("Devoluciones");
        b8.setBackground(Color.DARK_GRAY);
        b8.addMouseListener(new Devolucion(con));
        miPanel2.add(b8);
        Panel panel1 = new Panel(new FlowLayout());
        Button cancelar = new Button("Regresar");
        panel1.add(cancelar);
        
        cancelar.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent e) {
                miVentana.dispose();
            }

            @Override
            public void mousePressed(MouseEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void mouseExited(MouseEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
            
        });
        
        Panel c = new Panel(new FlowLayout(FlowLayout.CENTER, 20, 20));
        c.add(miPanel2);
        miVentana.add(panel1,BorderLayout.SOUTH);
        miVentana.add(miPanel, BorderLayout.NORTH);
        miVentana.add(c, BorderLayout.WEST);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseExited(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}

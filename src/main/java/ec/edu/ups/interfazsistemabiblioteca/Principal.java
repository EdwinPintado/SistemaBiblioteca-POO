
package ec.edu.ups.interfazsistemabiblioteca;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author katherine
 */
public class Principal {
    public static void main(String[] args){
        Frame ventanita = new Frame();
        ventanita.setSize(600,400);
        ventanita.setBackground(Color.blue);
        ventanita.setLayout(null);
        Panel panel= new Panel();
        panel.setBounds(180,80,240,220);
        panel.setBackground(Color.white);
        panel.setLayout(null);
        
        Label titulo= new Label("Sistema Biblioteca");
        titulo.setBackground(Color.white);
        titulo.setFont(new Font("Arial", Font.BOLD, 20));
        titulo.setBounds(30, 60, 180, 30);
        Button ingresar = new Button("Ingresar");
        ingresar.setBounds(50, 110, 140, 40);
        ingresar.addMouseListener(new InterfazSistemaBiblioteca());
        Button salir = new Button("Salir");
        salir.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent e) {
                System.exit(0);
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
        salir.setBounds(50, 170, 140, 40);
        
        panel.add(titulo);
        panel.add(ingresar);
        panel.add(salir);
        ventanita.add(panel);
        ventanita.setVisible(true);
        
    }
}


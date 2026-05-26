package ec.edu.ups.interfazsistemabiblioteca.clases;

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
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author kevin and kevin
 */
public class Devolucion extends MouseAdapter {

    private Controllers con;

    public Devolucion(Controllers con) {
        this.con = con;
    }
    TextField txtCedula = new TextField();
    TextField txtISBN = new TextField();

    TextField txtDia = new TextField();
    TextField txtMes = new TextField();
    TextField txtAño = new TextField();

    @Override
    public void mouseClicked(MouseEvent evento) {

        Frame ventana = new Frame("Registro de Prestamos");

        ventana.setSize(700, 500);
        ventana.setLayout(new BorderLayout());
        ventana.setBackground(Color.gray);

        Panel menu = new Panel(new GridLayout(6, 1, 5, 5));
        menu.setBackground(Color.LIGHT_GRAY);
        
        Button cerrar = new Button("Cerrar");
        
        cerrar.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent e) {
             ventana.dispose();
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
        Button b1 = new Button("Registrar Libros");
        b1.addMouseListener(new EsquemaRatonLibros(con));
        menu.add(b1);
        Button b2 = new Button("Registrar Usuario");
        b2.addMouseListener(new EsquemaRatonUser(con));
        menu.add(b2);
        Button autor = new Button("Registrar Autor");
        autor.addMouseListener(new EsquemaRaton(con));
        menu.add(autor);
        Button pre = new Button("Prestamos");
        pre.addMouseListener(new PrestamosInterfaz(con));
        menu.add(pre);

        menu.add(cerrar);

        ventana.add(menu, BorderLayout.WEST);

        Panel panelTitulo = new Panel();

        Label titulo = new Label("Devoluciones");
        titulo.setFont(new Font("Arial", Font.BOLD, 20));

        panelTitulo.add(titulo);

        ventana.add(panelTitulo, BorderLayout.NORTH);

        Panel panelForm = new Panel();
        panelForm.setLayout(new GridLayout(2, 1, 10, 10));

        Panel fila = new Panel(new GridLayout(2,1));
        Label l1 = new Label("Ingrese la cedula");
        Label l3 = new Label("Ingrese el ISBN del libro");
        Label l4 = new Label("Fecha de devolucion");
        Panel fechaPanel = new Panel();
        fechaPanel.add(txtDia);
        fechaPanel.add(new Label("/"));

        fechaPanel.add(txtMes);
        fechaPanel.add(new Label("/"));

        fechaPanel.add(txtAño);
        
        
        Panel l2 = new Panel(new GridLayout(1, 2, 10, 10));

        Button guardar = new Button("Registrar");
        Button cerar = new Button("Cancelar");

        cerar.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                ventana.dispose();
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });

        fila.add(l1);
        fila.add(txtCedula);
        fila.add(l3);
        fila.add(txtISBN);
        fila.add(l4);
        fila.add(fechaPanel);
     
        l2.add(guardar);
        l2.add(cerar);

        ventana.add(l2, BorderLayout.SOUTH);
        ventana.add(fila, BorderLayout.CENTER);

        guardar.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {

                Prestamo prestamo = con.buscarPrestamo(txtCedula.getText());
                if (prestamo != null) {
                    boolean existe = con.registrarDevolucion(prestamo);
                    if (existe) {
                        JOptionPane.showMessageDialog(null, "Devolucion Registrada");
                    } else {
                        JOptionPane.showMessageDialog(null, "Error");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Prestamo no econtrado");
                }

            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });

        ventana.setVisible(true);
    }

}
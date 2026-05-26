
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

    TextField txtDia = new TextField(2);
    TextField txtMes = new TextField(2);
    TextField txtAño = new TextField(4);

    @Override
    public void mouseClicked(MouseEvent evento) {

        Frame ventana = new Frame("Registro de Prestamos");

        ventana.setSize(700, 500);
        ventana.setLayout(new BorderLayout());
        ventana.setBackground(Color.gray);

        Panel menu = new Panel(new GridLayout(6, 1, 5, 5));
        menu.setBackground(Color.LIGHT_GRAY);

        Button cerrar = new Button("Cerrar");
        cerrar.setBackground(Color.DARK_GRAY);

        cerrar.addMouseListener(new MouseListener() {
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
        b1.setBackground(Color.DARK_GRAY);
        menu.add(b1);
        Button b2 = new Button("Registrar Usuario");
        b2.addMouseListener(new EsquemaRatonUser(con));
        b2.setBackground(Color.DARK_GRAY);
        menu.add(b2);
        Button autor = new Button("Registrar Autor");
        autor.setBackground(Color.DARK_GRAY);
        autor.addMouseListener(new EsquemaRaton(con));
        menu.add(autor);
        Button pre = new Button("Prestamos");
        pre.setBackground(Color.DARK_GRAY);
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

        Panel fila = new Panel(new GridLayout(3, 2, 10, 10));


        Panel p1 = new Panel(new FlowLayout(FlowLayout.LEFT));
        p1.add(new Label("Ingrese la cedula"));

        txtCedula.setColumns(10);
        p1.add(txtCedula);

        Panel p2 = new Panel(new FlowLayout(FlowLayout.LEFT));
        p2.add(new Label("Ingrese ISBN"));

        txtISBN.setColumns(10);
        p2.add(txtISBN);

        Panel p3 = new Panel(new FlowLayout(FlowLayout.LEFT));
        p3.add(new Label("Fecha devolucion"));

        txtDia.setColumns(2);
        txtMes.setColumns(2);
        txtAño.setColumns(4);

        p3.add(txtDia);
        p3.add(new Label("/"));
        p3.add(txtMes);
        p3.add(new Label("/"));
        p3.add(txtAño);

        fila.add(p1);
        fila.add(p2);
        fila.add(p3);

        ventana.add(fila, BorderLayout.CENTER);
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

        ventana.add(fila, BorderLayout.CENTER);
        l2.add(guardar);
        l2.add(cerar);

        ventana.add(l2, BorderLayout.SOUTH);

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


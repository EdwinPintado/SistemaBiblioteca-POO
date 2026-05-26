
package ec.edu.ups.interfazsistemabiblioteca.clases;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;

/**
 *
 * @author kevin and edwin
 */
public class EsquemaRaton implements MouseListener {

    private Controllers con;

    public EsquemaRaton(Controllers con) {
        this.con = con;
    }

    TextField txtDia = new TextField(2);
    TextField txtMes = new TextField(2);
    TextField txtAño = new TextField(4);

    @Override
    public void mouseClicked(MouseEvent e) {

        Frame ventana
                = new Frame("Ingresar Autor");

        ventana.setSize(800, 500);
        
        ventana.setBackground(Color.blue);
        Panel panelTitulo = new Panel();
        Label titulo = new Label("REGISTRAR AUTOR", Label.CENTER);
        titulo.setFont(new Font("Arrial", Font.PLAIN, 13));

        panelTitulo.add(titulo);
        panelTitulo.setBackground(Color.gray);
        ventana.add(panelTitulo, BorderLayout.NORTH);

        Panel menu = new Panel(new GridLayout(6, 1, 5, 5));
        menu.setBackground(Color.gray);

        Button b2 = new Button("Registrar Libros");
        b2.setBackground(Color.DARK_GRAY);
        menu.add(b2);

        Button b3 = new Button("Registrar Usuario");
        b3.setBackground(Color.DARK_GRAY);
        
        menu.add(b3);
        Button b4 = new Button("Registro de Prestamo");
        b4.setBackground(Color.DARK_GRAY);
        b4.addMouseListener(new PrestamosInterfaz(con));
        menu.add(b4);

        Button b5 = new Button("Devoluciones de libros");
        b5.setBackground(Color.DARK_GRAY);
        b5.addMouseListener(new Devolucion(con));
        menu.add(b5);

        Button c3 = new Button("Cerrar");
        c3.setBackground(Color.gray);
        menu.add(c3);
        c3.addMouseListener(new MouseListener() {
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

        ventana.add(menu, BorderLayout.WEST);

        

       

        Panel formulario = new Panel(new GridLayout(9, 2, 10, 10));
        formulario.setBackground(Color.gray);

        TextField txtCedula
                = new TextField();

        TextField txtNombre
                = new TextField();

        TextField txtApe
                = new TextField();

        TextField txtTel
                = new TextField();

        TextField txtNacionalidad
                = new TextField();
        TextField txtGeneroLiterario
                = new TextField();
        TextField txtBibliografia
                = new TextField();
        Panel fechaPanel = new Panel();
        fechaPanel.add(txtDia);
        fechaPanel.add(new Label("/"));

        fechaPanel.add(txtMes);
        fechaPanel.add(new Label("/"));

        fechaPanel.add(txtAño);

        Button guardar
                = new Button("Guardar");
        Button cancelar = new Button("Cancelar");

        formulario.add(
                new Label("Cedula"));
        formulario.add(txtCedula);

        formulario.add(
                new Label("Nombre"));
        formulario.add(txtNombre);

        formulario.add(
                new Label("Apellido"));
        formulario.add(txtApe);

        formulario.add(
                new Label("Telefono"));
        formulario.add(txtTel);
        formulario.add(new Label("Fecha"));
        formulario.add(fechaPanel);

        formulario.add(
                new Label("Nacionalidad"));
        formulario.add(txtNacionalidad);

        formulario.add(new Label("Genero Literario"));
        formulario.add(txtGeneroLiterario);
        formulario.add(new Label("Bibliografia"));
        formulario.add(txtBibliografia);

        formulario.add(guardar);
        formulario.add(cancelar);
        ventana.add(formulario, BorderLayout.CENTER);
        
     
        cancelar.addMouseListener(new MouseListener() {

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

        guardar.addMouseListener(
                new MouseListener() {

            @Override
            public void mouseClicked(
                    MouseEvent e) {

                Autor autor
                        = con.crearAutor(
                                txtCedula.getText(),
                                txtNombre.getText(),
                                txtApe.getText(),
                                txtTel.getText(),
                                Integer.parseInt(txtDia.getText()), Integer.parseInt(txtMes.getText()), Integer.parseInt(txtAño.getText()),
                                txtNacionalidad.getText(),
                                txtGeneroLiterario.getText(),
                                txtBibliografia.getText()
                        );

               JOptionPane.showMessageDialog(null, "Autor registrado");

                ventana.dispose();
            }

            public void mousePressed(
                    MouseEvent e) {
            }

            public void mouseReleased(
                    MouseEvent e) {
            }

            public void mouseEntered(
                    MouseEvent e) {
            }

            public void mouseExited(
                    MouseEvent e) {
            }
        });

        ventana.setVisible(true);
    }

    public void mousePressed(
            MouseEvent e) {

    }

    public void mouseReleased(
            MouseEvent e) {
    }

    public void mouseEntered(
            MouseEvent e) {
    }

    public void mouseExited(
            MouseEvent e) {
    }
}
package ec.edu.ups.interfazsistemabiblioteca.clases;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Choice;
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
 * @author kevin and Edwin
 */
public class EsquemaRatonLibros implements MouseListener {

    private Controllers con;
    TextField txtDia = new TextField(2);
    TextField txtMes = new TextField(2);
    TextField txtAño = new TextField(4);

    public EsquemaRatonLibros(Controllers con) {
        this.con = con;
    }

    @Override
    public void mouseClicked(MouseEvent e) {

        Frame ventana
                = new Frame("Ingresar Libros");

        ventana.setSize(800, 500);
        ventana.setLayout(new BorderLayout());
        ventana.setBackground(Color.blue);
        Panel panelTitulo = new Panel();
        Label titulo = new Label("REGISTRO LIBRO", Label.CENTER);
        titulo.setFont(new Font("Arrial", Font.PLAIN, 20));

        panelTitulo.add(titulo);
        panelTitulo.setBackground(Color.gray);
        ventana.add(panelTitulo, BorderLayout.NORTH);

        Panel menu = new Panel(new GridLayout(6, 1, 5, 5));
        menu.setBackground(Color.gray);

        Button b3 = new Button("Registrar Autor");
        b3.setBackground(Color.DARK_GRAY);
        b3.addMouseListener(new EsquemaRaton(con));
        menu.add(b3);

        Button b4 = new Button("Registrar Libros");
        b4.setBackground(Color.DARK_GRAY);
        b4.addMouseListener(new EsquemaRatonLibros(con));
        menu.add(b4);
        Button b5 = new Button("Registro de Prestamo");
        b5.setBackground(Color.DARK_GRAY);
        b5.addMouseListener(new PrestamosInterfaz(con));
        menu.add(b5);

        Button b6 = new Button("Devoluciones de libros");
        b6.setBackground(Color.DARK_GRAY);
        b6.addMouseListener(new Devolucion(con));
        menu.add(b6);

        Button c4 = new Button("Cerrar");
        c4.setBackground(Color.gray);
        menu.add(c4);
        c4.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                ventana.dispose();
            }

            @Override
            public void mousePressed(MouseEvent e) {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                throw new UnsupportedOperationException("Not supported yet.");
            }
        });

        ventana.add(menu, BorderLayout.WEST);

        Panel formulario = new Panel(new GridLayout(9, 2, 10, 10));
        formulario.setBackground(Color.gray);

        TextField txtISBN
                = new TextField();

        TextField txtTitulo
                = new TextField();

        TextField txtEditorial
                = new TextField();

        TextField txtDisponible
                = new TextField();

        TextField txtAutor
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
                new Label("ISBN"));
        formulario.add(txtISBN);

        formulario.add(
                new Label("Titulo"));
        formulario.add(txtTitulo);

        formulario.add(
                new Label("Editorial"));
        formulario.add(txtEditorial);

        formulario.add(new Label("Fecha"));
        formulario.add(fechaPanel);

        formulario.add(new Label("Autor"));
        formulario.add(txtAutor);
        Panel mi = new Panel(new GridLayout(1, 2, 10, 10));
        mi.add(guardar);
 
       mi.add(cancelar);
        
       ventana.add(mi,BorderLayout.SOUTH);
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
                throw new UnsupportedOperationException("Not supported yet.");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                throw new UnsupportedOperationException("Not supported yet.");
            }

        });

        guardar.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {

                String nombreAutor = txtAutor.getText();

                Autor autor = new Autor();
                autor.setNombre(nombreAutor);

                Libro libro
                        = con.crearLibro(
                                txtISBN.getText(),
                                txtTitulo.getText(),
                                txtEditorial.getText(),
                                Integer.parseInt(txtDia.getText()), Integer.parseInt(txtMes.getText()), Integer.parseInt(txtAño.getText()),
                                autor
                        );

                JOptionPane.showMessageDialog(null, "Libro Guardado");

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

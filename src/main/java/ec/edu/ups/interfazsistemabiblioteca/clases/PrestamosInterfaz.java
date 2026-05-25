
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
import java.util.List;

/**
 *
 * @author kevin and Edwin
 */

public class PrestamosInterfaz extends MouseAdapter {

    private Controllers con = new Controllers();
   
    TextField txtDia = new TextField(5);
    TextField txtMes = new TextField(5);
    TextField txtAño = new TextField(8);
    TextField txtDia1 = new TextField(5);
    TextField txtMes2 = new TextField(5);
    TextField txtAño2 = new TextField(8);

    @Override
    public void mouseClicked(MouseEvent evento) {

        Frame ventana = new Frame("Registro de Prestamos");

        ventana.setSize(700,500);
        ventana.setLayout(new BorderLayout());
        ventana.setBackground(Color.WHITE);

        Panel menu = new Panel(new GridLayout(6, 1, 5, 5));
        menu.setBackground(Color.LIGHT_GRAY);

        Button cerrar = new Button("Cerrar");

        menu.add(new Button("Registrar Libros"));
        menu.add(new Button("Registrar Usuario"));
        menu.add(new Button("Prestamos"));
        menu.add(new Button("Devoluciones"));
        menu.add(cerrar);

        ventana.add(menu, BorderLayout.WEST);
        


        Panel panelTitulo = new Panel();

        Label titulo = new Label("REGISTRO DE PRESTAMOS");
        titulo.setFont(new Font("Arial", Font.BOLD, 20));

        panelTitulo.add(titulo);

        ventana.add(panelTitulo, BorderLayout.NORTH);

        Panel panelForm = new Panel();
        panelForm.setLayout(new GridLayout(6, 1, 10, 10));

       
        Panel filaFecha = new Panel(new FlowLayout(FlowLayout.LEFT));

        filaFecha.add(new Label("Fecha salida:"));
        filaFecha.add(txtDia);
        filaFecha.add(new Label("/"));
        filaFecha.add(txtMes);
        filaFecha.add(new Label("/"));
        filaFecha.add(txtAño);

        
        Panel filaAutor = new Panel(new FlowLayout(FlowLayout.LEFT));

        filaAutor.add(new Label("Nombre Autor:"));
        TextField txtAutor = new TextField(30);
        txtAutor.setPreferredSize(new Dimension(250,30));
        filaAutor.add(txtAutor);

       
        Panel filaLibro = new Panel(new FlowLayout(FlowLayout.LEFT));

        filaLibro.add(new Label("Titulo Libro:"));
        TextField txtLibro = new TextField(30);
        txtLibro.setPreferredSize(new Dimension(250,30));
        filaLibro.add(txtLibro);

        
        Panel filaIsbn = new Panel(new FlowLayout(FlowLayout.LEFT));

        filaIsbn.add(new Label("ISBN:"));
        
        TextField txtIsbn = new TextField(30);
        txtIsbn.setPreferredSize(new Dimension(250,30));
        filaIsbn.add(txtIsbn);
        

        
        Panel filaBibliotecario = new Panel(new FlowLayout(FlowLayout.LEFT));

        filaBibliotecario.add(new Label("Bibliotecario:"));
        TextField txtBibliotecario = new TextField(30);
        filaBibliotecario.add(txtBibliotecario);

        
        Panel filaFechaLimite = new Panel(new FlowLayout(FlowLayout.LEFT));

        filaFechaLimite.add(new Label("Fecha limite:"));
        filaFechaLimite.add(txtDia1);
        filaFechaLimite.add(new Label("/"));
        filaFechaLimite.add(txtMes2);
        filaFechaLimite.add(new Label("/"));
        filaFechaLimite.add(txtAño2);

       
        Button guardar = new Button("Guardar Prestamo");

        Panel filaBoton = new Panel();
        filaBoton.add(guardar);

        
        panelForm.add(filaFecha);
        panelForm.add(filaAutor);
        panelForm.add(filaLibro);
        panelForm.add(filaIsbn);
        panelForm.add(filaBibliotecario);
        panelForm.add(filaFechaLimite);
        
        ventana.add(panelForm, BorderLayout.CENTER);
        ventana.add(filaBoton, BorderLayout.SOUTH);
        
        cerrar.addMouseListener(new MouseListener() {

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

        guardar.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {

                String nombreAutor = txtAutor.getText();
                String tituloLibro = txtLibro.getText();
                String isbn = txtIsbn.getText();
                String nombreBibliotecario = txtBibliotecario.getText();

                Autor autor = new Autor();
                autor.setNombre(nombreAutor);

                Libro libro = new Libro();
                libro.setTitulo(tituloLibro);
                libro.setIsbn(isbn);
                libro.setAutor(autor);

                List<Libro> libros = new ArrayList<>();
                libros.add(libro);

                Bibliotecario bibliotecario = new Bibliotecario();
                bibliotecario.setNombre(nombreBibliotecario);

                Prestamo prestamo = con.crearPrestamo(
                        Integer.parseInt(txtDia.getText()), Integer.parseInt(txtMes.getText()), Integer.parseInt(txtAño.getText()),
                        Integer.parseInt(txtDia1.getText()), Integer.parseInt(txtMes2.getText()), Integer.parseInt(txtAño2.getText()),
                        bibliotecario,
                        libros
                );
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
        

        ventana.setVisible(true);
    }

}


package ec.edu.ups.interfazsistemabiblioteca.clases;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author kevin and Edwin
 */

public class Informacion extends MouseAdapter {

    private Controllers con;
    private TextArea txtArea;

    public Informacion(Controllers con) {
        this.con = con;
    }

    @Override
    public void mouseClicked(MouseEvent evento) {
        Button b1 = (Button)evento.getSource();
        String opc = b1.getLabel();

        Frame ventana = new Frame(opc);

        ventana.setSize(800, 500);
        ventana.setLayout(new BorderLayout());
        ventana.setBackground(Color.blue);
        Panel panelTitulo = new Panel();
        
        Label t = new Label(opc, Label.CENTER);
        t.setFont(new Font("Arial", Font.BOLD, 18));
        panelTitulo.add(t);
        ventana.add(panelTitulo, BorderLayout.NORTH);

        Panel menu = new Panel();
        menu.setLayout(new GridLayout(6, 1, 5, 5));
        
        Button registrarAutor = new Button("Registrar Autor");
        Button registrarLibro = new Button("Registrar Libros");
        Button registrarUsuario = new Button("Registrar Usuario");
        Button registrarPrestamo = new Button("Registrar Prestamo");
        Button registrarDevolucion = new Button("Registrar Devoluciones");
        Button cerrar = new Button("Cerrar");
        
        menu.add(registrarAutor);
        menu.add(registrarLibro);
        menu.add(registrarUsuario);
        menu.add(registrarPrestamo);
        menu.add(registrarDevolucion);
        menu.add(cerrar);

        ventana.add(menu, BorderLayout.WEST);
        
        ventana.add(txtArea,BorderLayout.CENTER );
       
        Panel panel1 = new Panel();

        Button b = new Button("Mostrar");
        panel1.add(b);
        ventana.add(panel1, BorderLayout.SOUTH);
        
        ventana.setVisible(true);

        b1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                txtArea.setText("");
                if(opc.equals("Informacion Autor")){
                    if (!con.mostrarAutor().isEmpty()) {
                    txtArea.append("TUS AUTORES REGISTRADOS\n\n");
                        for (Autor autor : con.mostrarAutor()) {
                        txtArea.append(autor.toString() + "\n");
                        }

                    } else {
                    txtArea.append("No existen autores registrados.");
                    }
                }else if(opc.equals("Informacion Libros")){
                    if (!con.mostrarLibro().isEmpty()) {
                    txtArea.append("TUS LIBROS REGISTRADOS\n\n");
                        for (Libro libro : con.mostrarLibro()) {
                        txtArea.append(libro.toString() + "\n");
                        }

                    } else {
                    txtArea.append("No existen libros registrados.");
                    }
                }else if(opc.equals("Informacion Usuario")){
                    if (!con.mostrarUsuario().isEmpty()) {
                    txtArea.append("TUS LIBROS REGISTRADOS\n\n");
                        for (Usuario usuario : con.mostrarUsuario()) {
                        txtArea.append(usuario.toString() + "\n");
                        }

                    } else {
                    txtArea.append("No existen usuarios registrados.");
                    }
                }
            }
        });
        
        cerrar.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                ventana.dispose();
            }
        });
    }

}

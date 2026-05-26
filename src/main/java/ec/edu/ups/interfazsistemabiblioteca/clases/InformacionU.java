
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
import java.awt.event.MouseListener;

/**
 *
 * @author kevin and Edwin
 */
public class InformacionU extends MouseAdapter {

    private Controllers con;
    private TextArea txtArea;

    public InformacionU(Controllers con) {
        this.con = con;
    }

    @Override
    public void mouseClicked(MouseEvent evento) {
        Frame ventana
                = new Frame("Informacion Usuario");

        ventana.setSize(800, 500);
        ventana.setLayout(new BorderLayout());
        ventana.setBackground(Color.gray);
        Panel panelTitulo = new Panel();

        Panel menu = new Panel(new GridLayout(6, 1, 5, 5));
        menu.setBackground(Color.LIGHT_GRAY);
        Button b2 = new Button("Registrar Libros");
        b2.setBackground(Color.LIGHT_GRAY);
        b2.addMouseListener(new InformacionL(con));
        menu.add(b2);

        Button b3 = new Button("Registrar Usuario");
        b3.setBackground(Color.LIGHT_GRAY);
        b3.addMouseListener(new EsquemaRatonUser(con));
        menu.add(b3);
        Button b4 = new Button("Registro de Prestamo");
        b4.setBackground(Color.LIGHT_GRAY);
        b4.addMouseListener(new PrestamosInterfaz(con));
        menu.add(b4);

        Button b5 = new Button("Devoluciones de libros");
        b5.setBackground(Color.LIGHT_GRAY);
        b5.addMouseListener(new Devolucion(con));
        menu.add(b5);

        Button c3 = new Button("Cerrar");
        c3.setBackground(Color.LIGHT_GRAY);
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
        Label titulo = new Label("Informacion del Usuario", Label.CENTER);
        titulo.setFont(new Font("Arrial", Font.PLAIN, 13));
        titulo.setBackground(Color.gray);
        panelTitulo.add(titulo);

        ventana.add(panelTitulo, BorderLayout.NORTH);
        txtArea = new TextArea();
        ventana.add(txtArea, BorderLayout.CENTER);
        Panel panel1 = new Panel();

        Button b1 = new Button("Mostrar");
        panel1.add(b1);
        ventana.add(panel1, BorderLayout.SOUTH);

        ventana.setVisible(true);

        b1.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                txtArea.setText("");
                if (!con.mostrarUsuario().isEmpty()) {

                    txtArea.append("TUS AUTORES REGISTRADOS\n\n");

                    for (Usuario usuarios : con.mostrarUsuario()) {
                        txtArea.append(usuarios.toString() + "\n");
                    }

                } else {
                    txtArea.append("No existen autores registrados.");
                }

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

    }

}

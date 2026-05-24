/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.interfazsistemabiblioteca.clases;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author kevin and edwin
 */
public class EsquemaRaton implements MouseListener {

    Controllers c = new Controllers();

    @Override
    public void mouseClicked(MouseEvent e) {

        Frame ventana =
                new Frame("Ingresar Autor");

        ventana.setSize(300,400);
        ventana.setLayout(
                new GridLayout(8,2));

        TextField txtCedula =
                new TextField();

        TextField txtNombre =
                new TextField();

        TextField txtApe =
                new TextField();

        TextField txtTel =
                new TextField();

        TextField txtNacionalidad =
                new TextField();

        Button guardar =
                new Button("Guardar");

        ventana.add(
                new Label("Cedula"));
        ventana.add(txtCedula);

        ventana.add(
                new Label("Nombre"));
        ventana.add(txtNombre);

        ventana.add(
                new Label("Apellido"));
        ventana.add(txtApe);

        ventana.add(
                new Label("Telefono"));
        ventana.add(txtTel);

        ventana.add(
                new Label("Nacionalidad"));
        ventana.add(txtNacionalidad);

        ventana.add(guardar);


        guardar.addMouseListener(
            new MouseListener() {

            @Override
            public void mouseClicked(
                    MouseEvent e) {

                Autor autor =
                        c.crearAutor(
                            txtCedula.getText(),
                            txtNombre.getText(),
                            txtApe.getText(),
                            txtTel.getText(),
                            1,1,2000,
                            txtNacionalidad.getText(),
                            "Novela",
                            "Bio"
                        );

                System.out.println(
                    "Guardado: "
                    + autor.getNombre());

                ventana.dispose();
            }

            public void mousePressed(
                    MouseEvent e){}

            public void mouseReleased(
                    MouseEvent e){}

            public void mouseEntered(
                    MouseEvent e){}

            public void mouseExited(
                    MouseEvent e){}
        });

        ventana.setVisible(true);
    }


    public void mousePressed(
            MouseEvent e){}

    public void mouseReleased(
            MouseEvent e){}

    public void mouseEntered(
            MouseEvent e){}

    public void mouseExited(
            MouseEvent e){}
}
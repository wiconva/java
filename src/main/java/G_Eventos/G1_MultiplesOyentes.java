package G_Eventos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class G1_MultiplesOyentes {
    /*Se programan multiples oyentes, cada clase ventana nueva tiene un oyente que esta a la escucha de
     un evento en el botón cerrar que cierra la propia ventan, con un evento se tienen mucho oeyente
     que realizan una acción.
     */
    public static void main(String[] args) {
        JFrame ventanPrincipal = new JFrame("Ventana Principal");
        ventanPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventanPrincipal.setVisible(true);
        ventanPrincipal.setBounds(500,300,300,200);
        JButton botonAgregar ;
        JButton ocultarVentanas;
        JButton mostrarVentanas;

        botonAgregar = new JButton("Agregar");
        ocultarVentanas = new JButton("Cerrar");
        mostrarVentanas = new JButton("Mostar");

        //Crea ventanas nuevas cuando se desencadenan eventos.
        class VentanaNueva extends JFrame {
            private static int contador;
            private final int numVentana;
            private final JFrame v = this;
            VentanaNueva (JButton cerrar, JButton mostar){
                contador++;
                numVentana = contador;
                setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                setVisible(true);
                setBounds(20*contador,20*contador,400,70);
                setTitle("Ventana "+contador);
                cerrar.addMouseListener (new OyenteOcultar());
                mostar.addMouseListener(new OyenteMostrar());

            }
            //Clase interna que esta a la escucha de eventos del tipo Mouse Adapter.
            class OyenteOcultar extends MouseAdapter{
                @Override
                public void mouseClicked(MouseEvent e) {
                    super.mouseClicked(e);
                    System.out.println("Ocultando Ventana "+ numVentana);
                    v.setVisible(false);
                }
            }
            //Clase interna que esta a la escucha de eventos del tipo Mouse Adapter.
            class OyenteMostrar extends MouseAdapter{
                @Override
                public void mouseClicked(MouseEvent e) {
                    super.mouseClicked(e);
                    System.out.println("Mostrando Ventana "+ numVentana);
                    v.setVisible(true);
                }
            }
        }
        class OyenteCrear extends MouseAdapter {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                new VentanaNueva(ocultarVentanas, mostrarVentanas);
            }
        }
        class Lamina extends JPanel {
            Lamina() {
                add(botonAgregar);
                add(ocultarVentanas);
                add(mostrarVentanas);
                botonAgregar.addMouseListener(new OyenteCrear());
            }
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

            }
        }

        Lamina lamina = new Lamina();
        ventanPrincipal.add(lamina);
        lamina.repaint();
    }
}

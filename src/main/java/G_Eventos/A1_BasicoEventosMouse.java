package G_Eventos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class A1_BasicoEventosMouse {

    public static void main(String[] args) {
        /*Evento: Desencadenante de una acción: Hacer click con el mouse, orpimmir una tecla, minimizar la ventana...
          Que desencadena la acción, Evento : Hacer click. Action Event o Windows Event pertenecen a ObjectEvent.
          Quien desencadena la acción: Objeto sobre el que sucede el evento: Botón. addActionListener(Listener)
          Quien recibe el Evento: está a la escucho y ejecuta acciones depués del evento. implementar ActionPerformed y
          método ActionPerformed(Evento).
         */
        Marco5 marco  = new Marco5();
    }
}

class Marco5 extends JFrame {

    Marco5 (){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setSize(400,400);
        Lamina lamina = new Lamina();
        add(lamina);
    }

    //Clase interna que agrega la lámina y los botones.
    class Lamina extends JPanel {
        private JButton botonAzul;
        Lamina (){
            //Creación de los ojetos de tipo botón.
            botonAzul = new JButton();
            botonAzul.setText("Azul");
            JButton botonVerde = new JButton();
            botonVerde.setText("Verde");
            JButton botonRojo = new JButton();
            botonRojo.setText("Rojo");

            /*Instancia de la clase color de fondo que implementa la interfaz ActionListener y esta a la escucha de
              eventos*/
            ColorFondo colorVerde = new ColorFondo(Color.green);
            ColorFondo colorAzul = new ColorFondo(Color.blue);
            ColorFondo colorRojo = new ColorFondo(Color.red);

            //Agrega los botones a la lámina.
            add(botonAzul);
            add(botonVerde);
            add(botonRojo);

            /*Los botones pueden generar los eventos y envían los objetos que esta a la escucha de esos eventos para realizar
            las acciones*/
            botonAzul.addActionListener(colorAzul);
            botonVerde.addActionListener(colorVerde);
            botonRojo.addActionListener(colorRojo);

        }

        /*Clase interna que se encuentra a la escucha de eventos y se encarga de ejecutar las acciones programadas
          cuando estos ocurren.Eventos del mouse.
         */
        private class ColorFondo implements ActionListener {
            private Color colorFondo;

            ColorFondo(Color c){
                this.colorFondo = c;
            }
            /*Método de la interface ActionListener que se ejecuta cuando se genera el evento en el origen, y se encarga
            de cambiar el fondo de la lámina. */
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(e.getSource());
                System.out.println(botonAzul);
                setBackground(colorFondo);
            }
        }
    }

}

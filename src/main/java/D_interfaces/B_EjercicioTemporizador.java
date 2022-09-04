package D_interfaces;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class B_EjercicioTemporizador {
    public static void main(String[] args) {
        /*Este ejemplo implementa la interface ActionListenes que se encarga de escuchar todos lo eventos que se generan
          en Java, junto con la clase Timer que requiere un elemento de este tipo para ejecutar una la función Action Prefomred
          cada cierto tiempo en [ms].
         */
        ActionListener evento = new Oyente(); //Escucha los eventos.
        Timer tempo = new Timer(2000,evento); //Ejecuta los eventos escuchados.
        tempo.start(); //Inicia el temporizador.
        JOptionPane.showMessageDialog(null,"Desea terminar?");
        System.exit(0); //Salida del aplicación.

    }
}

class Oyente implements ActionListener { //Objeto que implementa la interface y esta obligado a sobre-escribir su método.

    @Override
    public void actionPerformed(ActionEvent e) { //Metodo que se ejecuta.
        System.out.println("Soy un temporizador de 2 segundos...");
        Toolkit.getDefaultToolkit().beep();
    }
}

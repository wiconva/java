package H_layouts;

import javax.swing.*;
import java.awt.*;

public class D1_GridLayout {
    /*Ordena los objetos dentro de un contenedor con una grilla, en el constructor se especifica el tamaño
       la grilla*/
    public static void main(String[] args) {
        JFrame marco = new JFrame();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);

        int tamanoGrilla =10;


        marco.setLayout(new BorderLayout());

        JPanel lamina = new JPanel ();
        lamina.setLayout(new GridLayout(tamanoGrilla,tamanoGrilla,5,5));//Instancia del objeto con el tamaño de la grilla y la separación.

        for (int i =1 ; i <= Math.pow(tamanoGrilla,2); i++){
            lamina.add(new JButton(Integer.toString(i)));
        }
        marco.add(lamina,BorderLayout.CENTER);
        marco.pack();// Hace que el contenedor se adapte al contenido.
    }
}

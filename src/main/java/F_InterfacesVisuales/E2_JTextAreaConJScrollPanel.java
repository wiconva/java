package F_InterfacesVisuales;

import javax.swing.*;
import java.awt.*;

public class E2_JTextAreaConJScrollPanel {
    public static void main(String[] args) {
        /* Para evitar que el texto siga creciendo en filas y columnas se utiliza la clase JScrollPane que
           agrega una barra de escroll cuando los elementos se salen del area original del contenedor.
         */
        JFrame marco = new JFrame();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco. setSize(400,400);
        marco.setLayout(new FlowLayout());

        JTextArea areaTexto = new JTextArea(8,20);
        areaTexto.setLineWrap(true); //Ajusta si tiene salto de línea en el area de texto cuando alcanza la posición máxima.
        areaTexto.setText("1\n2\n3\n4\n5\n6\n7\n8\n9");


        JScrollPane panel = new JScrollPane(areaTexto);// El constructo recibe el area de texto.

        marco.add(panel);
        marco.setVisible(true);
    }
}

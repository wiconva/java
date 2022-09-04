package F_InterfacesVisuales;

import javax.swing.*;

public class E1_JTextArea {
    public static void main(String[] args) {
        JFrame marco = new JFrame();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setSize(400,400);
        /*Por defecto el area de texto no posee restricciones en el número de líneas ni de columnas
            despues de salir del area ella sigue creciendo.
         */
        JPanel lamina = new JPanel();
        JTextArea areaEscritura = new JTextArea(5,20);

        lamina.add(areaEscritura);
        marco.add(lamina);
        marco.setVisible(true);
    }
}

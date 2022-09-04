package F_InterfacesVisuales;

import javax.swing.*;
import java.awt.*;

public class K2_MenuEmergente {
    public static void main(String[] args) {
        JFrame marco = new JFrame();
        marco.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        marco.setSize(400,300);

        JPanel lamina = new JPanel();
        JTextArea area = new JTextArea(8,20);

        //Creación de Menús es igual que para los menús de baarra de menú.
        JPopupMenu menuEmergente = new JPopupMenu("Emergente"); //Menú emergente cuando se da click derecho.
        JMenu menu1 = new JMenu("Menú 1");
        JMenu menu2 = new JMenu("Menú 2");
        JMenuItem opcion1 = new JMenuItem("Opcion 1");

        menu1.add(opcion1);
        menuEmergente.add(menu1);
        menuEmergente.add(menu2);

        area.setComponentPopupMenu(menuEmergente);// Se ajusta sobre que objeto genera el evento.

        lamina.add(area, BorderLayout.SOUTH);
        marco.add(lamina);
        marco.setVisible(true);
    }
}

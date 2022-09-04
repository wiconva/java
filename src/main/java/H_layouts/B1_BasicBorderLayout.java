package H_layouts;

import javax.swing.*;
import java.awt.*;

public class B1_BasicBorderLayout {

    public static void main(String[] args) {

        /*Crea disposiciones para los componentes alojados en el panel, por defecto se ajusta a center,
         la separición es de 5 unidades.
         */
        class Lamina extends JPanel {
            Lamina (BorderLayout f){
                setLayout(f);
                add(new JButton("Norte"),BorderLayout.NORTH);
                add(new JButton("ESte"),BorderLayout.EAST);
                add(new JButton("Oeste"),BorderLayout.WEST);
                add(new JButton("Sur"),BorderLayout.SOUTH);
                add(new JButton("Centro"),BorderLayout.CENTER);
            }
        }

        JFrame marco = new JFrame("Flow  Border Layout");
        JFrame marco2 = new JFrame("Con espacio");
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
        marco.setBounds(20,20,400,400);

        marco2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco2.setVisible(true);
        marco2.setBounds(500,20,400,400);

        //Objet que crea la disposición.
        BorderLayout layout = new BorderLayout(); //Sin separación entre componenetes.
        BorderLayout layoutEspacio = new BorderLayout(10,10);//Con espacio separación x,y
        Lamina lamina1 = new Lamina(layout);
        Lamina lamina2 = new Lamina(layoutEspacio);
        marco.add(lamina1);
        marco2.add(lamina2);

    }
}

package H_layouts;

import javax.swing.*;
import java.awt.*;

public class A1_BasicFlowLayout {
    public static void main(String[] args) {

        /*Crea disposiciones para los componentes alojados en el panel, por defecto se ajusta a center,
         la separición es de 5 unidades.
         */

        class Lamina extends JPanel{
            Lamina (FlowLayout f){
                setLayout(f);
                add(new JButton("Boton 1"));
                add(new JButton("Boton 2"));
                add(new JButton("Boton 3"));
            }

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
            }
        }
        JFrame marco = new JFrame("Flow  center Layout");
        JFrame marco2 = new JFrame("Flow  Left Layout");
        JFrame marco3 = new JFrame("Flow right Layout");

        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
        marco.setBounds(20,20,400,400);

        marco2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco2.setVisible(true);
        marco2.setBounds(500,20,400,400);

        marco3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco3.setVisible(true);
        marco3.setBounds(940,20,400,400);

        //Objet que crea la disposición.
        FlowLayout disposicionCentrada = new FlowLayout(FlowLayout.CENTER);
        FlowLayout disposicionIzquierda = new FlowLayout(FlowLayout.LEFT);
        FlowLayout disposicionDerecha = new FlowLayout(FlowLayout.RIGHT);

        Lamina lamina1 = new Lamina(disposicionCentrada);
        Lamina lamina2 = new Lamina(disposicionIzquierda);
        Lamina lamina3 = new Lamina(disposicionDerecha);

        marco.add(lamina1);
        marco2.add(lamina2);
        marco3.add(lamina3);

    }
}

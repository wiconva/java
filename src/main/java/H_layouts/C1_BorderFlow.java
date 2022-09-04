package H_layouts;

import javax.swing.*;
import java.awt.*;

public class C1_BorderFlow {
    /*Ajusta una disposición mixta entre BorderLayout y FlowLayout para dos laminas con diferente
    disposición interna.*/
    public static void main(String[] args) {
        //Clase local con configuración  FlowLayout.
        class LaminaFlow extends JPanel{
            LaminaFlow (){
                setLayout(new FlowLayout());
                add(new JButton("Boton 1"));
                add(new JButton("Boton 2"));
            }
        }
        //Clase local con configuración Border Layout sin espaciado entre elementos.
        class   LaminaBorder extends JPanel{
            LaminaBorder(){
                setLayout(new BorderLayout());
                add(new JButton("Boton 3"),BorderLayout.WEST);
                add(new JButton("Boton 4"), BorderLayout.NORTH);
            }
        }

        JFrame marco = new JFrame("Mixto Layout");
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
        marco.setSize(400,400);

        LaminaFlow laminaFlow = new LaminaFlow();
        LaminaBorder laminaBorder = new LaminaBorder();

        marco.setLayout(new BorderLayout());
        marco.add(laminaFlow,BorderLayout.NORTH);
        marco.add(laminaBorder, BorderLayout.SOUTH);

    }
}

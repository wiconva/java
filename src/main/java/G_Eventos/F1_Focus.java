package G_Eventos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class F1_Focus {
    public static void main(String[] args) {

        JFrame marco = new JFrame();
        JTextField entrada1 = new JTextField("Input 1");
        JTextField entrada2 = new JTextField("Input 2");
        entrada1.setBounds(10,10,100,20);
        entrada2.setBounds(10,40,100,20);


        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
        marco.setSize(400,400);

        marco.setLayout(null);
        marco.add(entrada1);
        marco.add(entrada2);

        class Oyente implements FocusListener{

            @Override
            public void focusGained(FocusEvent e) {
                if(e.getSource() == entrada1) {
                    System.out.println("soy campo 1");
                }else {
                    System.out.println("soy el campo 2");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {

            }
        }
        entrada1.addFocusListener(new Oyente());
        entrada2.addFocusListener(new Oyente());
    }
}

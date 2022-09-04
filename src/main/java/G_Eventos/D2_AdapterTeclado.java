package G_Eventos;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class D2_AdapterTeclado {

    public static void main(String[] args) {
        JFrame marco = new JFrame();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
        marco.setSize(400,400);
        /* La interface KeyListener también tiene una clase adaptadora para no tener que sobreescribir todos
          sus métodos*/
        class Oyente extends KeyAdapter{ //Clase local dentro del método.
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                System.out.println(e.getSource());
                System.out.println(e.getKeyChar());
                System.out.println(e.getKeyCode());
                if (e.getKeyChar() =='w') System.out.println("la mejor letra");
            }
        }

        marco.addKeyListener(new Oyente());
    }
}


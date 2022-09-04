package G_Eventos;

import javax.swing.*;
import java.awt.event.InputEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class E2_AdpaterMouseEvent {
    public static void main(String[] args) {
        JFrame marco = new JFrame();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
        marco.setSize(400,400);

        class Oyente extends MouseAdapter{
            @Override
            public void mouseClicked(MouseEvent e) {
                final int IZQUIERDO = 1;
                super.mouseClicked(e);
                System.out.println(e.getButton());
                if(e.getButton() == IZQUIERDO)System.out.println("Haz presionado Izquierdo... en "+e.getX()+" , "+e.getY());

            }
        }
        marco.addMouseListener(new Oyente());
    }
}

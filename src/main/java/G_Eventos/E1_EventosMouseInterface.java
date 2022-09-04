package G_Eventos;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class E1_EventosMouseInterface {

    public static void main(String[] args) {
        JFrame marco = new JFrame();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
        marco.setSize(400,400);
        /*También cuenta con la clase adaptadora para no tener que implementar todos los métodos de
          la interface MouseListener.
         */
        class Oyente implements MouseListener{

            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Raton clickeado...");
            }

            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println("Ratón presionado...");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                System.out.println("Se solto ratón");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                System.out.println("Entered");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                System.out.println("Saliendo...");
            }
        }
        marco.addMouseListener(new Oyente());
    }
}

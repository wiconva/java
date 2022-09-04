package E_ClasesInternas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class D_ClasesAnonimas {
    public static void main(String[] args) {
        JFrame marco = new JFrame();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setSize(400,400);

        JPanel lamina = new JPanel();
        JButton rojo = new JButton("Rojo");
        JButton verde = new JButton("Verde");

        /*Clase anónima que se instancia pero no se crea como clase, se pueden sobreescribir sus métodos,
          puede ayudar a minimizar código pero es menos legible y entendible.
         */
        rojo.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                lamina.setBackground(Color.red);
            }
        });

        verde.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                lamina.setBackground(Color.GREEN);
            }
        });

        lamina.add(rojo);
        lamina.add(verde);
        marco.add(lamina);
        marco.setVisible(true);
    }
}

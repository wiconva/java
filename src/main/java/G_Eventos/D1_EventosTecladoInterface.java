package G_Eventos;

import javax.sound.midi.Soundbank;
import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.SQLOutput;

public class D1_EventosTecladoInterface {
    public static void main(String[] args) {
        JFrame marco = new JFrame();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
        marco.setSize(400,400);
        marco.addKeyListener(new Oyente());
    }
}
class Oyente implements KeyListener{

    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println("Se ha presionado y soltado \"Type\" una tecla !!");
    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("Se ha presionado una tecla !!!");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("Se ha soltado la tecla presionada!!");
    }
}

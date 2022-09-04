package G_Eventos;

import javax.swing.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class B1_BasicoEventosVentana {
    /*Para trabajar con los eventos que generan las ventanas se implementa la interface windowslistener
     la cual obliga a sobreescribir sus método, luego se coloca un objeto a la escucha de esos eventos que
     reaccionara con una acción cuando estos sean generados.
     */

    public static void main(String[] args) {
        Marco6 marco = new Marco6();
        marco.addWindowListener(marco);

    }
}
class Marco6 extends JFrame implements WindowListener {

    Marco6 (){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setSize(400,300);
    }


    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("Ventana Abierta !!!");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("Cerrando la ventana!!!");
    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("Ventana cerrada !!!");
    }

    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("Ventana minimizada !!!");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println("Ventana maximizada");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("Ventana con el foco !!!");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println("Ventana sin el foco !!!");
    }
}

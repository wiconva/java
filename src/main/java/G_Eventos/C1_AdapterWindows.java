package G_Eventos;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.rmi.MarshalException;

public class C1_AdapterWindows {
    /*Para no tener que sobreescribir todos los métodos de la interaces, java provee clases adaptadoreas que
    los implementan y al heredarlas solo se utilizan los que se necesiten.
     */
    public static void main(String[] args) {
        Marco7 marco = new Marco7();
    }
}

class Marco7 extends JFrame {
    Marco7 (){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setSize(400,400);


        class Oyente extends WindowAdapter {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.out.println("Cerrando la ventana !!");
            }
        }
        addWindowListener(new Oyente());
    }
}


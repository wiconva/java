package E_ClasesInternas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class B_InternasLocales {
    public static void main(String[] args) {
        /* Con la clase interna local se simplifica más el código, se aplica cuando solo se utiliza una vez la clase
           interna*/
       Temporizador2 tempo = new Temporizador2();
       tempo.comenzar(2000);
       JOptionPane.showMessageDialog(null,"Desear terminar?");
       System.exit(0);


    }
}

class Temporizador2 {


    //Método que contiene la clase interna.
    public void comenzar (int t){

            /* Debe ir al inicio del métodoClase interna Local encapsulada dentro de un método, No es visible desde
               clases externas ni desde la clase padre solo através de la invocación dle método, se utiliza cuando
               la clase interna se usa solo una vez.
               puede acceder directamente a los atributos y métodos de la clase padre. No puede llevar ningún tipo de
               clasusula de encapsulamiento: private, public...*/
        class Oyente implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date hora = new Date();
                System.out.println("Temporizando cada: " + t/1000 +" [s] "+" Hora : "+hora);
            }
        }

        // La instancia del objeto solo se puede utilizar despues de la declaración de la clase.
        ActionListener oyente = new Oyente();
        Timer temporizer = new Timer(t,oyente);
        temporizer.start();
    }
}
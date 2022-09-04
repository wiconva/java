package E_ClasesInternas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.Timer;

public class A_ClaseInterna {
    public static void main(String[] args) {
        Temporizador t = new Temporizador(2000, true);
        t.comenzar();
        JOptionPane.showMessageDialog(null, "Desea terminar?");
        System.exit(0);

    }
}

class Temporizador {
    private int t;
    private boolean conSonido;

    public Temporizador (int t, boolean conSonido){
        this.t = t;
        this.conSonido = conSonido;
    }
     public void comenzar (){
         ActionListener oyente = new Oyente();
         Timer temporizer = new Timer(t,oyente);
         temporizer.start();
     }

     /*Clase interna encapsulada, que implementa la interface para escuchar eventos. No es visible desde clases externas,
       puede acceder directamente a los atributos y métodos de la clase padre.*/
     private class Oyente implements ActionListener {
         @Override
         public void actionPerformed(ActionEvent e) {
             Date hora = new Date();
             System.out.println("Temporizando cada: " + t/1000 +" [s] "+" Hora : "+hora);
             if (conSonido) {Toolkit.getDefaultToolkit().beep();}

         }
     }


}

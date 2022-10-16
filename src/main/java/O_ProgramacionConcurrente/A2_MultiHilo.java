package O_ProgramacionConcurrente;

import javax.print.event.PrintJobAttributeListener;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class A2_MultiHilo {
    public static void main(String[] args) {
        /*Para crear un Hilo es necesario implementar la interface Runnable que tiene un método Run que es lo que se
          ejecuta cuando se llama el método start de la clase Thread, que es su constructor recibe un objeto que  haya
          implementado la interface Runnable.
         */
        JFrame marco = new JFrame("Multi Hilo");
        JPanel lamina = new JPanel(new FlowLayout());
        JButton boton = new JButton("Añadir");

        marco.setSize(400,400);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setLayout(new BorderLayout());
        marco.add(boton,BorderLayout.SOUTH);

        // Se agraga el oyente al boton.
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Cuando se pulsa se crea un Hilo y se pasa un objeto que implementa Runnable.
                Thread Hilo = new Thread(new Contar(marco,lamina));
                Hilo.start();//Ejecuta el método Run del objeto Runnable.
            }
        });

        marco.add(lamina);
        marco.setVisible(true);
    }
}

class Contar implements Runnable {
    JFrame marco;
    JPanel lamina;

    Contar(JFrame marco, JPanel lamina){
        this.marco = marco;
        this.lamina = lamina;
    }

    @Override
    public void run() {
        JButton boton = new JButton("0");
        lamina.add(boton);
        marco.setVisible(true);
        for (int i = 0; i< 100; i++){
            try {
                Thread.sleep(1000);
                boton.setText(Integer.toString(i));

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

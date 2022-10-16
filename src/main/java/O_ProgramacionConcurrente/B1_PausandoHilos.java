package O_ProgramacionConcurrente;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class B1_PausandoHilos {
    public static void main(String[] args) {
        JFrame marco = new JFrame("Pausando Hilo");
        JButton agregar = new JButton("Agregar");
        JPanel lamina = new JPanel(new FlowLayout());
        JPanel laminaBotones = new JPanel(new FlowLayout());
        JButton pausa = new JButton("Pausa");

        Thread hilo1 = new Thread(new Runnable() {
            @Override
            public void run() {
                JButton b = new JButton("0");
                lamina.add(b);
                for (int i = 0; i<20;i++){
                    try {
                        b.setText(Integer.toString(i));
                        marco.setVisible(true);
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        System.out.println("El Hilo se encuentra Sleep, lo que lo bloquea totalmente !!!");
                        Thread.currentThread().interrupt();
                        System.out.println(Thread.currentThread().isInterrupted());
                    }
                }
            }
        });

        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setSize(400,400);
        marco.setLayout(new BorderLayout());
        marco.add(laminaBotones,BorderLayout.SOUTH);
        marco.add(lamina,BorderLayout.CENTER);

        laminaBotones.add(agregar,BorderLayout.SOUTH);
        laminaBotones.add(pausa,BorderLayout.SOUTH);


        agregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                hilo1.start();
            }
        });
        pausa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Se intentará interrumpit el Hilo...");
                hilo1.interrupt();
                System.out.println("El Hilo esta interrumpido:  "+Thread.currentThread().isInterrupted());
            }
        });
        marco.setVisible(true);
    }
}

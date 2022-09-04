package F_InterfacesVisuales;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;

public class D2_JPasswordField {
    public static void main(String[] args) {
        JFrame marco = new JFrame();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setSize(400,200);

        JPanel lamina = new JPanel();
        JPasswordField entradaPass = new JPasswordField(20);
        JLabel msg = new JLabel("Ingrese");

        class OyentePass implements DocumentListener
        {

            @Override
            public void insertUpdate(DocumentEvent e) {
               if(entradaPass.getPassword().length < 3 || entradaPass.getPassword().length>5){
                   entradaPass.setBackground(Color.red);
                   msg.setText("No cumple ");
               }else{
                   entradaPass.setBackground(Color.white);
                   msg.setText("Cumple");
               }

            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                if(entradaPass.getPassword().length < 3 || entradaPass.getPassword().length>5){
                    entradaPass.setBackground(Color.red);
                    msg.setText("No cumple");
                    msg.setBackground(Color.red);
                }else{
                    entradaPass.setBackground(Color.white);
                    msg.setText("Cumple");
                    msg.setBackground(Color.green);
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {

            }

        }

        entradaPass.getDocument().addDocumentListener(new OyentePass());
        lamina.add(entradaPass);
        lamina.add(msg);
        marco.add(lamina);
        marco.setVisible(true);
    }

}

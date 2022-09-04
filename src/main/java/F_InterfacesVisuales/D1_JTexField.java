package F_InterfacesVisuales;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class D1_JTexField {
    public static void main(String[] args) {
        JFrame marco = new JFrame();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setSize(400,200);
        marco.setLayout(new FlowLayout());

        JTextField entradaTexto = new JTextField(10);
        JButton guardar = new JButton("Guardar");
        JLabel msg = new JLabel("",JLabel.CENTER);
        JPanel lamina = new JPanel();

        class Oyente implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                msg.setText(entradaTexto.getText().trim());
            }
        }


        guardar.addActionListener(new Oyente());

        lamina.add(entradaTexto);
        lamina.add(guardar);
        lamina.add(msg);

        marco.add(lamina);
        marco.setVisible(true);


    }
}

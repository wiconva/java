package F_InterfacesVisuales;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H1_JComboBox {
    public static void main(String[] args) {
        JFrame marco = new JFrame();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setSize(400, 400);

        JPanel lamina = new JPanel();
        JComboBox lista = new JComboBox();
        lista.addItem("Rojo");
        lista.addItem("Verde");
        lista.setEditable(true); //Ajuste para que la lista sea editable.

        lamina.add(lista);
        marco.add(lamina);

        marco.setVisible(true);

        class  OyenteLista implements ActionListener {

            @Override
            public void actionPerformed(ActionEvent e) {
                if(lista.getSelectedIndex() == 0){
                    lamina.setBackground(Color.red);
                }else{
                    lamina.setBackground(Color.green);
                }
            }
        }
        lista.addActionListener(new OyenteLista());
    }
}

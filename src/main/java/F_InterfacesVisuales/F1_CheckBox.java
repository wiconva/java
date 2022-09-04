package F_InterfacesVisuales;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class F1_CheckBox {
    public static void main(String[] args) {
        /*Los check son para seleccionar varias opciones*/

        JFrame marco = new JFrame();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setSize(400,200);

        JPanel lamina = new JPanel();
        JLabel msg = new JLabel("Mensaje de prueba");

        msg.setHorizontalAlignment(JLabel.CENTER);

        JCheckBox checkGrande = new JCheckBox("grande");
        JCheckBox checkCursiva  = new JCheckBox("Cursiva");

        lamina.setLayout(new BorderLayout());

        lamina.add(msg, BorderLayout.NORTH);
        lamina.add(checkGrande,BorderLayout.WEST);
        lamina.add(checkCursiva, BorderLayout.EAST);

        marco.add(lamina);
        marco.setVisible(true);


        class OyenteCheck implements ActionListener {
            private int tamano;
            private  int tipo;

            @Override
            public void actionPerformed(ActionEvent e) {
                if(checkGrande.isSelected()){
                    tamano = 30;
                }else{
                    tamano = 15;
                }
                if (checkCursiva.isSelected()){
                    tipo = Font.ITALIC;
                }else {
                    tipo = Font.BOLD;
                }
                msg.setFont(new Font("serif",tipo,tamano));
            }
        }
        checkGrande.addActionListener(new OyenteCheck());
        checkCursiva.addActionListener(new OyenteCheck());

    }
}

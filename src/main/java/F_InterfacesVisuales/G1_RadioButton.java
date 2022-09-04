package F_InterfacesVisuales;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class G1_RadioButton {
    public static void main(String[] args) {
        JFrame marco = new JFrame();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setSize(400,400);

        JPanel lamina = new JPanel();
        JRadioButton botonRojo = new JRadioButton("Rojo",false);
        JRadioButton botonVerde = new JRadioButton("Verde",false);

        //Se deben agrupar los botones para que solo se seleccione uno.
        ButtonGroup grupoRadio = new ButtonGroup();

        grupoRadio.add(botonRojo);
        grupoRadio.add(botonVerde);

        //Se agregan los botones a la lamina, no el grupo, el grupo solo gestina la selección de uno.
        lamina.add(botonRojo);
        lamina.add(botonVerde);

        marco.add(lamina);
        marco.setVisible(true);

        class OyenteBoton implements ActionListener {
            Color color;
            OyenteBoton (Color c){
                this.color = c;
            }

            @Override
            public void actionPerformed(ActionEvent e) {
                lamina.setBackground(color);
            }
        }
        botonRojo.addActionListener(new OyenteBoton(Color.red));
        botonVerde.addActionListener(new OyenteBoton(Color.green));
    }
}

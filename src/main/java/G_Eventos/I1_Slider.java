package G_Eventos;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class I1_Slider {
    public static void main(String[] args) {
        JFrame marco =new JFrame();
        marco.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        marco.setSize(400,400);

        JPanel lamina = new JPanel();
        lamina.setLayout(new BorderLayout());

        JSlider slider = new JSlider(JSlider.HORIZONTAL, 0,100,20);
        slider.setMajorTickSpacing(30); //Mayor división.
        slider.setMinorTickSpacing(15);//Menor división.
        slider.setSnapToTicks(true); //Al soltar vaya al punto mas cercano.
        slider.setPaintTicks(true);//Imprime las divisiones.
        slider.setPaintLabels(true);//Imprime las etiquetas.

        JLabel msg = new JLabel("texto prueba");
        msg.setHorizontalAlignment(JLabel.CENTER);

        lamina.add(slider, BorderLayout.SOUTH);
        lamina.add(msg,BorderLayout.NORTH);
        marco.add(lamina);
        marco.setVisible(true);


        //Clase oyente de cambios en el slider.
        class OyenteSlider implements ChangeListener {

            @Override
            public void stateChanged(ChangeEvent e) {
                msg.setFont(new Font("serif",Font.BOLD,slider.getValue()));
            }
        }
        slider.addChangeListener(new OyenteSlider());
    }
}

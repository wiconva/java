package F_InterfacesVisuales;

import javax.swing.*;

public class I1_JSlider {
    public static void main(String[] args) {
        JFrame marco =new JFrame();
        marco.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        marco.setSize(400,400);

        JPanel lamina = new JPanel();

        JSlider slider = new JSlider(JSlider.HORIZONTAL, 0,100,20);
        slider.setMajorTickSpacing(30); //Mayor división.
        slider.setMinorTickSpacing(15);//Menor división.
        slider.setSnapToTicks(true); //Al soltar vaya al punto mas cercano.
        slider.setPaintTicks(true);//Imprime las divisiones.
        slider.setPaintLabels(true);//Imprime las etiquetas.

        lamina.add(slider);
        marco.add(lamina);
        marco.setVisible(true);
    }
}

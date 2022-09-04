package F_InterfacesVisuales;

import javax.swing.*;
import java.awt.*;

public class J1_JSpinner {
    public static void main(String[] args) {
        JFrame marco = new JFrame();
        marco.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        marco.setSize(400,200);

        JPanel lamina = new JPanel();
        JSpinner spinner = new JSpinner();//Spinner por defecto número e infinito.
        spinner.setPreferredSize(new Dimension(100,50));//Se puede ajustar el tamaño.

        JSpinner spinnerFecha = new JSpinner( new SpinnerDateModel( ));//Spinner para fechas.
        JSpinner spinnerNumero = new JSpinner(new SpinnerNumberModel(0,-5,5,1));//Spinner para numeros con personalización.

        String[] lista = {"Valor 1", "Valor 2", "Valor 3"};
        JSpinner spinnerLista = new JSpinner(new SpinnerListModel(lista));

        lamina.add(spinner);
        lamina.add(spinnerFecha);
        lamina.add(spinnerNumero);
        lamina.add(spinnerLista);
        marco.add(lamina);
        marco.setVisible(true);
    }
}

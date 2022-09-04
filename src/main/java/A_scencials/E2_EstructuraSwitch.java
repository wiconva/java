package A_scencials;

import javax.swing.*;

public class E2_EstructuraSwitch {
    public static void main(String[] args) {
        String datoEntrada;
        datoEntrada = JOptionPane.showInputDialog("Ingrese un número 1-2");
        switch (datoEntrada){
            case "1":
                System.out.println("Ingesó el número 1");
                break;
            case "2":
                System.out.println("Ingresó el número 2");
                break;
            default:
                System.out.println("Ingresó un número diferente al solicitado");
                break;
        }
    }
}

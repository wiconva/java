package A_scencials;

import javax.swing.*;

public class E_CondicionesIF {
    public static void main(String[] args) {

        String datoEntrada;
        datoEntrada = JOptionPane.showInputDialog("Ingrese un número entero 1-2");

        if(datoEntrada.equals("1")){
            System.out.println("Ingresaste el número 1");
        }else {
            System.out.println("Ingresaste el número 2 u otro diferente a 1");
        }
    }
}

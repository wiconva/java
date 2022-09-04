package A_scencials;

import javax.swing.*;

public class E3_OperadorTernario {
    public static void main(String[] args) {
        String datoEntrada, mensaje;
        datoEntrada = JOptionPane.showInputDialog("Ingrese un número 1");
        mensaje = (datoEntrada.equals("1"))? "Ingresó el número 1":"Ingresó diferente de 1";
        System.out.println(mensaje);
    }
}

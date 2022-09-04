package I_VentanasEmergentes;

import javax.swing.*;

public class B1_InputDialog {
    public static void main(String[] args) {
        String entrada ;
        entrada = JOptionPane.showInputDialog(null,"Ingrese algo","Ventana Entrada",
                JOptionPane.QUESTION_MESSAGE);
        System.out.println(entrada);
    }
}

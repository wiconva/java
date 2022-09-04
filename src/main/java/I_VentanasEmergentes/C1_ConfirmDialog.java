package I_VentanasEmergentes;

import javax.swing.*;

public class C1_ConfirmDialog {
    public static void main(String[] args) {
        int respuesta;
        respuesta= JOptionPane.showConfirmDialog(null,"Confirme","Titulo",0);
        System.out.println(respuesta);
    }
}

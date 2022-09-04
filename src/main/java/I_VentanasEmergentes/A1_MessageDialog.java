package I_VentanasEmergentes;

import javax.swing.*;

public class A1_MessageDialog {
    public static void main(String[] args) {
        //Muestar ventana con un mesaje no devuelve nada.
        JOptionPane.showMessageDialog(null,"Ventana mensaje","Titulo",
                JOptionPane.ERROR_MESSAGE,null);
    }
}

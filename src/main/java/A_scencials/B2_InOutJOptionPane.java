package A_scencials;

import javax.swing.*;

public class B2_InOutJOptionPane {
    public static void main(String[] args) {
        String linea;
        float decimal;

        // Los valores decimales se ingresan con '.'
        linea = JOptionPane.showInputDialog("Ingrese una linea de texto");
        JOptionPane.showMessageDialog(null, "El texto ingresado fue: "+linea);

        String dataEntry = JOptionPane.showInputDialog("Ingrese un valor decimal con punto ó coma");
        if(dataEntry.contains(","))dataEntry=dataEntry.replace(',','.');
        decimal = Float.parseFloat(dataEntry);
        JOptionPane.showMessageDialog(null,"El decimal ingresado fue: "+ decimal);

    }
}

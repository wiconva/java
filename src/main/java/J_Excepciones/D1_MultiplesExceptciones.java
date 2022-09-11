package J_Excepciones;

import javax.crypto.spec.PSource;
import javax.swing.*;

public class D1_MultiplesExceptciones {
    public static void main(String[] args) {
        try {
            int input = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un dividendo..."));
            int resultado = 100/input;
        }catch (NumberFormatException e){//Primer Excepción por tipo de dato de entrada no numérico.
            System.out.println("Entrada invalida!!!");
            System.out.println(e.getMessage());
            System.out.println( "tipo de Excepción :"+e.getClass().getName());
            e.printStackTrace();
        }catch (ArithmeticException e){//Segunda Excepción por división entre cero.
            System.out.println("Operación no valida!!!");

        }
        System.out.println("Proceso finalizado...");
    }

}

package J_Excepciones;

import javax.swing.*;

public class C1_Personalizadas {
    public static void main(String[] args) {
        /*para lanzar excepciones personalizadas se crea una clase que herede de Exception para que
          sea obligatorio el try ó RuntimeException para que no sea obligatorio.
         */

        try {
            pedirEdad();
            System.out.println("Eres mayor de edad y puedes utilizar la app");
        } catch (MenorEdad e) {
            System.out.println("Edad incorrecta!!!");
            e.printStackTrace();
        }
    }
    //Método que lanza la excepción.
    public static void  pedirEdad() throws MenorEdad {
        String in = JOptionPane.showInputDialog(null,"Ingresa tu edad...");
        if(Integer.parseInt(in)<18){
            //lanza la excepción a pedido.
            throw new MenorEdad("La edad de uso es menor a la esperada.");
        }
    }
}
class MenorEdad extends Exception {

    MenorEdad(){}
    MenorEdad(String msg){
        super(msg);
    }
}

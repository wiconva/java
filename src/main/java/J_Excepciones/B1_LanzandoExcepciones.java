package J_Excepciones;

import javax.swing.*;
import java.io.IOException;

public class B1_LanzandoExcepciones {
    public static void main(String[] args) {

        //Al ser una excepción que hereda de IOException obligatoriamente debe ser tratada.
        try{
            pedirEdad();
        }catch (IOException e){
            System.out.println("Eres menor de edad, usuario no valido.");
        }


    }

    //Este método lanza una excepción, bajo demanda.
    public static void pedirEdad() throws IOException {
        String edad;
        edad = JOptionPane.showInputDialog(null,"Ingresa tu edad");
        if (Integer.parseInt(edad)<18){
            throw new IOException();//Lanzamiento de excepción.
        }
    }
}

package K_Ficheros;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class B1_EscribiendoWriter {
    public static void main(String[] args) {

        try {
            FileWriter escrituraArchivo = new FileWriter("src/main/resources/ficheros/escritura.txt",true);//true para agregar cuando lo abra.
            String msg = "Prueba de escritura en el archivo";
            for (int i=0; i<msg.length();i++){
                escrituraArchivo.write(msg.charAt(i));
                System.out.println("Se ha escrito el caracter: \t"+msg.charAt(i));//Adiciona caracter por caracter.
            }
            escrituraArchivo.close();//Se debe cerrar el flujo.
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

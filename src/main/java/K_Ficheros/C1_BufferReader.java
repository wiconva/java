package K_Ficheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class C1_BufferReader {
    public static void main(String[] args) {
        /* El buffer  crea una memoria intermedia yse utiliza para optimizar el la ejecución
        ya que para archivos muy grandes la
        lectura caracter a caracter es poco eficiente.
         */
        String input;
        FileReader lector = null;
        try {
            lector = new FileReader("src/main/resources/ficheros/lectura.txt");
            BufferedReader bufferedReader = new BufferedReader(lector);

            do{
                input = bufferedReader.readLine();
                System.out.println("Linea leida: \t"+input);
            }while (input != null);

            bufferedReader.close();
            lector.close();//en la instancia del buffer se pasa el lector del archivo.
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}

package K_Ficheros;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class A1_LeyendoReader {
    public static void main(String[] args) {
        /* Para la lectura se pude realizar de dos formas, como caracteres legibles Read o como bytes InputStream,
           la primera se utiliza para situaciones donde nos interesa saber el contenido del documento y
           la segunda cuando no es necesario conocer el contenido.
         */

        try {
            FileReader lectorArchivo = new FileReader("src/main/resources/ficheros/lectura.txt");
            int entrada;
            char caracter;
            do{
                entrada = lectorArchivo.read();//Número que representa el caracter leido.
                caracter = (char)entrada;//Caracter Ascii
                System.out.println("Valor leído: "+entrada+" \t Representación: \t"+caracter);

            }while(entrada != -1);
            lectorArchivo.close();
        } catch (FileNotFoundException e) {
            System.out.println("No encontró el archivo a leeer.");
        } catch (IOException e) {
            System.out.println("Problemas al leeer el archivo.");
        }

    }
}

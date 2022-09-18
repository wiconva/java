package K_Ficheros;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class D1_BufferWriter {
    public static void main(String[] args) {
       String fecha = new Date().toString();


        try {
            FileWriter fileWriter = new FileWriter("src/main/resources/ficheros/escritura.txt",true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter) ;

            bufferedWriter.write(fecha);
            bufferedWriter.newLine();


            bufferedWriter.close();//Cerrrar el flujo del buffer primero.
            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

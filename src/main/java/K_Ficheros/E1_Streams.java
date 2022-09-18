package K_Ficheros;

import java.io.*;

public class E1_Streams {
    public static void main(String[] args) {

        //El flujo trata byte a byte lo que permite copiar o interpretar la información que se extrae de un canal.
        File file = new File("src/main/resources/ficheros/lectura.txt");
        long fileSize = file.length();
        int [] fileBytes = new int[(int)fileSize];
        try {
            FileInputStream fileInputStream = new FileInputStream(file);//Abre el conal.
            System.out.println("Bytes de archivo de entrada:");
            for (int i = 0; i< fileSize;i++){
              fileBytes[i] = fileInputStream.read();
                System.out.print((char)fileBytes[i]);
            }
            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Creando una copia del archivo utilizao el flujo de streams.
        File fileSalida = new File("src/main/resources/ficheros/copia.txt");//Se puede crear cualquier archivo: Excel, imagen, pdf...
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(fileSalida);
            for (int i =0; i < fileSize;i++){
                fileOutputStream.write(fileBytes[i]);
            }
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("No se pudo copiar el archivo...");
        }
    }
}

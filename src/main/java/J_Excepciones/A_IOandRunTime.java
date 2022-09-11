package J_Excepciones;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class A_IOandRunTime {
    public static void main(String[] args) {
        /*Existen dos tipos de excepciones: IOException y las RuntimeException
         las primeras con comprpbadas quiere decir que no dependen del programador y java obliga
         desde el propio compilador a implementar los métodos para tratarlas. eg:acceder a archivos que
          fueron retirados de la rutas.Las segundas son no
         comprobadas y dependen del programador eg: acceder a indices de arreglos que no existen, el programador
         esta obligado a tratarlas ya que java no lo hace.
         */

        //Comprobadas IOException
        try {
            //Al existir un lanzamiento de excepción se pasa al catch y ejecuta lo que se encuentra en ese bloque
            Image img = ImageIO.read(new File("src/main/resources/Img/meliodas.png"));
            System.out.println("Se cargo la imagen...");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Hubo problemas al cargar el archivo..");
        }

        //No comprobadas, java no sugiere tratamiento depende del programador.
        int [] a = new int[2];
        System.out.println("El programa se caerá ya que no se trata la RuntimeException...");
        a[0] = 0;
        a[1] = 1;
        a[2] = 2;

    }
}

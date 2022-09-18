package L_Serializacion;

import java.io.*;

public class A1_Objetos {
    public static void main(String[] args) {
        /*Se serializan objetos para poder eviarlos por la web, a otras aplicaciones o almacenarlos y posteriormente
          recuperarlos, Java crea un SHD,   que es una número de identificación único de la clase en función de sus atributos
          y métodos, al recuperar el objeto serializado este número debe ser igual, de lo contrario no será capaz de
          realizar la operción inversa. Este número se asigna automaticamente  o manualmente.
          Se recomienda de forma manual para cuando se realicen cambios en el objeto y si no cambia el número de versión
          este el recptor en condiciones de interpretarlo sin problemas.
         */

        Empleado empleado1 = new Empleado("Willian", 36);
        File file = new File("src/main/resources/ficheros/objetos.txt");
        try {

            //Emisor
            FileOutputStream fileOutputStream = new FileOutputStream(file);//Abre el flujo de salida al archivo creado.
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);//Objeto que se encarga de transmitir el objeto serializado.
            objectOutputStream.writeObject(empleado1);
            objectOutputStream.close();
            fileOutputStream.close();


            //Recuperando el objto almacendo
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));//Abriendo el flujo de entrada del fichero con el objeto.
            Object objetoLeido = objectInputStream.readObject();
            System.out.println(objetoLeido.toString());
            objectInputStream.close();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

//Los objetos que se quieran serializar deben implementar la interface Serializable que no tiene método alguno.
class Empleado implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;//SDH
    String nombre;
    int edad;
    Empleado(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;

    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}

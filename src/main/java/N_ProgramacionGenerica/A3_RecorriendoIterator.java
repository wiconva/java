package N_ProgramacionGenerica;

import java.util.ArrayList;
import java.util.Iterator;

public class A3_RecorriendoIterator {
    public static void main(String[] args) {
        /*La interface Iterator permite recorrer la lista con sus tres métodos

         */
        class Empleado {
            String nombre;

            Empleado(String nombre) {
                this.nombre = nombre;
            }

            public String getNombre() {
                return nombre;
            }
        }

        ArrayList <Empleado> empleados = new ArrayList<>();
        for (int i = 0; i<10; i++){
            empleados.add(new Empleado("Empleado "+i));
        }

        Iterator <Empleado> iterator = empleados.iterator();//Se instancia el iterator apartir de la lista.

        while (iterator.hasNext()){//Existe otro objeto en la lista.
            System.out.println(iterator.next().getNombre());//Obtiene el objeto  y actualiza el iterador.

        }
    }
}

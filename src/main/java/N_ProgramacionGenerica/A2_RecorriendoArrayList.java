package N_ProgramacionGenerica;

import java.util.ArrayList;

public class A2_RecorriendoArrayList {
    public static void main(String[] args) {

        class Empleado {
            String nombre;

            Empleado(String nombre) {
                this.nombre = nombre;
            }

            public String imprimirInfo() {
                return this.nombre;
            }
        }

        ArrayList<Empleado> empleados = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            empleados.add(new Empleado("Empleado " + i));
        }

        //Recorriendo con ForEach
        System.out.println("Imprimiendo con ForEach-----------");
        for (Empleado e : empleados) {
            System.out.println(e.imprimirInfo());
        }

        //Agregando en una posición determinada, reemplaza al objeto existente de haberlo.
        empleados.set(0, new Empleado("Empleado -1"));

        System.out.println("Imprimiendo con for clásico------------");
        //Recorriendo con for clásico.
        for (int i = 0; i < empleados.size(); i++) {
            System.out.println(empleados.get(i).imprimirInfo());//Devuelve la referencia al objeto.
        }

        //Recorriendo como un array.
        System.out.println("Imprimiedo como un arreglo -------------");
        Empleado[] empleadosArray = new Empleado[empleados.size()];
        empleados.toArray(empleadosArray);
        for (int i = 0; i < empleadosArray.length; i++) {
            System.out.println(empleadosArray[i].imprimirInfo());
        }
    }
}


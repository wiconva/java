package P_EstructuraDatos;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public class B1_Set {
    public static void main(String[] args) {
        /* La interface Set se utiliza para crear colecciones  que no perimite repetir datos, para ello se ajusta el método
           Equals de la clase de objetos. para recorrer las colecciones se utiliza el método for each y cuando requiere
           editar campos dentro de los objetos se recomienda mediante el uso de la interce Iterator.
         */
        class Empleado{
            String nombre;
            Empleado(String n){
                this.nombre=n;
            }

            @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                Empleado empleado = (Empleado) o;
                return nombre.equals(empleado.nombre);
            }

            @Override
            public int hashCode() {
                return Objects.hash(nombre);
            }
        }
        //----------------------------
        Empleado empleado0 = new Empleado("Xiomara");
        Empleado empleado1 = new Empleado("Willian" );
        Empleado empleado2 = new Empleado("Yeimi");
        Empleado empleado3 = new Empleado("Willian");
        Empleado empleado4 = new Empleado("Hellen");

        Set<Empleado> listaEmpleados = new HashSet<>();



        listaEmpleados.add(empleado1);
        listaEmpleados.add(empleado2);
        listaEmpleados.add(empleado3);
        listaEmpleados.add(empleado4);
        listaEmpleados.add(empleado0);

        //No agrega el empleado tres ya que se encuentra repetido según lo seteado en la clase Equals.
        System.out.println("Colección agregada:");
        for (Empleado e: listaEmpleados){
            System.out.println(e.nombre);
        }
        // La interface Iterator tiene tres métodos para recorrer colecciones. hasNext, next, remove.
        Iterator<Empleado> it = listaEmpleados.iterator();

        while (it.hasNext()){
            if (it.next().nombre.equals("Willian")){
                it.remove();
            }
        }
        System.out.println("\nLista despues de eliminar objeto");
        for (Empleado e: listaEmpleados){
            System.out.println(e.nombre);
        }



    }
}

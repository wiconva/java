package P_EstructuraDatos;

import java.util.Comparator;
import java.util.TreeSet;

public class D3_TreeSetObjetoPropioOrdenString {
    public static void main(String[] args) {
        /*Se puede crear listas de árbol con objetos que no implemente la interface comparable*/
        class   Objeto {
            int id;
            String descripcion;
            Objeto (int id, String descripcion ){
                this.id = id;
                this.descripcion = descripcion;
            }
        }
        //Clase que comparará los objetos según el método sobreescrito.
        class Comparador implements Comparator <Objeto>{
            @Override
            public int compare(Objeto o1, Objeto o2) {
               return o1.descripcion.compareTo(o2.descripcion);
            }
        }

        //----------------------------------------------
        TreeSet <Objeto> lista = new TreeSet<>(new Comparador());

        //Tener encuenta que los compara por su equivalente Ascii influye si es maýscula
        lista.add(new Objeto(10,"C"));
        lista.add(new Objeto(2, "W"));
        lista.add(new Objeto(1,"A"));

        for (Objeto o: lista){
            System.out.println(o.descripcion);
        }

    }
}

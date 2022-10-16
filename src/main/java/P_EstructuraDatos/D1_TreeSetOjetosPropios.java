package P_EstructuraDatos;

import com.sun.source.tree.Tree;

import java.util.TreeSet;

public class D1_TreeSetOjetosPropios {
    public static void main(String[] args) {

        class Objeto implements Comparable <Objeto> {
            private final int id;
            String descripcion;
            Objeto (int id, String descripcion){
                this.id = id;
                this.descripcion = descripcion;
            }
            //Método sobreescrito que devuelve 1 si es mayor -1 si es menor y cero si es igual.
            @Override
            public int compareTo(Objeto o) {
               return id - o.id;
            }
        }

        TreeSet <Objeto> lista = new TreeSet<>();
        //Adición de elementos a lista sin orden
        lista.add(new Objeto(10,"Soy el diez"));
        lista.add(new Objeto(2, "Soy el dos"));
        lista.add(new Objeto(1,"Soy el uno"));
        //Imprime lo almacena por el orden del método sobreescrito compareTo.
        for (Objeto o:lista){
            System.out.println(o.descripcion);
        }
    }
}


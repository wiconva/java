package P_EstructuraDatos;

import com.sun.source.util.Trees;

import java.util.TreeSet;

public class D1_TreeSet {
    public static void main(String[] args) {
        /*Permite almacenar colecciones ordenadas*/

        TreeSet<String> coleccion = new TreeSet<>();
        /*las almacena por orden  alfabético ya que la clase String implementa la interface Comparable con su
         método compareTo, no permite dupicados a ser de tipo set*/
        coleccion.add("Willian");
        coleccion.add("Willian");
        coleccion.add("Maria");
        coleccion.add("Ana");
        coleccion.add("Yeimi");
        coleccion.add("Hellen");
        coleccion.add("Dante");

        System.out.println(coleccion);
    }
}

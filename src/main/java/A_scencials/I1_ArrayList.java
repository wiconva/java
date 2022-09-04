package A_scencials;

import java.util.ArrayList;

public class I1_ArrayList {
    /*Permite crear lista de objetos de un mismo tipo, muestra la forma de recorrerlos e
      imprimirlos por consola*/

    public static void main(String[] args) {
        ArrayList <String> lista = new ArrayList<>();
        lista.add("Willian");
        lista.add("Hellen");
        lista.add("Yeimi");

        // Mostrando el contenido en la lista con forEach tipo flecha.
        System.out.println("Mostrando el contenido de la lista con For Each tipo f-> flecha...");
        lista.forEach(nombre->{
            System.out.println("El nombre en la lista es: "+nombre);
        });

        //Mostrando el contenido con forEach tradicional.
        System.out.println("Mostrando el contenido de la lista con For Each tradicional...");
        for (String nombre:lista) {
            System.out.println("El nombre en la lista es :"+nombre);
        }

        //Mostrando el contenido con for  tradicional.
        System.out.println("Mostrando el contenido de la lista con For tradicional");
        for(int i=0; i< lista.size(); i++){
            System.out.println("El nombre en la lista es: "+ lista.get(i)  );
        }
        //Mostrando el contenido de la lista sólo con el método print;
        System.out.println("Mostrando el contenido de la lista con el método print");
        System.out.println(lista);
    }
}

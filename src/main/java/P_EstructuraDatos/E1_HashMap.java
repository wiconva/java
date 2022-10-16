package P_EstructuraDatos;

import java.util.HashMap;

public class E1_HashMap {
    public static void main(String[] args) {
        /*La interface Map adminte un pareja de llave - valor, la llave puede ser cualquier tipo de objeto
          al igual que el valor, la llave que se repita sobreescribe ese elemento.
         */
        HashMap<Integer, String> lista = new HashMap<>();

        lista.put(3,"Tres");
        lista.put(1, "Uno");
        lista.put(2,"Dos");

        System.out.println(lista);
        System.out.println("Claves: ");
        for (Integer i: lista.keySet()){
            System.out.println(i);
        }
        System.out.println("Valores: ");
        for (String s:lista.values()){
            System.out.println(s);
        }
    }
}

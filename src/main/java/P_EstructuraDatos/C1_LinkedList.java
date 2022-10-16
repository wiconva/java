package P_EstructuraDatos;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class C1_LinkedList {
    public static void main(String[] args) {

        /*Son listas en enlazadas, son mas eficientes*/
        LinkedList <String> paises = new LinkedList<>();
        paises.add("Colombia");
        paises.add("Perú");
        paises.add("Chile");
        paises.add("Bolivia");

        List <String> paisesEuropeos = new ArrayList<>();
        paisesEuropeos.add("España");
        paisesEuropeos.add("Alemania");
        //Crea una lista a partir de otras, se puede utilizar el iterator.
        LinkedList <String> todos = new LinkedList<>();
        todos.addAll(paises);
        todos.addAll(paisesEuropeos);

        System.out.println(todos );
    }
}

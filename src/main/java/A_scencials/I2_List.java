package A_scencials;

import java.util.ArrayList;
import java.util.List;

public class I2_List {
    public static void main(String[] args) {
        // La interface List permite almacenar cualquier tipo de objetos.
        List<Object> lista = new ArrayList<>();

        //Agregando un String.
        lista.add("Willian");
        lista.add(3);
        lista.add(true);
        System.out.println(lista);
    }
}

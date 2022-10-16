package P_EstructuraDatos;

import java.util.Objects;

public class A1_EqualsMethods {
    public static void main(String[] args) {
        /* El método Equals pertenece a la clase Object y sirve para comparar dos objetos. Para los objetos
          que definimos no funciona. es necesario sobre-escribirlo de igual forma el método Hashcode devuelve
          un numero que es igual para dos objetos iguales.
         */
        String nombre1 = "Willian";
        String nombre2 = "Willian";

        System.out.println("El nombre 1 y el nombre 2 son iguales ?     : "+ nombre1.equals(nombre2)+
                "   Hascode1: "+nombre1.hashCode()+"   Hascode2:   "+nombre2.hashCode());

        Nombre nombre3 = new Nombre("Willian");
        Nombre nombre4 = new Nombre("Willian");

        //Devuelve false ya que el método Equals no esta prepara para la evaluación del elemento.
        System.out.println("El nombre 1 y el nombre 2 son iguales ?     : "+ nombre3.equals(nombre4)+
                "   Hascode1: "+nombre3.hashCode()+"   Hascode2:   "+nombre4.hashCode());

        NombreEquals nombre5 = new NombreEquals("Willian");
        NombreEquals nombre6 = new NombreEquals("Willian");

        //Devuelve true ya que se preparó el método para que puediera realizar la evalación.
        System.out.println("El nombre 1 y el nombre 2 son iguales ?     : "+ nombre5.equals(nombre6)+
                "   Hascode1: "+nombre5.hashCode()+"   Hascode2:   "+nombre6.hashCode());

    }
}
class Nombre {
    String nombre;

    Nombre(String n){
        this.nombre = n;
    }
}

class NombreEquals {
    String nombre;
    NombreEquals(String nombre){
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NombreEquals that = (NombreEquals) o;
        return Objects.equals(nombre, that.nombre);
    }
    //Devuelve un número identificativo de la posisición en memoria del Objeto.
    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }
}
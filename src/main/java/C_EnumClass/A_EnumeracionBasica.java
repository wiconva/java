package C_EnumClass;

public class A_EnumeracionBasica {

    public static void main(String[] args) {

        Enumeracion1 enumeracion1 = Enumeracion1.GRANDE;
        Enumeracion2 enumeracion2 = Enumeracion2.PEQUENA;
        System.out.println("Instancia de la variable de tipo :"+ enumeracion1.getClass().getSimpleName()
               +" -Con valor: "+enumeracion1.name() );

        System.out.println("Instancia de la variable de tipo :"+ enumeracion2.getClass().getSimpleName()
                +" -Con valor: "+enumeracion2.name() + " y valor : "+ enumeracion2.abreviacion);

    }
}

enum Enumeracion1  {
    /* Las enumeraciones son tipos de datos que permiten restringir los valores que pueden tomar
       las variables instanciadas de este mismo.*/
    PEQUENA, MEDIANA, GRANDE; // Las variables de tipo Enumeración1 sólo pueden tomar valores de este conjunto.
}


enum Enumeracion2{
    /* Pueden tener constructores y métodos para acceder al valor que almacena cada opcion de selección
       dentro de la clase, el constructor es privado ya que se invoca automáticamente cuando la variable es creada.
     */
    PEQUENA("S"), MEDIANA("M"), GRANDE("L");// Valor almacenado para cada opción.
    String abreviacion ; // Variable en la que se almacena el valor desde el constructor.

    private Enumeracion2(String m) {//Constructo privado que se ejecuta autómaticamente cuando se crea el objeto.
        abreviacion = m;
    }
}

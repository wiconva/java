package A_scencials;

public class J_MultiplesClasesUnArchivo {
    /*Java crea un fichero .java y el número de ficheros fuente .class correspondiente al
      número de clases que se hayan creado, se recomienda crear un fichero por cada clase.
     */
    public static void main(String[] args) {// solo una clase puede tener el método main.
        ImprimirConsola.imprime("\n Clase dentro del mismo fichero !!!");

    }
}

class ImprimirConsola{ //Las demás clases no puede tener operador de encapsulamiento."Public, private
    public static void imprime(String msg){
        System.out.println(msg);
    }
}

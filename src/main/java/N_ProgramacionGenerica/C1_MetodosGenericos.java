package N_ProgramacionGenerica;

public class C1_MetodosGenericos {
    public static void main(String[] args) {
        /*Para crear métodos genéricos no es neccesario que la clase sea genérica.

         */
        String [] arrayNombres = {"Willian","Hellen","Yeimi"};
        Integer [] arrayNumeros = {1,2,3,4};
        System.out.println(Ordenador.ordenar(arrayNombres));
        System.out.println(Ordenador.ordenar(arrayNumeros));

    }
}
class Ordenador {

    /*Método genérico dentro de una clase no genérica, se especifica el el parámetro
     genérico y si extiende de otra clase, luego si el método devuelve algún tipo de objeto.
     en este caso se especifíca que lo objetos recibidos de tipo T deben impelmentar la interface
     comparable como los String, Date, Integer. Esta interface implementa el método compareTo que devuelve
     1 para mayor, -1 menor y cero para iguales.
     */
    public static <T extends Comparable> T ordenar( T [] n){
        T objetoMenor = n[0];
        for(int i = 1; i< n.length;i++){
            if(objetoMenor.compareTo(n[i])>0){
                objetoMenor = n[i];
            }
        }
        return objetoMenor;
    }
}
package A_scencials;

public class A2_ClaseString {
    public static void main(String[] args) {
        String miNombre = "Willian";
        System.out.println(miNombre);
        System.out.println("Tiene "+miNombre.length()+" Letras" );
        System.out.println("La primer letra es: "+miNombre.charAt(0));
        System.out.println("La última letra es: "+miNombre.charAt(miNombre.length()-1));
        System.out.println("Las letras del 1 al 3 son: "+miNombre.substring(0,3));// No toma el valor 3.
        System.out.println("Es la palabra igual? " + miNombre.equals("willian"));
        System.out.println("Es la palabra igual? " + miNombre.equalsIgnoreCase("willian"));

    }
}

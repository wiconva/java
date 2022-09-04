package A_scencials;

import java.util.Scanner;

public class B1_InOutConsola {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);// Los decimales se ingresan con ','
        System.out.println("Ingrese una letra");
        char letra = sc.next().charAt(0); //Retorna un caracter.
        System.out.println("Ingrese una palabra");
        String palabra = sc.next();// Retorna una cadena hasta que encuentra un espacio o nueva línea.
        System.out.println("Ingrese una linea completa");
        String linea = sc.nextLine();
        System.out.println("Ingrese un número entero");
        int entero = sc.nextInt();
        System.out.println("Ingrese un Número decimal");
        float decimal = sc.nextFloat();

        System.out.println("Letra: "+letra);
        System.out.println("Palabra: "+palabra);
        System.out.println("Línea: "+linea);
        System.out.println("Entero: "+entero);
        System.out.println("Decimal: "+decimal);
    }
}

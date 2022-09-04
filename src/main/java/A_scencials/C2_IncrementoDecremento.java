package A_scencials;

public class C2_IncrementoDecremento {
    public static void main(String[] args) {
        int x = 0, y;

        System.out.print("X con Post-incremento: " + x++);// después de  imprimir realiza el incremento.
        System.out.println(" - Luego de ejecutar la sentencia: "+ x);

        x = 0;
        System.out.print("X con Pre-incremento: " + ++x);// después de la imprimir realiza el incremento.
        System.out.println(" - Luego " +x);

        x=1; y=0;
        // Asignando el incremento

        y =+x; // Incrementa antes de realizar la asignación.
        System.out.println("Y: "+y+" Y: "+x);

        x=1; y=0;
        y += x; // Incrementa después de realizar la asignación.
        System.out.println("Y: "+y+" Y: "+x);


    }
}

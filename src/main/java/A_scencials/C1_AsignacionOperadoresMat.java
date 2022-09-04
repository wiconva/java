package A_scencials;

public class C1_AsignacionOperadoresMat {
    public static void main(String[] args) {
        float suma = 10, resta=10, multiplicacion=10, division=10, residuo=15;
        int numero = 10;

        suma +=numero; // suma = suma + numero
        resta -= numero; // resta = resta + numero
        multiplicacion*= numero;
        division /= numero;
        residuo %= numero;

        System.out.println("Suma : "+suma);
        System.out.println("Resta : "+resta);
        System.out.println("Multiplicación : "+multiplicacion);
        System.out.println("Division : "+division);
        System.out.println("Residuo : "+residuo);
    }
}

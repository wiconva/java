package A_scencials;

public class B3_FormatoSalida {
    public static void main(String[] args) {
        float decimal1 = 135.12345678f;
        System.out.println("Valor sin formato: "+ decimal1 );
        System.out.print("Valor con formato: " );
        System.out.printf("%1.2f",decimal1);//Imprime con formato.
    }
}

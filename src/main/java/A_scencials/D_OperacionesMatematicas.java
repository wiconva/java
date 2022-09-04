package A_scencials;

public class D_OperacionesMatematicas {
    public static void main(String[] args) {
        //Se utiliza la clase Estática Math.
        float numAleatorio;
        int redondeo;

        numAleatorio = (float)Math.random();
        redondeo = Math.round(numAleatorio*10);

        System.out.println("El número aleatorio es : "+numAleatorio);
        System.out.println("El número"+numAleatorio*10+" redondeado es : "+redondeo);
    }
}

package B_herencia;

public class C2_FinalMetodos {
    public static void main(String[] args) {

    }
}

class Redondo {
    public Redondo(){

    }

    //Clausula final no permite que este método sea sobre escrito.
    public final void rodar(){
        System.out.println("soy redondo y estoy girando.");
    }
}


/* Descomentar para ver error.
class Balon extends Redondo {
    public Balon (){
        super();
    }
    //No permite que se pueda sobres escribir método.
    public void rodar(){
        System.out.println("Soy redondo pero no puedo girar.");
    }
}
*/
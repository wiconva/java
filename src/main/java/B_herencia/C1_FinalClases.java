package B_herencia;

class C1_FinalClasesMetodos {

    public static void main(String[] args) {

    }
}

//El operador final impide que otra clase pueda heredar la clase Auto.
final class Auto {
    String marca;
    public Auto (String marca){
        this.marca = marca;
    }
    public final void accelerar(){
        System.out.println("Acelerando automovil");
    }
}


//Muestra error porque la herencia no es permitida.
/* Descomentar para ver error.
class Moto extends Auto{
    String marca;
    public Moto (String marca){
        this.marca = marca;
    }
}
*/
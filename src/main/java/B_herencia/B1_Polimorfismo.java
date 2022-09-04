package B_herencia;

public class B1_Polimorfismo {

    public static void main(String[] args) {
        //Polimorfismo: un objeto de tipo super puede almacenar un objeto de una subclase.
        Vehiculos auto1 = new Automoviles("BMW","AAS89",2);

        //
        Vehiculos []misVehiculos  = new Vehiculos[2];

        misVehiculos[0] = new Motos("Susuki","OPJ01","Electrónico");
        misVehiculos[1] = new Automoviles("Chevrolet","xxx01",6);

        //Enlazado dinámico: en tiempo de ejecución el compilador sabe cual método sobrecargado ejecutar.
        //así las variables sean de tipo super, apuntan a objetos de tipo subclase y ejecuta esos métodos.
        for(Vehiculos v: misVehiculos){
            //No presenta problemas ya que la clase padre tiene este método.
            System.out.println(v.accelerar());
        }

        //Para utilizar metodo que no posee la clase super se debe realizar un casting o refundición.
        Motos moto1 = (Motos) misVehiculos[0];
        moto1.dameDatos();
        //Esta conversión no es posible sin casting ya que el array misVehiculos es de tipo vehículos y no Moto.
        //misVehiculos[0].dameDatos();

        //Tampoco se puede realizar casting sin sentido ej:
        //moto1 = (Automoviles) misVehiculos[1];


    }

}


//Clase super o clase padre.
class Vehiculos{
    String numeroPlaca;
    String marca;
    int numeroRuedas;
    public Vehiculos(String marca, String numeroPlaca, int numeroRuedas){
        this.numeroPlaca = numeroPlaca;
        this.numeroRuedas = numeroRuedas;
        this.marca = marca;
        System.out.println("Soy el constructor de la clase padre!!!");
    }

    public String accelerar (){
        return "Estoy accelerando un :";
    }

}

//Clase hija.
class Automoviles extends Vehiculos{
    int numeroPuertas;
    public Automoviles (String marca, String placa, int numeroPuertas){
        super(marca,placa,4); //LLama el constructor de la clase padre.
        this.numeroPuertas = numeroPuertas;
    }

    public String accelerar(){ // Sobre escribe el metodo de la clase padre, tiene prelación cuando es llamdo.
        return super.accelerar()+"Automovil"; // Llama al método padre y lo complementa.
    }
    public void dameDatos(){
        System.out.println("Soy un Automovil de placas:"+this.numeroPlaca+"de marca: "+this.marca+" con puertas:"
                +this.numeroPuertas);
    }

}

//Clase hija.
class Motos extends Vehiculos {
    String tipoArranque;
    public Motos (String marca, String placa, String tipoArranque){
        super(marca,placa,2);
        this.tipoArranque = tipoArranque;
    }
    public String accelerar(){
        return  super.accelerar()+"Moto";
    }
    public void dameDatos(){
        System.out.println("Soy una Moto de placas: "+this.numeroPlaca+ "de marca: "+this.marca+" con tipo de arranque:"
                +this.tipoArranque);
    }

}

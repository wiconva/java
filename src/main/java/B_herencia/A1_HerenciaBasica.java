package B_herencia;

public class A1_HerenciaBasica {
    public static void main(String[] args) {
        Automovil automovil1 = new Automovil("Renault","BYQ75",4);
        Automovil automovil2 = new Automovil("Mercedes","ijl86",6);
        Moto moto1 = new Moto("Yamaha","JPY89","PATADA");
        Moto moto2 = new Moto("Pulsar","BYF76","ELECTRICO");

        System.out.println();
        automovil1.dameDatos();
        automovil2.dameDatos();
        moto1.dameDatos();
        moto2.dameDatos();

        //LLama a los métodos sobre escritos que a su vez llaman al método de la clase padre.
        System.out.println();
        System.out.println(automovil1.accelerar());
        System.out.println(moto1.accelerar());
    }
}

//Clase super o clase padre.
class Vehiculo{
    String numeroPlaca;
    String marca;
    int numeroRuedas;
    public Vehiculo(String marca, String numeroPlaca, int numeroRuedas){
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
class Automovil extends Vehiculo{
    int numeroPuertas;
    public Automovil (String marca, String placa, int numeroPuertas){
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
class Moto extends Vehiculo {
    String tipoArranque;
    public Moto (String marca, String placa, String tipoArranque){
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

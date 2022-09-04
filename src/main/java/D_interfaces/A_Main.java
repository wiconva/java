package D_interfaces;

public class A_Main {
    public static void main(String[] args) {

        Automovil auto = new Automovil("JAC");
        Camion camion = new Camion("Foton");
        Moto moto = new Moto("Yamaha");
        System.out.println("");

        auto.pagar();
        camion.pagar();camion.pesar();
        moto.pagar();


    }
}

interface PagarPeaje {
    /**Las interfaces son contratos que se adquieren por la clase que los implementa. Pueden tener atributos pero estos
     son públicos, estáticos y finales. No es necesario indicarlo explícitamente pero, si no se hace se implícitamente
     queda de esta manera.
     Todos sus métodos no se implementan, son públicos y abstractos, al igual que con los atributos no es necesario
     indicarlo explicitamente pero por defecto son de esta forma.*/

    public static final double cuatroEjes = 1000; //Declaración completa.
    double masDeCuatroEjes = 1500;                //Declaración implícita.

    abstract public void  pagar(); // Método declarado completamente si se omite abstrac public será implícito.
}

interface Pesaje extends PagarPeaje {
    /* Las interfaces a su ves pueden heredar de otras interfaces lo que obliga a la clase que la implementa a sobreescribir
       tanto los métodos de la interface padre como los de la interface hija.
     */
    abstract public void pesar();
}

class Vehiculo {
    private String marca;
    Vehiculo (String marca){
        this.marca = marca;
    }

}

class Automovil extends Vehiculo implements PagarPeaje {
    // La clase hereda e implementa metodos.
    Automovil(String marca){
        super (marca);
    }

    @Override
    public void pagar() {
        System.out.println("Soy un vehículo y pago peaje :" + PagarPeaje.cuatroEjes);
    }
}

class Camion extends Vehiculo implements Pesaje {

    Camion (String marca)
    {
        super(marca);
    }


    @Override
    public void pagar() {
        System.out.print("Soy un Camion y pago peaje: "+PagarPeaje.masDeCuatroEjes);
    }

    @Override
    public void pesar() {
        System.out.println(" además peso : "+ Math.random()*1000);
    }
}

class Moto extends Vehiculo implements PagarPeaje {
    Moto (String marca){
        super(marca);
    }
    @Override
    public void pagar (){
        System.out.println("Soy una pinche moto y no pago peaje !!!");
    }
}

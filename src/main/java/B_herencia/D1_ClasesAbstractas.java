package B_herencia;

public class D1_ClasesAbstractas {

    public static void main(String[] args) {
        Alumno al = new Alumno("Juan");
        Empleado emp = new Empleado("Pedro");

        System.out.println("Soy: "+al.getNombre());
        al.dameDatos();
        System.out.println();

        System.out.println("Soy: "+emp.getNombre() );
        emp.dameDatos();
        System.out.println();
    }

}

//si una clase tiene un método abstracto esta obligada a ser abstracta, como un patron de diseño.
abstract class Persona {
    private String nombre;

    public Persona (String nombre){
        this.nombre = nombre;
    }
    public String getNombre (){
        return nombre;
    }
    //El método abstracto no implementa nada es un patrón a seguir ya que debe ser implementado y sobre escrito por
    //las clases que lo hereden.
    public abstract void dameDatos();
}

class Empleado extends Persona{
    public Empleado (String nom ){
        super(nom);
    }

    //Sobre escribe el método heredado por la clase super. Realiza una tarea diferente en cada clase.
    @Override
    public void dameDatos() {
        System.out.println("Soy un empleado, trabajo y gano dinero.");
    }

}

class Alumno extends Persona{

    public Alumno (String nom){
        super(nom);
    }

    //Sobre escribe el método heredado por la clase super. Realiza una tarea diferente en cada clase.
    @Override
    public void dameDatos() {
        System.out.println("Soy un Alumno y me escuentro estudiando, pero no gano dinero.");
    }
}

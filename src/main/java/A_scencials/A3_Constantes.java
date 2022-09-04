package A_scencials;

public class A3_Constantes {
    //Las constantes no puede cambiar de valor despues de la primera asignación

    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Willian");
        System.out.println("\n Soy el empleado : "+empleado1.getNombre()+" y no puede ser cambiado.");

    }
}

class Empleado{

    private final String nombre;
    public Empleado(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}

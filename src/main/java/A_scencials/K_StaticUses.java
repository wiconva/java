package A_scencials;

public class K_StaticUses {
    public static void main(String[] args) {
        /* El identifcador static hace que el campo o método pertenezca a la clase y no al objeto, lo
            que quiere decir que no se pueden instanciar.
         */
        Empleados empleado1 = new Empleados("Willian");
        Empleados empleado2 = new Empleados("Yeimi");

        System.out.println("Nombre Empleado: "+empleado1.getNombre()+" ID: "+empleado1.getId());
        System.out.println("Nombre Empleado: "+empleado2.getNombre()+" ID: "+empleado2.getId());
        System.out.println("El siguiente id será: "+Empleados.getNextID());



    }
}
class Empleados{
    public static int nextID =1;//Este campo no se pude llamar desde una instancia de la clase ya que pertenece a la clase y no al objeto.
    private String nombre;
    private int id;

    public Empleados(String nombre){
        this.nombre = nombre;
        this.id = nextID;
        nextID++;
    }
    public String getNombre(){
        return  this.nombre;
    }
    public int getId(){
        return this.id;
    }
    //Este método no se pude llamar desde una instancia de la clase ya que pertenece a la clase y no al objeto.
    public static int getNextID(){
        return nextID;
    }
}

package A_scencials;

public class L1_Sobrecarga {
    public static void main(String[] args) {
      Employ empleado1 = new Employ("Willian",500);
      Employ empleado2 = new Employ("Yeimi");

    }
}
class Employ {
    String nombre;
    int sueldo;
    //Si no se especifíca ningun constructor java crea un constructor por defecto new Employ();
    //Constructor completo.
    public Employ(String nombre,int sueldo){
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    //Constructor con un parámetro.
    public Employ (String nombre){
        this(nombre,100); // Llama al otro constructor para dar valor inicial al sueldo.
    }
    public void imprimirDatos(){
        System.out.println("Soy : "+this.nombre +" y mi sueldo:  "+this.sueldo);
    }
}

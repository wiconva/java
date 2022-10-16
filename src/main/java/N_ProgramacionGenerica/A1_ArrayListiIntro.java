package N_ProgramacionGenerica;

import java.util.ArrayList;

public class A1_ArrayListiIntro {
    public static void main(String[] args) {
                /*Los Arraylist pueden almacenar una lista de arreglo de objetos que incicialmente tiene una
         dimensión de 10 pero no esta límitado a ella. Si se excede crea una nueva copia con un tamaño
         dinámico mayor. Si se conoce el tamaño que va a tener por buenas practicas es mejor ajustarlo o
         al final cerrar su tamaño para gastar recursos innecesariamente.
         Solo para Objetos, no para tipos primitivos.
         */
        ArrayList <Empleado> empleados = new ArrayList<>();//Declaración del arrayList
        //Inicialización de la lista
        for(int i = 0 ; i< 10; i++){
            empleados.add(new Empleado("Empleado"+ Integer.toString(i)));
        }
        System.out.println("El tamaño incial de la lista : "+empleados.size());
        //Redimensionamiento dinámico de la lista luego de pasar el tamaño por defecto.
        for(int i = 0 ; i< 10; i++){
            empleados.add(new Empleado("Empleado"+ Integer.toString(i)));
        }
        System.out.println("Tamaño de lista redimensionado: "+empleados.size());
        empleados.ensureCapacity(30);//Tamaño ajustado en memoria.
        empleados.add(new Empleado("ultimo"));
        empleados.trimToSize();//Ajusta la memoria reservada al tamaño actual de la lista.
        System.out.println("Tamaño final ajustado manualmente: "+empleados.size());
    }
}

class Empleado {
    String nombre;
    Empleado(String nombre){
        this.nombre = nombre;
    }
}

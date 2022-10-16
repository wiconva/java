package O_ProgramacionConcurrente;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class C3_SincronizandoBloqueoSeccion {
    /*Es posible bloquear una sección de código para que solo un Hilo la pueda utilzar mediante la
      implememtación de la interface Lock y la clase ReentratLock
     */
    public static void main(String[] args) {
        Lock bloqueo = new ReentrantLock();
        Contador[] contadores = new Contador[100];
        for (int i = 0; i<contadores.length; i++){
            contadores[i] = new Contador(bloqueo);
        }
        for(Contador c : contadores){
            c.start();
        }
    }
}
class Contador extends Thread {
    private static int contador=0;
    private Lock bloqueo ;

    Contador(Lock l){
        this.bloqueo = l;
    }
    public void run(){
        //System.out.println(contador++);

        bloqueo.lock();//Bloquea el código para que otro Hilo no lo pueda ejecutar hasta que este sea desbloqueado.
        try {
            System.out.println(contador++);
        }finally {
            System.out.println("Desbloqueado");
            bloqueo.unlock();//Desbloquea el código para que pueda ser ejecutatod por otro Hilo.
        }
    }

}

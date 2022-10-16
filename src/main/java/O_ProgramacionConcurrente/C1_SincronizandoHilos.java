package O_ProgramacionConcurrente;

public class C1_SincronizandoHilos {
    public static void main(String[] args) { // Hilo main.
        /*Un Hilo puede tener 4 estados:
          new : Reciente mente creado.
          Ejecutable: Corriendo actualmente.
          Sleep: Hilo bloqueado hasta que se termine el tiempo ajustado.
          Muerto: Cuando el Hilo Termina la ejecución de lo programado en le método Run.
         */

        //Segunda forma de crear Hilos con la clase Thread.
        class Hilo extends Thread{

            public void run (){
                for (int i = 0; i< 5; i++){
                    System.out.println("Ejecutando Hilo: " + this.getName());
                }
            }
        }

        Hilo hilo1 = new Hilo();
        Hilo hilo2 = new Hilo();


        /*La ejecución sin sincronización depende del procesador es aleatorio.
        para sincronizar se utiliza el método Join de la clase Thread que no inicia el siguiente hasta que el Hilo
        Se encuentre en estado Muerto.*/

        hilo1.start();
        try {
            //Recordar que el Hilo main es el principal
            hilo1.join(); //El programa no pasa de esta línea hasta que no terminé la ejecución del Hilo.
            //Para liberar el Hilo Main se debe coloca la sentencia join en la clase Thread.
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        hilo2.start();
        System.out.println("Ejecutando el Hilo Main");
    }
}



package O_ProgramacionConcurrente;

public class C2_SincronizandoLiberandoMain {
    public static void main(String[] args) {

        //Hilo se que se ejecuta sin depender de otro.
        class HiloDesincronizado extends Thread{
            public void run (){
                for (int i = 0; i< 5; i++){
                    System.out.println("Ejecutando Hilo: " + this.getName());
                }
            }
        }
        //Hilo sincrinizado.
        class HiloSincronizado extends Thread {
            Thread hiloAnterior;
            HiloSincronizado(Thread h){
                this.hiloAnterior = h;
            }
            public void run(){
                try {
                    hiloAnterior.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                for (int i = 0; i< 5; i++){
                    System.out.println("Ejecutando Hilo: " + this.getName());
                }
            }
        }
        //---------------------------------------------------------------
        HiloDesincronizado hilo1 = new HiloDesincronizado();
        HiloSincronizado   hilo2 = new HiloSincronizado(hilo1);

        hilo1.start();
        hilo2.start();

        System.out.println("Hilo principal...");//Hilo principal liberado.
    }
}

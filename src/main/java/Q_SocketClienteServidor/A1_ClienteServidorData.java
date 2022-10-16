package Q_SocketClienteServidor;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class A1_ClienteServidorData {
    public static void main(String[] args) {

        try {
            /*Un Socket es una conexión abstracta entre dos equipos mediante una dirección IP y un puerto, que es la ventana por donde
              entra la información
             */
            Servidor s = new Servidor();//Clase que crea un hilo a la escucha.
            s.start();

            //Envía 10 mensaje por el socket.
            for (int i = 0; i< 10 ; i++){
                Socket cliente = new Socket("127.0.0.1",9999);//Creación del Socket en el cliente.
                DataOutputStream flujoSalida = new DataOutputStream(cliente.getOutputStream());//Creación del flujo de datos de salida de la maquina Java.
                flujoSalida.writeUTF("Mensaje prueba desde el cliente:  "+i);//Envío de String.
                flujoSalida.close();//Se cierra el flujo.
                cliente.close();//Se cierra el socket.
                Thread.sleep(500);//Espera para que sea visible la operación.
            }

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error en el cliente");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Servidor extends Thread {

    @Override
    public void run() {
        super.run();
        try {
            ServerSocket socketServidor = new ServerSocket(9999);//Socket de tipo servidor.
            System.out.println("\nPeticiones recibidas por el servidor");
                while(true){

                    Socket socket = socketServidor.accept();//Se coloca a la escucha el socket y queda detenido hasta que reciba una petición.
                    InetAddress inetSocketAddress = socket.getInetAddress();//Obtiene un objeto InetAddres que contiene datos de la conexión.
                    String ipDir = inetSocketAddress.getHostAddress();//Obtiene la dirección de la conexión.
                    DataInputStream flujoEntrada = new DataInputStream(socket.getInputStream());//Creación de flujo de datos de entrada a la Java VM.

                    int in;
                    do{
                        in = flujoEntrada.read();//Lectura de la información como String de datos.
//                        System.out.println((char)in +"    IP: "+ipDir);
                        System.out.print((char)in);
                    }while(in !=-1);
                    System.out.println("    IP: "+ipDir);
                    //System.out.println(in +"    IP: "+ipDir);
                    socket.close();
                }

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error en el servidor");
        }
    }
}

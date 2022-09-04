package F_InterfacesVisuales;

import javax.swing.*;

public class A1_Marco {
    /* La interfaz se crea en un marco invisible, de tamaño 0,0 se debe especificar la acción al cerrar
       la aplicación de lo contrario continuará en ejecución.
     */

    public static void main(String[] args) throws InterruptedException {
        Marco marco1 = new Marco();
    }


}

class Marco extends JFrame{
    Marco() throws InterruptedException {
        setTitle("Marco de prueba 1");
        setDefaultCloseOperation(EXIT_ON_CLOSE); // Cierre la aplicación cuando cierre la ventana, tambien se puede ocultar.
        setSize(600,400);
        //this.pack();Ajusta el elemnto al contenido en tamaño.
        setVisible(true);
        setLocation(100,100); // Por defecto se ubica en el punto 0,0
        Thread.sleep(2000);
        setBounds(50,50,200,200);
        Thread.sleep(2000);
        setExtendedState(JFrame.MAXIMIZED_BOTH);// Ajusta al máximo de la pantalla tanto en alto como ancho.
        setResizable(false); // Ya no se puede cambiar las dimensiones manualmente.
        Thread.sleep(2000);

    }

}

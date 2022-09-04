package F_InterfacesVisuales;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class C1_Imagenes {
    public static void main(String[] args) {
        Marco4 marco = new Marco4();
    }
}

class Marco4 extends JFrame {

    public Marco4 (){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setSize(400,450);
        setTitle("Marco con imagen");
        setResizable(false);

        //Clase interna.
        class Laminas extends JPanel{
            private Image imagen;
            public void paintComponent(Graphics g){
                super.paintComponent(g);
                //La lectura de la imagen lanza una excepción si no encuentra el archivo.
                try {
                    imagen = ImageIO.read(new File("src/main/resources/Img/meliodas.png"));

                } catch (IOException e) {
                    e.printStackTrace();
                    System.out.println("La imagen no pudo ser leída...");
                }
                g.drawImage(imagen,40,20, null);
                g.setFont(new Font("courier",Font.ITALIC,20));
                g.drawString("MAMÁ Y PAPÁ",140,20);

            }

        }
        // La instancia sólo se puede utilizar despues de la declaración de la clase interna.
        Laminas lamina = new Laminas();
        add(lamina);
    }

}



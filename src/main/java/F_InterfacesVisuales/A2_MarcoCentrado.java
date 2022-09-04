package F_InterfacesVisuales;

import javax.swing.*;
import java.awt.*;

public class A2_MarcoCentrado {

    public static void main(String[] args) {
        Marco2 marco = new Marco2();


    }
}
class Marco2 extends JFrame {

    Marco2 (){
        int alturaPantalla = Toolkit.getDefaultToolkit().getScreenSize().height;
        int anchoPantalla = Toolkit.getDefaultToolkit().getScreenSize().width;
        setSize(anchoPantalla/2, alturaPantalla/2);
        setLocation(anchoPantalla/4,alturaPantalla/4);
        setTitle("Marco centrado con medidas de la mitad de la pantalla");
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setIconImage(Toolkit.getDefaultToolkit().getImage("src/main/resources/Img/icono.png"));
    }

}


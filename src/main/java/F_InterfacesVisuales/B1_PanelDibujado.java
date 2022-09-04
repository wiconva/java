package F_InterfacesVisuales;

import javax.swing.*;
import java.awt.*;

public class B1_PanelDibujado {
    public static void main(String[] args) {
        Marco3 marco = new Marco3();
    }
}

class Marco3 extends JFrame {
    Marco3 (){
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,400);
        setTitle("Dibujando sobre lamina");
        Lamina lamina1 = new Lamina();
        add(lamina1);
    }

}

class Lamina extends JPanel {
    //Método sobre-escrito que se encarga de dibujar sobre la lámina utilizando el objeto Graphics.
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);// Realiza lo programado en la clase original ya que es importante que este método se ejecute.
        g.setColor(Color.BLACK);//Ajsuta el color del elemento graphics para dibujar.
        g.drawString("Texto dibujado en la lámina",0,20);
        g.fillRect(10,25,100,100);//Dibuja un rectángulo relleno.
        g.setColor(Color.red);
        g.fillOval(10,25,100,100);
        g.setColor(Color.magenta);
        g.drawLine(60,25,60,125);
        g.setFont(new Font("courier",Font.ITALIC,25));//Set al tipo de fuente utilizada para dibujar el texto.
        g.drawString("Texto con fuente diferente",20,150);
    }
}
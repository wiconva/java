package O_ProgramacionConcurrente;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class A1_MonoHilo {
    public static void main(String[] args) {
        /*Este en un ejemplo del problema que puede ocacionar la ejecución en un solo Hilo, ya que si
         entra a un bucle hasta no salir de él no continuará con la ejecución, para probar dar click mas
         de una vez en el boton que crea más botones en la pantalla. hasta no terminar no continuará con el
         siguiente.
         */
        JFrame marco = new JFrame("Mono Hilo");
        JButton iniciar = new JButton("Iniciar");
        Lamina lamina = new Lamina();

        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setSize(400,400);
        marco.setLayout(new BorderLayout());
        marco.add(iniciar,BorderLayout.SOUTH);

        class Oyente implements ActionListener{
            Lamina lamina;
            Oyente (Lamina lamina){
                this.lamina = lamina;
            }
            @Override
            public void actionPerformed(ActionEvent e) {
                lamina.add(new JButton("Boton"));
                marco.setVisible(true);
                for(int i = 0 ; i<10; i++){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        }
        iniciar.addActionListener(new Oyente(lamina));
        marco.add(lamina,BorderLayout.CENTER);
        marco.setVisible(true);
    }
}

class Lamina extends JPanel{
    Lamina (){
       this.setLayout(new FlowLayout());
    }

}


package G_Eventos;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;
import java.awt.*;

public class H1_EntradasTexto {
    /*Gestiona los eventos en las entradas de texto mediante la optención del objeto de tipo documento al cual
      se le puede agregar en oyente de tipo DocumentListener.
     */
    public static void main(String[] args) {
        JFrame marco = new JFrame();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setSize(400,200);
        marco.setLayout(new FlowLayout());

        JTextField entradaTexto = new JTextField("",20);
        Document documento = entradaTexto.getDocument();//Obtiene el objeto de tipo Document.


        marco.add(entradaTexto);
        marco.setVisible(true);


        // Oyente de tipo DocumentListener que implementa sus tres métodos.
        class OyenteDocumento implements DocumentListener {

            @Override
            public void insertUpdate(DocumentEvent e) {
                System.out.println("Insertaste algo...");

            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                System.out.println("Borraste...");
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                System.out.println("Algún cambio algo...");
            }

        }
        documento.addDocumentListener(new OyenteDocumento());
    }
}

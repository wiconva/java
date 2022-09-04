package F_InterfacesVisuales;

import javax.swing.*;

public class K1_Menus {
    public static void main(String[] args) {
        JFrame marco = new JFrame();
        marco.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        marco.setSize(400,300);

        JPanel lamina =new JPanel();

        //Crea la barra de Menus.
        JMenuBar barraMenu = new JMenuBar();

        //Crea los menús.
        JMenu menu1 = new JMenu("Menú1");
        JMenu menu2 = new JMenu("Menú2");
        JMenu menu3 = new JMenu("Menú3");
        JMenu menu4 = new JMenu("Menú4");
        JMenu menu5 = new JMenu("MenúCompuesto");//Menú dentro de otro menú.

        //Crea los submenus.
        JMenuItem subMenu11 = new JMenuItem("SubMenú11");
        JMenuItem subMenu12 = new JMenuItem("SubMenú12");
        JMenuItem subMenu13 = new JMenuItem("SubMenú13");
        JMenuItem subMenuCompuesto1 = new JMenuItem("SubMenúCompuesto1");
        JMenuItem subMenuCompuesto2 = new JMenuItem("SubMenúCompuesto2");
        JCheckBoxMenuItem check1 = new JCheckBoxMenuItem("Check 1"); //Menú con checkbox.
        JCheckBoxMenuItem check2 = new JCheckBoxMenuItem("Check 2");//Menú con checkbox.
        JRadioButtonMenuItem radio1 = new JRadioButtonMenuItem("Radio 1");//Menú con radio button.
        JRadioButtonMenuItem radio2 = new JRadioButtonMenuItem("Radio 2");//Menú con raido button.

        //Menú dentro de otro menú.
        menu5.add(subMenuCompuesto1);
        menu5.add(subMenuCompuesto2);

        //Agrega los submenús a los menús.
        menu1.add(subMenu11);
        menu1.addSeparator();//Agrega un separador visual para formar grupos.
        menu1.add(subMenu12);
        menu1.add(subMenu13);
        menu1.addSeparator();//Agrega un separador visual para formar grupos.
        menu1.add(menu5);

        menu2.add(check1);
        menu2.add(check2);

        menu3.add(radio1);
        menu3.add(radio2);


        //Adiciona los menús a la barra.
        barraMenu.add(menu1);
        barraMenu.add(menu2);
        barraMenu.add(menu3);
        barraMenu.add(menu4);

        //Adiciona la barra a la lámina.
        lamina.add(barraMenu);
        marco.add(lamina);
        marco.setVisible(true);

    }
}

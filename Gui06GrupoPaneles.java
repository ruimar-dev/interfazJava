import java.awt.*;
import javax.swing.*;
import javax.swing.border.TitledBorder;
public class Gui06GrupoPaneles {
    private JFrame ventana;
    private JPanel pnlVerde;
    private JPanel pnlRojo;
    private JPanel pnlAzul;
    public Gui06GrupoPaneles(){
        //Creamos la ventana
        ventana = new JFrame("Ventana arreglada");
        Container contenedor = ventana.getContentPane();
        crearGui();
        ventana.setVisible(true);
        ventana.setSize(600, 300);
        ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    private void crearGui(){
        pnlVerde = new JPanel();
        pnlVerde.setBackground(Color.GREEN);
        pnlVerde.setBorder(new TitledBorder("Panel Verde"));

        pnlRojo = new JPanel();
        pnlRojo.setBackground(Color.RED);
        pnlRojo.setBorder(new TitledBorder("Panel Rojo"));

        pnlAzul = new JPanel();
        pnlAzul.setBackground(Color.BLUE);
        pnlAzul.setBorder(new TitledBorder("Panel Azul"));

        ventana.add(pnlVerde, BorderLayout.NORTH);
        ventana.add(pnlRojo, BorderLayout.CENTER);
        ventana.add(pnlAzul, BorderLayout.SOUTH);
    }
}


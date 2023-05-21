import java.awt.*;
import javax.swing.*;
import javax.swing.border.TitledBorder;
//import java.awt.event.*;
public class Gui06GrupoPaneles {
    //Atributos de la clase
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
    // Metodo para crear la interfaz grafica
    private void crearGui(){
        // Creamos los paneles
        pnlVerde = new JPanel();
        pnlVerde.setBackground(Color.GREEN);
        pnlVerde.setBorder(new TitledBorder("Panel Verde"));

        // Creamos los paneles
        pnlRojo = new JPanel();
        pnlRojo.setBackground(Color.RED);
        pnlRojo.setBorder(new TitledBorder("Panel Rojo"));

        // Creamos los paneles
        pnlAzul = new JPanel();
        pnlAzul.setBackground(Color.BLUE);
        pnlAzul.setBorder(new TitledBorder("Panel Azul"));

        // Añadimos los paneles a la ventana
        ventana.add(pnlVerde, BorderLayout.NORTH);
        ventana.add(pnlRojo, BorderLayout.CENTER);
        ventana.add(pnlAzul, BorderLayout.SOUTH);
    }
}


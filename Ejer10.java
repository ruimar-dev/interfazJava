import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejer10 {
    private JFrame ventana;
    public Ejer10(){
        construirVentana();
    }
    private void construirVentana(){
        ventana = new JFrame("Este es el ejercicio pareciado al 8.10");
        Container contenerdor= ventana.getContentPane();
        construirMenu();
        ventana.pack();
        ventana.setSize(700,600);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    private  void construirMenu(){
        // Creamos la barra de menú y la añadimos a la ventana
        JMenuBar barraMenu = new JMenuBar();
        ventana.setJMenuBar(barraMenu);
        // Creamos los menús y los añadimos a la barra de menú
        JMenu menuEjercicio = new JMenu("Ejercicio");
        barraMenu.add(menuEjercicio);
        JMenu menuOpcion = new JMenu("Opcion");
        barraMenu.add(menuOpcion);
        JMenuItem item1 = new JMenuItem("Salir");
        // Le añadimos un listener para que al pulsar se cierre la ventana
        item1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }});
        menuOpcion.add(item1);
        JMenuItem Ejercicio1 = new JMenuItem("Ejercicio1");
        // Le añadimos un listener para que al pulsar se ejecute el ejercicio adicional 1
        Ejercicio1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
              Ejercicio1 ejercicio1 =  new Ejercicio1();
            }});
        // Añadimos el item al menú
        menuEjercicio.add(Ejercicio1);
        JMenuItem Ejercicio3 = new JMenuItem("Ejercicio3");
        // Le añadimos un listener para que al pulsar se ejecute el ejercicio adicional 3
        Ejercicio3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               Ejercicio3 ejercicio3 = new Ejercicio3();
            }});
        menuEjercicio.add(Ejercicio3);
        JMenuItem Ejercicio4 = new JMenuItem("Ejercicio4");
        // Le añadimos un listener para que al pulsar se ejecute el ejercicio adicional 4
        Ejercicio4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
             Gui06GrupoPaneles gui = new Gui06GrupoPaneles();
            }});
        menuEjercicio.add(Ejercicio4);

    }
    // Ejecutamos el programa para saber si esta bien el ejercicio
    public static void main(String[] args) {
       Ejer10 prueba = new Ejer10();
    }
}

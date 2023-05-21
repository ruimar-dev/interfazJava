import java.awt.*;
import javax.swing.*;

public class Ejercicio1 {
    //Atribuyos de la clase
    private JFrame ventana;
    public Ejercicio1() {
        construirVentana1();
        construirVentana2();
        construirVentana3();
    }

    // Metodo para construir la ventana
    public void construirVentana1(){
        ventana = new JFrame ("Primer ejercicio GUI en Java");
        Container panelcontenedor = ventana.getContentPane();
        //panelcontenedor.setLayout(new BorderLayout());
        JButton aceptar = new JButton ("Aceptar");
        panelcontenedor.add(aceptar);
        ventana.setSize(400,400);
        ventana.setVisible(true);

    }

    // Metodo para construir la ventana
    public void construirVentana2(){
        ventana = new JFrame ("Primer ejercicio GUI en Java");
        Container panelcontenedor = ventana.getContentPane();
        panelcontenedor.setLayout(new FlowLayout());
        JLabel lblSaludo = new JLabel("Hola");
        JButton btnAceptar = new JButton ("Aceptar");
        JButton btnSalir = new JButton ("Salir");
        //ponemos el color de fondo del botón Aceptar en verde
        btnAceptar.setBackground(Color.GREEN);
        //tipo de letra "Comic Sans", estilo cursiva y negrita (Italic Bold)
        Font font1 = new Font("Comic Sans", Font.BOLD, 24);
        btnAceptar.setFont(font1);
        //ponemos el color de fondo del botón salir amarillo
        btnSalir.setBackground(Color.yellow);
        //los añadimos al panel
        panelcontenedor.add(lblSaludo);
        panelcontenedor.add(btnAceptar);
        panelcontenedor.add(btnSalir);
        //ponemos el color de fondo del panel de contenido en rojo
        panelcontenedor.setBackground(Color.red);
        ventana.setVisible(true);
        ventana.setSize(400,400);
    }

    // Metodo para construir la ventana
    public void construirVentana3(){
        ventana = new JFrame ("Primer ejercicio GUI en Java");
        Container panelcontenedor = ventana.getContentPane();
        //Inicializamos los componentes
        JLabel lblSaludo = new JLabel("hola", SwingConstants.CENTER);
        JButton btnAceptar = new JButton ("Aceptar");
        JButton btnSalir = new JButton ("Salir");
        JTextArea areatexto = new JTextArea (10,20);
        JTextField txtDato = new JTextField();
        //ponemos el color de fondo del botón Aceptar en verde
        btnAceptar.setBackground(Color.GREEN);
        //tipo de letra "Comic Sans", estilo cursiva y negrita (Italic Bold)
        Font font1 = new Font("Comic Sans", Font.BOLD, 24);
        btnAceptar.setFont(font1);
        //ponemos el color de fondo del botón salir amarillo
        btnSalir.setBackground(Color.yellow);
        //los añadimos al panel
        panelcontenedor.add(lblSaludo,BorderLayout.NORTH);
        panelcontenedor.add(btnAceptar, BorderLayout.WEST);
        panelcontenedor.add(btnSalir,BorderLayout.EAST);
        panelcontenedor.add(areatexto,BorderLayout.CENTER);
        panelcontenedor.add(txtDato,BorderLayout.SOUTH);
        //ponemos el color de fondo del panel de contenido en rojo
        panelcontenedor.setBackground(Color.red);
        //ventana.setSize(400,400);
        ventana.setVisible(true);;
        ventana.setSize(400,400);
    }
}


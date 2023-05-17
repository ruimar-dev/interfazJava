import java.awt.*;
import javax.swing.*;
 public class Ejercicio3 {
     int tableroWidth, tableroHeight;
     int buttonIndex = 0;

     // Constructor
     public Ejercicio3() {
         tableroHeight = 8;
         tableroWidth = 8;
         // Frame
         JFrame ventana = new JFrame("Tablero de Ajedrez");
         ventana.setTitle("Tablero de Ajedrez");
         ventana.setSize(400, 400);
         // Container
         Container contenedor = ventana.getContentPane();
         contenedor.setLayout(new GridLayout(tableroWidth, tableroHeight));
         // Creamos la matriz de botones
         JButton[][] botones = new JButton[8][8];
         // Recorremos el bucle anidado para pasar por todos los botones
         for (int i = 0; i < tableroWidth; i++) {
             for (int j = 0; j < tableroHeight; j++) {
                 //Inicializamos el botón
                 botones[i][j] = new JButton();
                 //Dependiendo del índice del botón, le damos un color u otro
                 if (buttonIndex % 2 == 0) {
                     botones[i][j].setBackground(Color.WHITE);
                 } else {
                     botones[i][j].setBackground(Color.BLACK);
                 }
                 //Añadimos el botón al contenedor
                 contenedor.add(botones[i][j]);
                 buttonIndex++;
             }
             //Aumentamos el índice al cambiar de fila para que se alternen los colores
             buttonIndex++;
         }
         //Centramos la ventana y hacemos las últimas configuraciones
         ventana.setLocationRelativeTo(null);
         ventana.setResizable(false);
         ventana.setVisible(true);
     }
 }



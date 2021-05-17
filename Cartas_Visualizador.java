

import javax.swing.JOptionPane;
public class Cartas_Visualizador {
   private int n; // cantidad de cartas del juego dado por (con n=2*k+3*t)
   private int k; // cantidad par de cartas
   private int t;// cantidad impar de cartas
   
   
   public int lea(String msg){
        return Integer.parseInt(JOptionPane.showInputDialog(msg));
    }
   public void muestre(String msj){
        JOptionPane.showMessageDialog(null,msj);
    }
}


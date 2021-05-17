
import javax.swing.JOptionPane;
import java.util.Scanner;
/**
 *
 * @author Estudiante
 */
public class Cartas_Controlador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner ( System.in);
        Cartas_Visualizador vis = new Cartas_Visualizador(); // llamo clase visualizadora

        int k = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca cantidad par de cartas"));
        int t = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca cantidad impar de cartas"));
        int j = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca cantidad  de jugadores"));
       
        Cartas_Modelo op = new Cartas_Modelo( k, t, j);
        for (int i = 0; i < j; i++) {
            String nombreJ = JOptionPane.showInputDialog(null, "Introduzca el  "+ i+ "º  jugador");
            op.setNameJ(nombreJ, i);

        }
        op.getMazo();

        op.randomizarTurno();

        for (int i = 0; i < j; i++) {
           
            JOptionPane.showMessageDialog(null,op.getJugadores(i) );
 
         } 
        op.printTablero();
          op.setTablero();
          op.randomizarMazo();
          op.printTablero();

         //MENÚ DEL JUEGO
          
        //  while(true){
        //     System.out.println("Press n for a new game, q to quit"); //imprime lo que está en parentesis
        //     String nq = in.nextLine();  //recibe info del teclado

        //     if(nq.equals("q")){ // si nq = q imprime Exiting y sale del juego

        //         System.out.println("Exiting...");
        //         break;
        //     }else if(nq.equals("n")){ // si nq = q revuelve las cartas

                

                

        //         op.printTablero();
                
        //         break;
        //     }
        //     else{

        //         System.out.println("WRONG CHARACTER");
        //         continue;
        //     }
        // }

    }

}

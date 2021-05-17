
import java.security.SecureRandom;

public class Cartas_Modelo {
    private Carta[] mazo;
    private Carta[] mazoSimple;
    private int[] mazoPremios = { 2, 2, 2, 2, 2, 4, 4, 4, 4, 4 };
    private Jugador[] jugadores;
    private int j;
    private static final SecureRandom numsAleatorios = new SecureRandom();
    private Carta[][] tablero = new Carta[4][4];

    public Cartas_Modelo(int k, int t, int j) {

        String[] letra = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "Ñ", "O", "P", "Q" };

        jugadores = new Jugador[j];

        int n = k * 2 + t * 3; // numero de cartas y tablero
        mazo = new Carta[n];

        mazoSimple = new Carta[k + t];

        // Crea las cartas para luego duplicarlas
        numsAleatorios.nextInt(10);
        for (int c = 0; c < mazoSimple.length; c++) {

            mazoSimple[c] = new Carta(1 + numsAleatorios.nextInt(numsAleatorios.nextInt(10)),
                    letra[numsAleatorios.nextInt(letra.length)]);

        }
        // Duplica o triplicas las cartas
        for (int c = 0; c < mazo.length; c++) {
            if (c < n) {
                mazo[c] = mazoSimple[c % mazoSimple.length];
            }
        }

    }

    public void getMazo() {

        for (int c = 0; c < mazoSimple.length; c++) {
            System.out.print((c + 1) + ": " + "[ " + mazoSimple[c] + " ]" + " ");
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        for (int c = 0; c < mazo.length; c++) {
            System.out.print((c + 1) + ": " + "[ " + mazo[c] + " ]" + " ");
            System.out.println();
        }
        System.out.println();

    }

    public void randomizarMazo() {

        for (int primera = 0; primera < mazo.length; primera++) {

            int segunda = numsAleatorios.nextInt(mazo.length);
            Carta temp = mazo[primera];
            mazo[primera] = mazo[segunda];
            mazo[segunda] = temp;

        }

    }

    public void setNameJ(String nombre, int c) {

        jugadores[c] = new Jugador(nombre);

    }

    public void randomizarTurno() {

        for (int jugador = 0; jugador < jugadores.length; jugador++) {
            int jugadorN = numsAleatorios.nextInt(jugadores.length);
            Jugador temp = jugadores[jugador];
            jugadores[jugador] = jugadores[jugadorN];
            jugadores[jugadorN] = temp;

        }
    }

    public String getJugadores(int c) {
        return jugadores[c].getNombre();
    }

    public void printTablero() {

        for (int i = 0; i < 4; i++) {
            System.out.print("|");
            for (int j = 0; j < 4; j++) {
                System.out.print(tablero[i][j]);
                System.out.print("|");

            }
            System.out.println();
        }

    }

    public void setTablero() {

        // if (mostarCartas()) {
        // for (int i = 0; i < tablero.length; i++) {

        // for (int j = 0; j < tablero[i].length; j++) {

        // tablero[i][j] = new Carta(0, " - ");

        // }
        // }
        // } else {

        int p = 0;
        for (int i = 0; i < tablero.length; i++) {

            for (int j = 0; j < tablero.length; j++) {

                if (p < mazo.length) {
                    tablero[i][j] = mazo[p];
                    p++;

                }

            }

        }
        // }

    }

    // public boolean mostarCartas(boolean mostrar) {
    // boolean mostrar = false;

    // return mostrar;
    // }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Isaac
 */
public class Carta {

    private int valor;
    private String letra;

    public Carta(int valor, String letra) {
        this.valor = valor;
        this.letra = letra;
    }

    public String toString() {

        return valor + " d " + letra;

    }

    public void setValor(int aumentarV) {
        this.valor *= aumentarV;
    }

    public void setLetra(String letra) {
        this.letra = letra;

    }
}

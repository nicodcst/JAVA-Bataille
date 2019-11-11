/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bataille;

import java.util.ArrayList;
/**
 *
 * @author licence
 */
public class Carte {

private static String numeros[] = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Valet", "Dame", "Roi", "As" };
private static String couleurs[] = {"trèfle", "coeur", "carreau", "pique"};
private static int valeurs[] = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
private String numero;
private String couleur;
private int valeur;
private Joueur Joueur;
private int index;

public Carte(int v, int c) {
 //   valeur = valeurs[(int) (Math.random() * 12)];
 //   couleur = couleurs[(int) (Math.random() * 12)];
 valeur = valeurs[v];
 couleur = couleurs[c];
 index = v;
}

    public String getNumero() {
        return numero;
    }

    public String getCouleur() {
        return couleur;
    }

    public int getValeur() {
        return valeur;
    }

    public int getIndex() {
        return index;
    }
    
    public String infoCarte(){
        return this.getValeur() + " " + this.getCouleur();
    }

}


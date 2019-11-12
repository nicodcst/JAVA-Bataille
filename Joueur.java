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
public class Joueur {
    int compteurPoints;

    public void setCompteurPoints(int compteurPoints) {
        this.compteurPoints = compteurPoints;
    }

    public int getCompteurPoints() {
        return compteurPoints;
    }
    String nom;
    ArrayList<Carte> tabCarte;
    
    public Joueur(String n, ArrayList<Carte> paquet) {
        this.tabCarte = new ArrayList<Carte>();
        nom = n;
        compteurPoints = paquet.size();
        tabCarte = paquet;
    }
    
    public Carte tirerCarte() {
        // String V = tabCarte.get(0).getNumero();
        Carte V = tabCarte.get(1);//.getValeur();
        tabCarte.remove(0);
        compteurPoints--;
        return V;
    }
    
    public void ajouterCarte(Carte Gagnante, Carte Gagnante2) {
        tabCarte.add(Gagnante);
        tabCarte.add(Gagnante2);
        compteurPoints= +2;
    }
}

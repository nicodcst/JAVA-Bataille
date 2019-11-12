/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bataille;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author licence
 */
public class Bataille {

    private static Carte Carte1;
    private static Carte Carte2;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Carte> paquet = new ArrayList<Carte>();
        ArrayList<Carte> paquet1 = new ArrayList<Carte>();
        ArrayList<Carte> paquet2 = new ArrayList<Carte>();
        
        // Paquet total
        for (int v=0; v<13; v++) {
            for (int c=0; c<4; c++) {
                paquet.add(new Carte(v,c));
            }
        }
        
        Collections.shuffle(paquet);
        
        // Paquet 1
        for (int i=0; i<26; i++) {
            paquet1.add(paquet.get(i));
        }
        // Paquet 2
        for (int j=26; j<52; j++) {
            paquet2.add(paquet.get(j));
        }
        
        Joueur j1 = new Joueur("Jean", paquet1);
        Joueur j2 = new Joueur("Pierre", paquet2);
        
        System.out.println(String.format("%-15s %-15s %-15s\n", j1.nom , j2.nom , "gagnant"));
        
        while(j1.tabCarte.size() >0 || j2.tabCarte.size() >0) {
            if(j1.tabCarte.size()==52) {
                System.out.println(j1.nom + " a gagné");
                System.out.println(j1.compteurPoints + " " + j1.tabCarte.size());
            }
            if(j2.tabCarte.size()==52) {
                System.out.println(j2.nom + " a gagné");
                System.out.println(j2.compteurPoints + " " + j1.tabCarte.size());
            }
            
            Carte1 = j1.tirerCarte();
            Carte2 = j2.tirerCarte();
            
            if(Carte1.getIndex() > Carte2.getIndex()) {
                j1.ajouterCarte(Carte1, Carte2);
                System.out.println(String.format("%-15s %-15s %-15s\n", Carte1.infoCarte(), Carte2.infoCarte(), j1.nom));
            } else if(Carte1.getIndex() < Carte2.getIndex()) {
                j2.ajouterCarte(Carte1, Carte2);
                System.out.println(String.format("%-15s %-15s %-15s\n", Carte1.infoCarte(), Carte2.infoCarte(), j2.nom));
            } else if(Carte1.getIndex() == Carte2.getIndex()) {
                System.out.println(String.format("%-15s %-15s %-15s\n", Carte1.infoCarte(), Carte2.infoCarte(), " égalité, bataille"));
            }
        }

        System.out.println(j1.nom + j1.compteurPoints + j1.tabCarte.size());
        System.out.println(j2.nom + j2.compteurPoints + j2.tabCarte.size());
    }
    
}

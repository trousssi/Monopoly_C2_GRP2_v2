/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jeu;

/**
 *
 * @author Jérémy
 */
public class CarreauCarte extends AutreCarreau{
    
    public CarreauCarte(int numero, String nomCarreau) {
        super(numero, nomCarreau);
    }
    
    @Override
    public Resultat action (Joueur j, int sommeDes, Carte[] c) {
        Resultat res = null;
        Carte carte = tirerCarte(c);
        if ("LI".equals(carte.getType())) { //Carte libéré de prison
            j.addCartePrison(carte);
            carte.setPossede(true);
        } else if ("AR".equals(carte.getType())) { //Carte Debit/Credit d'argent
            if (carte.getPrix() > 0) {
                j.crediter(carte.getPrix());
            } else if (carte.getPrix() < -1){
                j.payer(Math.abs(carte.getPrix()));
            } else if (carte.getPrix() == -1) {
                //RES
            } else {
                System.out.println("ERREUR CARTE AR");
            }
        } else if ("DE".equals(carte.getType())) { //Carte déplacement de joueur
            if (carte.getDeplacement() > 0) {
                
            } else if (carte.getDeplacement() < 0) {
                //RES
            }
        } else if ("RE".equals(carte.getType())) { //Carte Reparation
            if (carte.getPrix() == 1) {
                // RES
            } else if (carte.getPrix() == 2) {
                //RES
            }
        } else if ("PR".equals(carte.getType())) { //Carte allez en prison
            //RES
        }
        return res;
    }
    
    private Carte tirerCarte (Carte[] cartes) {
        Carte ca = null;
        if (this.getNumero() == 8 || this.getNumero() == 23 || this.getNumero() == 37) {
            ca = cartes[0];
        } else if (this.getNumero() == 3 || this.getNumero() == 18 || this.getNumero() == 34) {
            ca = cartes[1];
        } else System.out.println("ERREUR CARTE");
        return ca;
    }
}

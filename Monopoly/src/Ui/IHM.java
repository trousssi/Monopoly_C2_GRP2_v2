package Ui;

import Jeu.Joueur;
import Jeu.Carreau;

public class IHM {
	public Controleur controleur;

	public void messageJoueurAvance(Joueur aJoueur, int aSommeDes, Carreau aCarreau) {
            System.out.println("[Joueur = "+aJoueur.getNom()+"] \nLa somme de dés vaut : " + aSommeDes);
            System.out.println("Carreau courant : " + aCarreau.getNomCarreau());
	}
        
}
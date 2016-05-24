package Ui;

import Jeu.Joueur;
import Jeu.Carreau;

public class IHM {
	public Controleur controleur;

	public void messageJoueurAvance(Joueur joueur, int sommeDes, Carreau carreau) {
            System.out.println("[Joueur = "+joueur.getNom()+"] \nLa somme de dés vaut : " + sommeDes);
            System.out.println("Carreau courant : " + carreau.getNomCarreau());
	}
        
}
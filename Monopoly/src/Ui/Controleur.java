package Ui;

import Jeu.Monopoly;
import Jeu.Joueur;
import Jeu.Carreau;
import java.util.Random;

public class Controleur {
	public IHM ihm;
	public Monopoly monopoly;
        
        public static final Random RANDOM = new Random();
        
	public void jouerUnCoup(Joueur aJ) {
		throw new UnsupportedOperationException();
	}
        
        public static int sommeDes() {
            return RANDOM.nextInt(6)+1;
        }
        
	private Carreau lancerDésAvancer(Joueur aJ) {
            int sommeDes = this.sommeDes();
            Carreau carreau = monopoly.AvancerJoueur(aJ, sommeDes);
            ihm.messageJoueurAvance(aJ, sommeDes, carreau);       
            
            return carreau;
	}
}
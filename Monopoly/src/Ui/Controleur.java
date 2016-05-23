package Ui;

import Jeu.Monopoly;
import Jeu.Joueur;
import Jeu.Carreau;
import java.util.Random;
import java.util.Scanner;

public class Controleur {
	public IHM ihm;
	public Monopoly monopoly;
        
        public static final Random RANDOM = new Random();
        
	public void jouerUnCoup(Joueur aJ) {
		Carreau c;
                c = lancerDésAvancer(aJ);
                
	}
        
        public void initPartie () {
            System.out.println("Combien de joueurs participent ?");
            Scanner sc = new Scanner(System.in);
            int i = Integer.parseInt(sc.nextLine());
            if (i > 0 && i < 7) {
                for (int n = 1; n <= i; n ++) {
                    System.out.println("Entrer le joueur " + n);
                    String nom = sc.nextLine();
                    Joueur joueur = new Joueur(nom, monopoly.getCarreau(1));
                    monopoly.addJoueur(joueur);
                }
            }
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
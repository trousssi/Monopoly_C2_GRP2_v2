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
        
	public void jouerUnCoup(Joueur joueur) {
		Carreau car;
                car = lancerDésAvancer(joueur);
                car.action(joueur);
	}
        
        public void initPartie () {
            System.out.println("Combien de joueurs participent ?");
            Scanner sc = new Scanner(System.in);
            int i = Integer.parseInt(sc.nextLine());
            if (i > 0 && i < 7) {
                for (int n = 1; n <= i; n ++) {
                    System.out.println("Entrer le nom du joueur n°" + n + " : ");
                    String nom = sc.nextLine();
                    Joueur joueur = new Joueur(nom, monopoly.getCarreau(1));
                    monopoly.addJoueur(joueur);
                }
            }
            this.lancePartie();
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
        
        private void lancePartie() {
            
            
            do {
                int i = 0;
                Joueur j = monopoly.getJoueurs().get(i);
                
                if (ihm.infoJoueur(j)) {
                    this.lancerDésAvancer(j);
                }
                
                
                
                i++;
            } while (monopoly.getJoueurs().size() > 1);
        }
}

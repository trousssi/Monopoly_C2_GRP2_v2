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
        
        public static int lancerDes() {
            return RANDOM.nextInt(3)+1;
        }
        
	private Carreau lancerDésAvancer(Joueur aJ) {
            int resDes1 = lancerDes();
            int resDes2 = lancerDes();
            int sommeDes = resDes1+resDes2;
            if (resDes1 == resDes2) {       //Gérer le cas des doubles
                Carreau carreau = monopoly.AvancerJoueur(aJ, sommeDes);
                ihm.messageJoueurAvance(aJ, sommeDes, carreau);       
                carreau.action(aJ);
            }
            
            Carreau carreau = monopoly.AvancerJoueur(aJ, sommeDes);
            ihm.messageJoueurAvance(aJ, sommeDes, carreau);       
            Jeu.Resultat res = carreau.action(aJ);
            ihm.action(res, aJ);
            
            return carreau;
	}
        
        private void lancePartie() {
            boolean continuer = true;
            int i = 0;
                       
            do {
                Joueur j = monopoly.getJoueurs().get(i);
                                
                if (ihm.infoJoueur(j)) {        //renvoie true si le joueur veut jouer;
                    this.lancerDésAvancer(j);
                    i++;
                }
                else if (ihm.quitter()) {
                     continuer = false;
                }
            } while (monopoly.getJoueurs().size() > 1 && continuer);//Les joueurs hors-jeu doivent être supprimés de la liste.
        }
}

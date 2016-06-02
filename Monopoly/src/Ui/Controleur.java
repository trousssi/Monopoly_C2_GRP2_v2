package Ui;

import Jeu.Monopoly;
import Jeu.Joueur;
import Jeu.Carreau;
import Jeu.Propriete;
import java.util.Random;
import java.util.Scanner;

public class Controleur {
	public IHM ihm;
	public Monopoly monopoly;

    public Controleur() {
        this.ihm = new IHM(this);
        this.monopoly = new Monopoly();
        
        this.initPartie();
    }
        
        public static final Random RANDOM = new Random();
        
	public void jouerUnCoup(Joueur joueur) {
		Carreau car;
                car = lancerDésAvancer(joueur);
               
	}
        
        public void initPartie () {
            System.out.println("Combien de joueurs participent ?");
            Scanner sc = new Scanner(System.in);
            int i = Integer.parseInt(sc.nextLine());
            if (i > 1 && i < 7) {
                for (int n = 1; n <= i; n ++) {
                    System.out.println("Entrer le nom du joueur n°" + n + " : ");
                    String nom = sc.nextLine();
                    Joueur joueur = new Joueur(nom, monopoly.getCarreau(1));
                    monopoly.addJoueur(joueur);
                }
                this.lancePartie();
            }
            else {System.out.println("Erreur : nombre de joueurs");}//TODO: Faire une boucle avec la possibilitée de quitter
        }
        
        public static int lancerDes() {
            return RANDOM.nextInt(6)+1;
        }
        
	private Carreau lancerDésAvancer(Joueur j) {
            int resDes1 = lancerDes();
            int resDes2 = lancerDes();
            int sommeDes = resDes1+resDes2;
            if (resDes1 == resDes2) {       //Gérer le cas des doubles
                //TODO: Afficher le double
                Carreau carreau = monopoly.avancerJoueur(j, sommeDes);
                ihm.messageJoueurAvance(j, sommeDes, carreau);       
                Jeu.Resultat res = carreau.action(j,sommeDes);
                ihm.action(res, j);
            }
            
            Carreau carreau = monopoly.avancerJoueur(j, sommeDes);
            ihm.messageJoueurAvance(j, sommeDes, carreau);       
            Jeu.Resultat res = carreau.action(j,sommeDes);
            /*
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("nomCarreau" + res.getNomCarreau());
            System.out.println("numCarreau" + res.getNumeroCarreau());
            System.out.println("proprietaire" + res.getProprietairePropriete());2*/            this.action(ihm.action(res, j), j, res);
            
            return carreau;
	}
        
        private void action (int cas, Joueur j, Jeu.Resultat res) {
            switch (cas) {
                case 0:
                    //Il ne se passe rien
                break;
                case 2:
                    //On veut acheter une propriete et on peut
                    j.payerLoyer(res.getPrixPropriete());
                    res.getProprieteAchete().setProprietaire(j);
                break;
                    
            }
        }
        
        private void lancePartie() {
            boolean continuer = true;
            int i = 0;
                       
            do {
                if (i==monopoly.getJoueurs().size()) {  //Si on a fait le tour on recommence.
                    i=0;
                }
                Joueur j = monopoly.getJoueurs().get(i);
                
                if (ihm.infoJoueur(j)) {        //renvoie true si le joueur veut jouer;
                    this.lancerDésAvancer(j);
                    i++;
                }
                else if (ihm.quitter()) {
                    continuer = false;
                }
                
                if (j.getCash() < 0) {          //Si le joueur n'a plus d'argent, il a perdu
                    ihm.perte(j);
                    monopoly.removeJoueur(j);
                }
            } while (monopoly.getJoueurs().size() > 1 && continuer);
            
            if (monopoly.getJoueurs().size() == 1) {
                ihm.gagne(monopoly.getJoueurs().get(0));
            }
        }
}

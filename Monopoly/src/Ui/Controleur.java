package Ui;

import Jeu.Monopoly;
import Jeu.Joueur;
import Jeu.Carreau;
import Jeu.Propriete;
import java.util.ArrayList;
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
            ArrayList<String> joueurs = ihm.debutPartie(); //On renvoie le nom des joueurs
            while (joueurs.size() < 2 || joueurs.size() > 6) {//On ne prend que des valeurs appartenat à l'intervalle [2; 6]
                joueurs = ihm.debutPartie();
            }
            for (String nom : joueurs) {
                Joueur joueur = new Joueur(nom, monopoly.getCarreau(1));
                monopoly.addJoueur(joueur);
            }
            
            this.lancePartie();
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
                ihm.messageJoueurAvance(j, sommeDes, carreau, true);       
                Jeu.Resultat res = carreau.action(j,sommeDes);
                ihm.action(res, j);
            }
            
            Carreau carreau = monopoly.avancerJoueur(j, sommeDes);
            ihm.messageJoueurAvance(j, sommeDes, carreau, false);       
            Jeu.Resultat res = carreau.action(j,sommeDes);
            
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
            int nbTour = 0;
                       
            do {
                if (i==monopoly.getJoueurs().size() || i == 0) {  //Si on a fait le tour on recommence et on passe au prochain tour.
                    i=0;
                    nbTour++;
                    if (!ihm.debutTour(monopoly.getJoueurs(), nbTour)) { //On doit pouvoir s'arreter
                        continuer = false;
                    }

                }
                Joueur j = monopoly.getJoueurs().get(i);

                if (continuer) {        //renvoie true si le joueur veut continuer à jouer;
                    this.lancerDésAvancer(j);
                    i++;
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

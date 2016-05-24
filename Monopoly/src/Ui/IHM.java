package Ui;

import Jeu.Joueur;
import Jeu.Carreau;
import java.util.Scanner;

public class IHM {
	public Controleur controleur;

	public void messageJoueurAvance(Joueur joueur, int sommeDes, Carreau carreau) {
            System.out.println("[Joueur = "+joueur.getNom()+"] \nLa somme de dés vaut : " + sommeDes);
            System.out.println("Carreau courant : " + joueur.getPositionCourante().getNomCarreau());
            System.out.println("Destination : " + carreau.getNomCarreau());
	}
        
        public boolean infoJoueur(Joueur joueur) {
            System.out.println("[Joueur = " + joueur.getNom()+"]" + " [Cash = "+joueur.getCash()+"]");
            System.out.println("Carreau courant : " + joueur.getPositionCourante());
            
            System.out.println("Voulez-vous avancer ? (O/N)");
            Scanner sc = new Scanner(System.in);
            
            String rep = sc.nextLine().toLowerCase();
            if (rep.charAt(0) == 'o') {
                return true;
            }
            else { return false; }
        }
        
        public boolean quitter() {
            System.out.println("Voulez-vous quitter le jeu ? (O/N) ");
            Scanner sc = new Scanner(System.in);
            
            String rep = sc.nextLine().toLowerCase();
            if (rep.charAt(0) == 'o') {
                return true;
            }
            else { return false; }
        }
        
        public void action(Jeu.Resultat res) {
            //Propriete
            if (res.getProprietairePropriete() != null) {
                System.out.println("Loyer = " + res.getLoyerPropriete());//Nom déjà affiché + paiement obligatoire du loyer géré par controlleur
                this.payeLoyer(res);
            }
            else {//TODO: rajouter une condition de type res.getPrixPropriete() != -1 pour, par ex. une case vide
                System.out.println("Vous pouvez acheter cette proprieté.");
                System.out.println("Prix = " + res.getPrixPropriete() + " €, voulez-vous acheter cette proprieté ? (O/N) ");
                Scanner sc = new Scanner(System.in);
                String rep = sc.nextLine().toLowerCase();
                if (rep.charAt(0) == 'o') {
                    this.achatPropriete();
                }
            }
        }
        
        public void payeLoyer(Jeu.Resultat res) {
            
        }
        
        public void achatPropriete() {
            
        }
}
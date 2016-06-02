package Ui;

import Jeu.Joueur;
import Jeu.Carreau;
import Jeu.Resultat;
import java.util.Scanner;

public class IHM {
	public Controleur controleur;

    public IHM(Controleur controleur) {
        this.controleur = controleur;
    }

	public void messageJoueurAvance(Joueur joueur, int sommeDes, Carreau carreau) {
            System.out.println("[Joueur = "+joueur.getNom()+"] \nLa somme de dés vaut : " + sommeDes);
            //System.out.println("Carreau courant : " + joueur.getPositionCourante().getNomCarreau());
            System.out.println("Destination : " + carreau.getNomCarreau());
            if (carreau.getNomCarreau().contains("Gare")) {
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
            } 
	}
        
        public boolean infoJoueur(Joueur joueur) {//TODO: Afficher la liste de ses proprietes, leurs couleurs en les triant par groupe
            System.out.println("[Joueur = " + joueur.getNom()+"]" + " [Cash = "+joueur.getCash()+"]");
            System.out.println("Carreau courant : " + joueur.getPositionCourante().getNomCarreau());
            
            /*System.out.println("Voulez-vous avancer ? (O/N)");
            Scanner sc = new Scanner(System.in);
            
            String rep = sc.nextLine().toLowerCase();
            if (rep.charAt(0) == 'o') {
            return true;
            }*/return true;
            //else { return false; }
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
        
        public int action(Resultat res, Joueur j) {
            Resultat retour = new Resultat();
            
            //Carreau --> Aucune action spéciale
            /*   System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("nomCarreau" + res.getNomCarreau());
            System.out.println("numCarreau" + res.getNumeroCarreau());
            System.out.println("proprietaire" + res.getProprietairePropriete().getNom());*/
            if(res.getNomCarreau() != null && res.getProprietairePropriete() == null) {
                System.out.println("Carreau = " + res.getNomCarreau() + ", case n° " + res.getNumeroCarreau());
            }
            
            //Propriete --> Acheter ou payer le loyer
            else if (res.getProprietairePropriete() != null) {
                System.out.println("Loyer = " + res.getLoyerPropriete());//Nom déjà affiché + paiement obligatoire du loyer
               
            }
            else if(res.getPrixPropriete() == -2) {
                System.out.println("Vous ne pouvez pas acheter cette propriete");
            }
            else if (res.getPrixPropriete() != -1) {               
                System.out.println("Vous pouvez acheter cette proprieté.");
                System.out.println("Prix = " + res.getPrixPropriete() + " €, voulez-vous acheter cette proprieté ? (O/N) ");
                Scanner sc = new Scanner(System.in);
                String rep = sc.nextLine().toLowerCase();
                if (rep.charAt(0) == 'o') {
                    return 2;//On lance l'achat de la proprieté
                } 
            }
            else {
                System.out.println("Cas non identifié");
            }
        
            return 0;
            
        }
        
        public void perte(Joueur joueur) {
            System.out.println("---------------------------");
            System.out.println("Le joueur "+ joueur.getNom() + " a perdu et est éliminé de la partie !");
            System.out.println("---------------------------");
        }
        public void gagne(Joueur joueur) {
            System.out.println("---------------------------");
            System.out.println("Fin de la partie, "+ joueur.getNom() + " a remporter la victoire");
            System.out.println("---------------------------");
        }
}

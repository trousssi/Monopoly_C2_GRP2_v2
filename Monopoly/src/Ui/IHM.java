package Ui;

import Jeu.Joueur;
import Jeu.Carreau;
import Jeu.Resultat;
import java.util.ArrayList;
import java.util.Scanner;

public class IHM {
	public Controleur controleur;

    public IHM(Controleur controleur) {
        this.controleur = controleur;
    }

    
        public ArrayList<String> debutPartie () {
            ArrayList<String> joueurs = new ArrayList<>();
            System.out.println("Combien de joueurs participent ? ");
            Scanner sc = new Scanner(System.in);
            int i = Integer.parseInt(sc.nextLine());
            if (i > 1 && i < 7) {   
                for (int n = 1; n<i+1; n++) {
                    System.out.println("Entrer le nom du joueur n°" + n + " : ");
                    String nom = sc.nextLine();
                    joueurs.add(nom);
                }
                return joueurs;
            } else {
                System.out.println("Erreur, entrez un nombre de joueurs entre 2 et 6 inclus");
                return joueurs;
            }

        }
    
    
	public void messageJoueurAvance(Joueur joueur, int sommeDes, Carreau carreau, boolean desDouble) {
            if (desDouble) {
                System.out.println("Vous avez fait un double, vous pouvez rejouer !!");
            }
            System.out.println("[Joueur = " + joueur.getNom()+"]" + " [Cash = "+joueur.getCash()+"]");
            System.out.println("[Joueur = "+joueur.getNom()+"] \nLa somme de dés vaut : " + sommeDes);
            //System.out.println("Carreau courant : " + joueur.getPositionCourante().getNomCarreau());
            System.out.println("Destination : " + carreau.getNomCarreau());
            if (carreau.getNomCarreau().contains("Gare")) {
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
        
        public boolean debutTour(ArrayList<Joueur> joueurs, int nbTour) {
            System.out.println("-------------------------");
            System.out.println("---------" + "Tour n°" + nbTour + "--------");
            System.out.println("-------------------------");

            
            for (Joueur j : joueurs) {
                System.out.println("Joueur : " + j.getNom());
                System.out.println("Cash : " + j.getCash());
                System.out.println("Position : Case n°" + j.getPositionCourante().getNumero() + " " + j.getPositionCourante().getNomCarreau());
                System.out.println("-------------------------");
            }
            String rep = "";
            while (!"o".equals(rep) && !"n".equals(rep) && rep != null) {
                System.out.println("Voulez-vous Continuer ? (O/N)");
                Scanner sc = new Scanner(System.in);
                rep = sc.nextLine().toLowerCase();
            }

            return rep.charAt(0) == 'o';
            
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
            else if (res.getProprietairePropriete() != null && res.getProprietairePropriete() != j) {
                System.out.println("Loyer = " + res.getLoyerPropriete());//Nom déjà affiché + paiement obligatoire du loyer
               
            }
            else if(res.getPrixPropriete() == -2) {
                System.out.println("Vous ne pouvez pas acheter cette propriete");
            }
            else if (res.getPrixPropriete() != -1) {               
                String rep = "";
                while (!"o".equals(rep) && !"n".equals(rep) && rep != null) {
                  System.out.println("Prix = " + res.getPrixPropriete() + " €, voulez-vous acheter cette proprieté ? (O/N) ");
                    Scanner sc = new Scanner(System.in);
                    rep = sc.nextLine().toLowerCase();
                }

                if (rep.charAt(0) == 'o') {
                    System.out.println(j.getPositionCourante().getNomCarreau() + " achetée");
                    return 2;//On lance l'achat de la proprieté
                    } 
                }
            else if (res.getProprietairePropriete() == j){
                System.out.println("Vous êtes le proprietaire de cette case.");
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

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
            System.out.println("[Joueur = " + joueur.getNom()+"]");
            System.out.println("Carreau courant : " + joueur.getPositionCourante());
            
            System.out.println("Voulez-vous avancer ? (O/N)");
            Scanner sc = new Scanner(System.in);
            
            String rep = sc.nextLine().toLowerCase();
            if (rep.charAt(0) == 'o') {
                return true;
            }
            else { return false; }
        }
        
}
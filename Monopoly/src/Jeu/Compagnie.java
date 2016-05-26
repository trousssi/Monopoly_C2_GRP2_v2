package Jeu;

public class Compagnie extends Propriete {

        public Compagnie(int numero, String nomCarreau, int prix, int loyer, Joueur proprietaire) {
            super(numero, nomCarreau, prix, loyer, proprietaire);
        }

	protected int calculLoyer(int sommeDes) {
            int nb = proprietaire.getNbCompagnie();
            String nom = proprietaire.getNom();
            int loyer = nomCarreau.getLoyer();
	}
}
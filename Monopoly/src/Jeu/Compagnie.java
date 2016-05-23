package Jeu;

public class Compagnie extends Propriete {

        public Compagnie(int numero, String nomCarreau, int prix, int loyer, Joueur proprietaire) {
            super(numero, nomCarreau, prix, loyer, proprietaire);
        }

	protected int calculLoyer() {
		throw new UnsupportedOperationException();
	}
}
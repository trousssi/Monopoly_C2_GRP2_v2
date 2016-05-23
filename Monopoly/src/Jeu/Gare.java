package Jeu;

public class Gare extends Propriete {

        public Gare(int numero, String nomCarreau, int prix, int loyer, Joueur proprietaire) {
            super(numero, nomCarreau, prix, loyer, proprietaire);
        }


	protected int calculLoyer() {
		throw new UnsupportedOperationException();
	}
}
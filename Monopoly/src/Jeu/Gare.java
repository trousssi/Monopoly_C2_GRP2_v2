package Jeu;

public class Gare extends Carreau {
	private int prix;
	private Joueur proprietaire;

	public void action(Joueur aJ) {
		throw new UnsupportedOperationException();
	}

	private int calculLoyer() {
		throw new UnsupportedOperationException();
	}

	private Joueur getProprietaire() {
		return this.proprietaire;
	}

	private void acheterPropriete(Joueur aJ) {
		throw new UnsupportedOperationException();
	}

	/**
	 * @param aPrix Prix de la gare courante
	 */
	public int calcul(int aNb, int aPrix) {
		throw new UnsupportedOperationException();
	}

	/**
	 * Renvoie le prix de la gare
	 */
	public int getPrix() {
		return this.prix;
	}
}
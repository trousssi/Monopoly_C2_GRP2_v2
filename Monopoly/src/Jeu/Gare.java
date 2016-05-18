public class Gare extends Carreau {
	private int _prix;
	private Joueur _proprietaire;

	public void action(Joueur aJ) {
		throw new UnsupportedOperationException();
	}

	private int calculLoyer() {
		throw new UnsupportedOperationException();
	}

	private Joueur getProprietaire() {
		return this._proprietaire;
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
		return this._prix;
	}
}
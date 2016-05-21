package Jeu;

public abstract class Propriété extends Carreau {
	private int prix;
	private int loyer;
	public Joueur proprietaire;

	public void action(Joueur aJ) {
		throw new UnsupportedOperationException();
	}

	protected abstract int calculLoyer();

	protected Joueur getProprietaire() {
		return this.proprietaire;
	}

	protected void acheterPropriete(Joueur aJ) {
		throw new UnsupportedOperationException();
	}

	public int getPrix() {
		return this.prix;
	}

	public int getLoyer() {
		return this.loyer;
	}
}
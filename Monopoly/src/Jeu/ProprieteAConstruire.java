package Jeu;

public class ProprieteAConstruire extends Propriété {
	private Groupe groupe;

	public Groupe getGroupe() {
		return this.groupe;
	}

	protected int calculLoyer() {
		throw new UnsupportedOperationException();
	}
}
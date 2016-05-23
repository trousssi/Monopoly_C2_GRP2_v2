package Jeu;

public class ProprieteAConstruire extends Propriété {
	private Groupe groupe;

    public ProprieteAConstruire(Groupe groupe, int prix, int loyer, Joueur proprietaire) {
        super(prix, loyer, proprietaire);
        this.groupe = groupe;
    }

        
	public Groupe getGroupe() {
		return this.groupe;
	}

	protected int calculLoyer() {
		throw new UnsupportedOperationException();
	}
}
package Jeu;

public class ProprieteAConstruire extends Propriete {
	private Groupe groupe;

        public ProprieteAConstruire(int numero, String nomCarreau, int prix, int loyer, Joueur proprietaire, Groupe groupe) {
            super(numero, nomCarreau, prix, loyer, proprietaire);
            this.groupe = groupe;
        }

        
	public Groupe getGroupe() {
		return this.groupe;
	}

	protected Resultat calculLoyer() {
		throw new UnsupportedOperationException();
	}
}
package Jeu;

import java.util.HashSet;

public class Groupe {
	private CouleurPropriete couleur;
	public HashSet<ProprieteAConstruire> proprietes = new HashSet<ProprieteAConstruire>();

        public Groupe(CouleurPropriete couleur) {
            this.couleur = couleur;
        }

        public void addPropriete(ProprieteAConstruire propriete) {
            proprietes.add(propriete);
        }

        
	public int GetNbPropriété() {
		throw new UnsupportedOperationException();
	}
}
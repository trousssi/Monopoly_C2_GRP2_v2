package Jeu;

import java.util.HashSet;

public class Groupe {
	private CouleurPropriete couleur; //Couleur des propriétés du groupe
	public HashSet<ProprieteAConstruire> proprietes = new HashSet<ProprieteAConstruire>(); //HashSet contenant toutes les propriétés du groupe

        public Groupe(CouleurPropriete couleur) {
            this.couleur = couleur;
        }
        
        public void addPropriete(ProprieteAConstruire propriete) { 
            proprietes.add(propriete);
        }

	public int getNbPropriete() {
            throw new UnsupportedOperationException();
	}
}
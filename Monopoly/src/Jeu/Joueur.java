package Jeu;

import java.util.ArrayList;

public class Joueur {
	private String nomJoueur;
	private int cash = 1500;
        private Carreau positionCourante;
	public ArrayList<Gare> gares = new ArrayList<Gare>();
        public ArrayList<Compagnie> compagnies = new ArrayList<Compagnie>();
        public ArrayList<ProprieteAConstruire> proprietesAconstruire = new ArrayList<ProprieteAConstruire>();

        
	public void payerLoyer(int aL) {
            cash-=aL;
	}

	public void recevoirLoyer(int aL) {
            cash+=aL;
	}

	public Carreau getPositionCourante() {
		return this.positionCourante;
	}

	public Carreau Avancer(int aSommeDes) {
		throw new UnsupportedOperationException();
	}

	public void setPositionCourante(int aNum) {
		throw new UnsupportedOperationException();
	}

	public boolean peuxPayer(int aPrix) {
		throw new UnsupportedOperationException();
	}

	public String getNom() {
		throw new UnsupportedOperationException();
	}

	public int getNbGare() {
		throw new UnsupportedOperationException();
	}

	public int getNbCompanie() {
		throw new UnsupportedOperationException();
	}

	public int getNbPropriete(Groupe aGroupe) {
		throw new UnsupportedOperationException();
	}
}
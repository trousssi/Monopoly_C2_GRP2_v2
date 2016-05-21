package Jeu;

import java.util.ArrayList;

public class Joueur {
	private String nomJoueur;
	private int cash = 1500;
	public ArrayList<Gare> gares = new ArrayList<Gare>();

	public void payerLoyer(int aL) {
		throw new UnsupportedOperationException();
	}

	public void recevoirLoyer(int aL) {
		throw new UnsupportedOperationException();
	}

	public Carreau getPositionCourante() {
		throw new UnsupportedOperationException();
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
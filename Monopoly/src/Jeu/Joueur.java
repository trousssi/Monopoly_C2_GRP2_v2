package Jeu;

import java.util.ArrayList;

public class Joueur {
	private String nomJoueur;
	private int cash = 1500;
	public ArrayList<Gare> gares = new ArrayList<Gare>();
	private Carreau positionCourante;

	public void payerLoyer(int aL) {
		this.cash=cash-aL;
	}

	public void recevoirLoyer(int aL) {
		this.cash=cash+aL;
	}

	public Carreau getPositionCourante() {
		return this.positionCourante;
	}

	public Carreau Avancer() {
		//this.positionCourante.setNumero(this.positionCourante.getNumero+1);
                return null;
	}

	public void setPositionCourante(Carreau aCarreau) {
		this.positionCourante = aCarreau;
	}

	public boolean peuxPayer(int aPrix) {
		return (cash >= aPrix);
	}

	public String getNom() {
		return this.nomJoueur;
	}

	public int getNbGare() {
            if (gares != null) 
		return gares.size();
            else return 0;
	}
}
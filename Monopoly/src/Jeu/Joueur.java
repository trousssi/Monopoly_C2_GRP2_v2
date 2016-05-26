package Jeu;

import java.util.ArrayList;

public class Joueur {
	private String nomJoueur;
	private int cash = 1500;
        private Carreau positionCourante;
	public ArrayList<Gare> gares = new ArrayList<Gare>();
        public ArrayList<Compagnie> compagnies = new ArrayList<Compagnie>();
        public ArrayList<ProprieteAConstruire> proprietesAconstruire = new ArrayList<ProprieteAConstruire>();

        public Joueur(String nomJoueur, Carreau positionCourante) {
            this.nomJoueur = nomJoueur;
            this.positionCourante = positionCourante;
        }

        
	public void payerLoyer(int aL) {
            cash-=aL;
	}

	public void recevoirLoyer(int aL) {
            cash+=aL;
	}

	public Carreau getPositionCourante() {
            return this.positionCourante;
	}

        public void setPositionCourante(Carreau positionCourante) {
            this.positionCourante = positionCourante;
        }

	public Carreau Avancer(int aSommeDes) {
            throw new UnsupportedOperationException();
	}

	public boolean peuxPayer(int aPrix) {
            return this.getCash()>=aPrix;
	}

	public String getNom() {
            return this.nomJoueur;
	}

	public int getNbGare() {
            return this.getGares().size();
	}
        
        public void addGare(Gare gare) {
            if (gare.getProprietaire() == null) {
                this.getGares().add(gare);
                gare.setProprietaire(this);
            }
        }

	public int getNbCompagnie() {
		return this.getCompagnies().size();
	}

	public int getNbPropriete(Groupe aGroupe) {
		throw new UnsupportedOperationException();
	}

        public int getCash() {
            return cash;
        }

        public ArrayList<Gare> getGares() {
            return gares;
        }

        public ArrayList<Compagnie> getCompagnies() {
            return compagnies;
        }
        
}
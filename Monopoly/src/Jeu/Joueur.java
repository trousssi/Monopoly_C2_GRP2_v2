package Jeu;

import java.util.HashSet;

public class Joueur {
	private String nomJoueur;
	private int cash = 1500;
        private Carreau positionCourante;
	public HashSet<Gare> gares = new HashSet<Gare>();
        public HashSet<Compagnie> compagnies = new HashSet<Compagnie>();
        public HashSet<ProprieteAConstruire> proprietesAconstruire = new HashSet<ProprieteAConstruire>();

        public Joueur(String nomJoueur, Carreau positionCourante) {
            this.nomJoueur = nomJoueur;
            this.positionCourante = positionCourante;
        }

        
	public void payerLoyer(int loyer) {
            cash-=loyer;
	}

	public void recevoirLoyer(int loyer) {
            cash+=loyer;
	}

	public Carreau getPositionCourante() {
            return this.positionCourante;
	}

        public void setPositionCourante(Carreau positionCourante) {
            this.positionCourante = positionCourante;
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
        
        public void addCompagnie(Compagnie compagnie) {
            if (compagnie.getProprietaire() == null) {
                this.getCompagnies().add(compagnie);
                compagnie.setProprietaire(this);
            }
        }
        
        public void addProprieteAConstruire(ProprieteAConstruire p) {
            if (p.getProprietaire() == null) {
                this.getProprietesAconstruire().add(p);
                p.setProprietaire(this);
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

        public HashSet<Gare> getGares() {
            return gares;
        }

        public HashSet<Compagnie> getCompagnies() {
            return compagnies;
        }

        public HashSet<ProprieteAConstruire> getProprietesAconstruire() {
            return proprietesAconstruire;
        }
        
}
package Jeu;

import java.util.ArrayList;

public class Joueur {
	private String nomJoueur;
	private int cash = 1500; // Monnaie du joueur
        private Carreau positionCourante; // Sur quel carreau est le pion du joueur
	public ArrayList<Gare> gares = new ArrayList<>(); // Ensemble des gares que possède le joueur
        public ArrayList<Compagnie> compagnies = new ArrayList<>(); // Ensemble des compagnies que possède le joueur
        public ArrayList<ProprieteAConstruire> proprietesAconstruire = new ArrayList<>(); // Ensemble des propriétés à construire que possède le joueur

        public Joueur(String nomJoueur, Carreau positionCourante) {
            this.nomJoueur = nomJoueur;
            this.positionCourante = positionCourante;
        }

        
	public void payerLoyer(int aL) {
            cash-=aL; // Le joueur paye le loyer de la propriété sur laquelle son pion est tombé.
	}

	public void recevoirLoyer(int aL) {
            cash+=aL; //Le joueur reçois le loyer de sa propriété lorsqu'un joueur adverse a son pion qui est tombé dessus.
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

	public boolean peuxPayer(int aPrix) { // Vérifie si le joueur peu acheter la case sur laquelle il est tombé.
            return this.getCash()>=aPrix;
	}

	public String getNom() {
            return this.nomJoueur;
	}

	public int getNbGare() { // Retourne le nombre de gares que possède le joueur.
            return this.getGares().size();
	}
        
        public void addGare(Gare gare) { // Ajoute une gare à la liste de gares que possède le joueur
            if (gare.getProprietaire() == null) {
                this.getGares().add(gare);
                gare.setProprietaire(this);
            }
        }

	public int getNbCompagnie() { // Retourne le nombre de compagnies que possède le joueur.
            return this.getCompagnies().size();
	}

	public int getNbPropriete(Groupe aGroupe) { // Retourne le nombre de propriétés (qui ne sont pas des gares ou des compagnies) que possède le joueur.
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
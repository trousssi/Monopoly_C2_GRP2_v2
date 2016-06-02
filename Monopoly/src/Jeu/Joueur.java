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
            if (gare.getProprietaire() != null) {
                this.getGares().add(gare);
              
            }
        }
        
        public void addCompagnie(Compagnie compagnie) {
            if (compagnie.getProprietaire() != null) {
                this.getCompagnies().add(compagnie);
                
            }
        }
        
        public void addProprieteAConstruire(ProprieteAConstruire p) {
            if (p.getProprietaire() != null) {
                this.getProprietesAconstruire().add(p);
               
            }
        } 

	public int getNbCompagnie() { // Retourne le nombre de compagnies que possède le joueur.
            return this.getCompagnies().size();
	}

	public int getNbPropriete(Groupe groupe) { // Retourne le nombre de propriétés à contruire du groupe que possède le joueur .
            int nb = 0;
            for (ProprieteAConstruire p : this.proprietesAconstruire) {
                if (p.getGroupe() == groupe ) {
                    nb++;
                }
            }
            return nb;
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

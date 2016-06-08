package Jeu;

public class ProprieteAConstruire extends Propriete {
	private Groupe groupe;
        private int Maison;
        private int Hotel;

        public ProprieteAConstruire(int numero, String nomCarreau, int prix, int loyer, Joueur proprietaire, Groupe groupe) {
            super(numero, nomCarreau, prix, loyer, proprietaire);
            this.groupe = groupe;
            this.Maison = 0;
            this.Hotel = 0;
        }

        
	public Groupe getGroupe() {
	return this.groupe;
	}
        //Calcule le loyer à payer lorsqu'on tombe sur une propriete à construire appartenant à un joueur.
	@Override
	protected Resultat calculLoyer(int sommeDes) { // sommeDes n'est pas utilisé.
            Resultat res = new Resultat();
            Joueur jProprio = this.getProprietaire();       
            if (this.possedeToutesPropGroupe(jProprio)) { // Si le proprietaire possède toutes les propriétés du groupe de couleur de la ProprieteAConstruire
                res.setLoyerPropriete(this.getLoyer()*2); // Alors on double le loyer nu
            }
            else { 
                res.setLoyerPropriete(this.getLoyer()); // Sinon le loyer nu reste celui d'origine
            }
            return res;
	}
        
        public boolean possedeToutesPropGroupe(Joueur j) {
            if (j != this.getProprietaire()) return false; //Un joueur non proprietaire de la carte ne possede aucun propriete du dit groupe
            
            int nbPropGroupe = this.groupe.getNbPropriete(); // Nombre de propriété dans le groupe de couleur de la ProprieteAConstruire
            int nbPropGroupePossede = j.getNbPropriete(this.groupe); // Nombre de propriété de ce groupe possèdées par le propriétaire de la ProprieteAConstruire
            
            return (nbPropGroupe == nbPropGroupePossede);// Si le joueur possède toutes les propriétés du groupe de couleur de la ProprieteAConstruire on renvoie vrai
        }
        
        @Override
        public void setProprietaire(Joueur j) {
            this.proprietaire = j;
            j.addProprieteAConstruire(this);
        }

    public int getNbMaison() {
        return this.Maison;
    }
    
    public int getNbHotel() {
        return this.Hotel;
    }
}

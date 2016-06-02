package Jeu;

public class ProprieteAConstruire extends Propriete {
	private Groupe groupe;

        public ProprieteAConstruire(int numero, String nomCarreau, int prix, int loyer, Joueur proprietaire, Groupe groupe) {
            super(numero, nomCarreau, prix, loyer, proprietaire);
            this.groupe = groupe;
        }

        
	public Groupe getGroupe() {
	return this.groupe;
	}
        //Calcule le loyer à payer lorsqu'on tombe sur une propriete à construire appartenant à un joueur.
	@Override
	protected Resultat calculLoyer(int sommeDes) { // sommeDes n'est pas utilisé.
            Joueur jproprio = this.getProprietaire(); // Proprietaire de la ProprieteAConstruire
            int nbPropGroupe = this.groupe.getNbPropriete(); // Nombre de propriété dans le groupe de couleur de la ProprieteAConstruire
            int nbPropGroupePossede = jproprio.getNbPropriete(this.groupe); // Nombre de propriété de ce groupe possèdées par le propriétaire de la ProprieteAConstruire

            Resultat res = new Resultat();
            if (nbPropGroupe == nbPropGroupePossede) { // Si le joueur possède toutes les propriétés du groupe de couleur de la ProprieteAConstruire
                res.setLoyerPropriete(this.getLoyer()*2); // Alors on double le loyer nu
            }
            else { 
                res.setLoyerPropriete(this.getLoyer()); // Sinon le loyer nu reste celui d'origine
            }
            return res;
	}
  @Override
    public void setProprietaire(Joueur j) {
        this.proprietaire = j;
        j.addProprieteAConstruire(this);
    }
}

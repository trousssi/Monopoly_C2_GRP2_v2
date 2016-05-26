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

	@Override
	protected Resultat calculLoyer(int sommeDe) {
		Joueur jproprio = this.getProprietaire();
                int nbPropGroupe = this.groupe.GetNbPropriété(); // nombre de propriété dans le groupe
                int nbPropGroupePos = jproprio.getNbPropriete(this.groupe); // nombre de propriété de ce groupe posseder par le propriétaire de la Propriété
                
                Resultat res = new Resultat();
                if (nbPropGroupe == nbPropGroupePos) { // si le joueur possede tout alors le loyer du terrain est doublé 
                    res.setLoyerPropriete(this.getLoyer()*2);
                }
                else { 
                    res.setLoyerPropriete(this.getLoyer());
                }
                return res;
                
	}
}

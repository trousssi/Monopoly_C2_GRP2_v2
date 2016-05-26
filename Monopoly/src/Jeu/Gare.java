package Jeu;

public class Gare extends Propriete {

        public Gare(int numero, String nomCarreau, int prix, int loyer, Joueur proprietaire) {
            super(numero, nomCarreau, prix, loyer, proprietaire);
            
            this.setLoyer(25);// loyer de base d'une gare = 25 
        }


	protected Resultat calculLoyer() {//Modifier l'attribut loyer de la gare ?
            int nbGare = this.getProprietaire().getNbGare();
            
            int loyerAPayer = this.getLoyer()*(nbGare);
            
            Resultat res = new Resultat(this.getPrix(), loyerAPayer, this.getProprietaire());
            return res;
	}
}

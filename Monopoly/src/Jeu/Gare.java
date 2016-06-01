package Jeu;

public class Gare extends Propriete {

        public Gare(int numero, String nomCarreau, int prix, int loyer, Joueur proprietaire) {
            super(numero, nomCarreau, prix, loyer, proprietaire);
            
            this.setLoyer(25);// loyer de base d'une gare = 25 
        }

        //Calcule le loyer à payer lorsqu'on tombe sur une gare en fonction du nombre de gare du proprietaire. 
        /**
            -25€ si le propriétaire possède 1 seule gare,
            -50€ si le propriétaire possède 2 gares,
            -75€ si le propriétaire possède 3 gares,
            -100€ si le propriétaire possède 4 gares.
        **/
        @Override
	protected Resultat calculLoyer(int sommeDes) { //sommeDes n'est pas utilisé.
            int nbGare = this.getProprietaire().getNbGare(); //Nombre de garde du proprietaire de la gare
            
            int loyerAPayer = this.getLoyer()*(nbGare); //Application de la règle des gares au loyer à payer
            
            Resultat res = new Resultat(this.getPrix(), loyerAPayer, this.getProprietaire());
            return res;
	}
}

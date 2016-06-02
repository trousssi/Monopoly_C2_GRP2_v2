package Jeu;

public class Compagnie extends Propriete {

        public Compagnie(int numero, String nomCarreau, int prix, int loyer, Joueur proprietaire) {
            super(numero, nomCarreau, prix, loyer, proprietaire);
            
            
        }
        
        // Calcule le loyer à payer lorsqu'on tombe sur une compagnie.
        /**
            -Si le propriétaire possède UNE seule compagnie : 4 fois le montant des dés,
            -Si le propriétaire possède les DEUX compagnies : 10 fois le montant des dés.
        **/
        @Override
	protected Resultat calculLoyer(int sommeDes) {
            int nb = this.getProprietaire().getNbCompagnie(); // nb représente le nombre de compagnie que possède le proprietaire de la Compagnie
            int loyerAPayer = 0;
            switch (nb) { // Application de la règle suivant les 2 cas possibles.
                case 1: loyerAPayer= sommeDes*4; break;
                case 2: loyerAPayer= sommeDes*10; break;
            }
            Resultat res = new Resultat(this.getPrix(), loyerAPayer, this.getProprietaire()); // On renvoie ce qu'on obtient à Résultat.
            return res;
	}

    @Override
    public void setProprietaire(Joueur j) {
        this.proprietaire = j;
        j.addCompagnie(this);
    }
}
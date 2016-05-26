package Jeu;

public class Compagnie extends Propriete {

        public Compagnie(int numero, String nomCarreau, int prix, int loyer, Joueur proprietaire) {
            super(numero, nomCarreau, prix, loyer, proprietaire);
            
            this.setPrix(150);
        }

	protected Resultat calculLoyer(int sommeDes) {
            int nb = this.getProprietaire().getNbCompagnie();
            int loyerAPayer = 0;
            switch (nb) {
                case 1: loyerAPayer= sommeDes*4; break;
                case 2: loyerAPayer= sommeDes*10; break;
            }
            Resultat res = new Resultat(this.getPrix(), loyerAPayer, this.getProprietaire());
            return res;
	}
}
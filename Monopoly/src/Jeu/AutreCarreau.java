package Jeu;

public class AutreCarreau extends Carreau {

    public AutreCarreau(int numero, String nomCarreau) {
        super(numero, nomCarreau);
    }
    
    @Override
    public Resultat action(Joueur aj,int sommeDe) {
        Resultat res = new Resultat(this.getNumero(), this.getNomCarreau());
        return res;
    }
}

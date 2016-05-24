package Jeu;

public abstract class Carreau {
	private int numero;
	private String nomCarreau;

        public Carreau(int numero, String nomCarreau) {
            this.numero = numero;
            this.nomCarreau = nomCarreau;
        }

    public String getNomCarreau() {
        return nomCarreau;
    }

	public int getNumero() {
		return this.numero;
	}
        
        public abstract Resultat action(Joueur j);
            
                }
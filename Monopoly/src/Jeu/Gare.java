package Jeu;

public class Gare extends Propriété {

    public Gare(int prix, int loyer) {
        super(prix, loyer);
    }

	protected int calculLoyer() {
		throw new UnsupportedOperationException();
	}
}
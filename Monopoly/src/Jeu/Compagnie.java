package Jeu;

public class Compagnie extends Propriété {

    public Compagnie(int prix, int loyer) {
        super(prix, loyer);
    }

	protected int calculLoyer() {
		throw new UnsupportedOperationException();
	}
}
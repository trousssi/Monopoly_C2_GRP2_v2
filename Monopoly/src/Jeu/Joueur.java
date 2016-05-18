import java.util.ArrayList;

public class Joueur {
	private String3 _nomJoueur;
	private int _cash = 1500;
	public ArrayList<Gare> _gares = new ArrayList<Gare>();
	private Carreau _positionCourante;

	public void payerLoyer(int aL) {
		throw new UnsupportedOperationException();
	}

	public void recevoirLoyer(int aL) {
		throw new UnsupportedOperationException();
	}

	public Carreau getPositionCourante() {
		return this._positionCourante;
	}

	public Carreau Avancer() {
		throw new UnsupportedOperationException();
	}

	public void setPositionCourante(Carreau aCarreau) {
		throw new UnsupportedOperationException();
	}

	public boolean peuxPayer(int aPrix) {
		throw new UnsupportedOperationException();
	}

	public String getNom() {
		throw new UnsupportedOperationException();
	}

	public int getNbGare() {
		throw new UnsupportedOperationException();
	}
}
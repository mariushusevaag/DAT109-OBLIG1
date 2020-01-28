package no.hvl.dat109;

public class Rute {

	private int indeks;
	private int rutetype;

	public Rute(int indeks) {
		this(indeks, 0);
	}

	public Rute(int indeks, int rutetype) {
		this.indeks = indeks;
		this.rutetype = rutetype;
	}

	public int getPlass() {
		return indeks + 1;
	}

	public int getType() {
		return rutetype;
	}

	public boolean erSlange() {
		return rutetype < 0;
	}

	public boolean erStige() {
		return rutetype > 0;
	}

	@Override
	public String toString() {
		return "Rute " + getPlass() + ". Type: " + rutetype + ".\n";
	}

}

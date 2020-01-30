package no.hvl.dat109;

public class Rute {

	private int indeks;
	private int type;
	private Brett brett;

	public Rute(int indeks, int type) {
		this(indeks, 0);
	}

	public Rute(int indeks, int rutetype, Brett brett) {
		this.indeks = indeks;
		this.type = type;
		this.brett = brett;
	}

	public int getPlass() {
		return indeks + 1;
	}

	public int getType() {
		return type;
	}
	
	public Brett getBrett() {
		return brett;
	}

	public void setBrett(Brett brett) {
		this.brett = brett;
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

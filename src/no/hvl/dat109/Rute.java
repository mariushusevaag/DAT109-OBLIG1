package no.hvl.dat109;

public class Rute {

	private int indeks;
	private Stige stige;
	private Slange slange;

	public Rute(int indeks) {
		this.indeks = indeks;
	}

	public Rute(int indeks, Slange slange) {
		this.indeks = indeks;
		this.slange = slange;
	}

	public Rute(int indeks, Stige stige) {
		this.indeks = indeks;
		this.stige = stige;
	}

	public int getIndeks() {
		return indeks;
	}

	public void setIndeks(int indeks) {
		this.indeks = indeks;
	}

	public Stige getStige() {
		return stige;
	}

	public void setStige(Stige stige) {
		this.stige = stige;
	}

	public Slange getSlange() {
		return slange;
	}

	public void setSlange(Slange slange) {
		this.slange = slange;
	}

	@Override
	public String toString() {
		return "Rute [indeks=" + indeks + ", stige=" + stige + ", slange=" + slange + "]";
	}

}

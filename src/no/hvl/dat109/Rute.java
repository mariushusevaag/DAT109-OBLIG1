package no.hvl.dat109;

public class Rute {

	enum ruteType {
		STIGE, SLANGE, VANLIG
	}

	private int indeks;

	public Rute(int indeks, enum ruteType) {
		this(indeks, VANLIG);
	}

	public int getPlass() {
		return indeks + 1;

	}

}

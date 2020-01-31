package no.hvl.dat109;

/**
 * Definerer en brikke
 * 
 * @author Charlie Coulter, Marius Husevåg, Glenn Arnold Barosen 
 *
 */

public class Brikke {
	
	private int nr;
	private String farge;
	private int pos;
	 
	public Brikke(int nr, String farge) {
		this.nr = nr;
		this.farge = farge;
		this.pos = 0;
	}

	public int getNr() {
		return nr;
	}

	public void setNr(int nr) {
		this.nr = nr;
	}

	public String getFarge() {
		return farge;
	}

	public void setFarge(String farge) {
		this.farge = farge;
	}
	
	public int getPos() {
		return pos;
	}

	public void setPos(int pos) {
		this.pos = pos;
	}

	/**
	 * Metode for å flytte en brikke
	 * 
	 * @param verdi
	 */
	public void flytt(int verdi) {
		pos += verdi;
	}

}

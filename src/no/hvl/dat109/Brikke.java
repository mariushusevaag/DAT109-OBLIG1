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


	public Brikke(int antallBrikker) {
		this.nr = antallBrikker + 1;
		this.pos = 0;
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

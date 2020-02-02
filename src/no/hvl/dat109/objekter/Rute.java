package no.hvl.dat109.objekter;

/**
 * 
 * Klasse for en Rute.
 * 
 * @author Glenn, Marius, Charlie
 *
 */
public class Rute {

	private int ruteNr;
	private int nyRuteNr;
	
	public Rute(int ruteNr) {
		this.ruteNr = ruteNr;
		this.nyRuteNr = ruteNr;
	}
	
	public Rute(int ruteNr, int nyRuteNr) {
		this.ruteNr=ruteNr;
		this.nyRuteNr=nyRuteNr;
	}

	public int getRuteNr() {
		return ruteNr;
	}

	public int getNyRuteNr() {
		return nyRuteNr;
	}
	
	/**
	 * Metode som sjekker om ruten har en stige.
	 * 
	 * @return Returnerer true om ruten er begynnelsen på en stige
	 */
	public boolean harStige() {
		return getNyRuteNr() > getRuteNr();
	}
	
	/**
	 * Metode som sjekker om ruten har en slange.
	 * 
	 * @return Returnerer true om ruten er et slangehode
	 */
	public boolean harSlange() {
		return getNyRuteNr() < getRuteNr();
	}

	@Override
	public String toString() {
		return "Rute [ruteNr=" + getRuteNr() + ", nyRuteNr=" + getNyRuteNr() + "]";
	}
	
	

}

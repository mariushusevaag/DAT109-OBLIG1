package no.hvl.dat109;

/**
 * 
 * @author Glenn Barosen, Marius Husevåg, Charlie Coulter
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
		this.nyRuteNr=ruteNr;
		this.nyRuteNr=nyRuteNr;
	}

	public int getRuteNr() {
		return ruteNr;
	}

	public int getNyRuteNr() {
		return nyRuteNr;
	}
	
	/**
	 * 
	 * @return Returnerer true om ruten er begynnelsen på en stige
	 */
	public boolean harStige() {
		return getNyRuteNr() > getRuteNr();
	}
	
	/**
	 * 
	 * @return Returnerer true om ruten er et slangehode
	 */
	public boolean harSlange() {
		return getNyRuteNr() < getRuteNr();
	}

	@Override
	public String toString() {
		return "Rute [ruteNr=" + ruteNr + ", nyRuteNr=" + nyRuteNr + "]";
	}
	
	

}

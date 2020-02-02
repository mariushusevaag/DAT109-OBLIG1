package no.hvl.dat109.objekter;

/**
 * Klasse for en brikke.
 * 
 * @author Charlie, Marius, Glenn 
 *
 */

public class Brikke {
	
	private String farge;
	private Rute rute;
	private Brett brett;
	 
	public Brikke(String farge, Brett brett) {
		this.farge = farge;
		this.rute = brett.getBrett().get(1);
		this.brett = brett;
		
	}
	
	public Rute getRute() {
		return rute;
	}

	public void setRute(Rute rute) {
		this.rute = rute;
	}

	public String getFarge() {
		return farge;
	}

	public void setFarge(String farge) {
		this.farge = farge;
	}

	/**
	 * Metode for å flytte en brikke
	 * 
	 * @param verdi
	 */
	public void flytt(int verdi) {
		if (rute.getRuteNr() + verdi <= 100) {
			Rute nyRute = brett.nyRutePos(getRute(), verdi);
			setRute(nyRute);
		}		
	}
	
	public void flyttTilNyPosisjon(int curPos){
        Rute nyPos= brett.getBrett().get(curPos);
        setRute(nyPos);
    }
	
}

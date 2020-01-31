package no.hvl.dat109;

/**
 * Definerer en brikke
 * 
 * @author Charlie Coulter, Marius Husevåg, Glenn Arnold Barosen 
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
		Rute nyRute = brett.nyRutePos(getRute(), verdi);
        setRute(nyRute);		
	}
	
	
	

}

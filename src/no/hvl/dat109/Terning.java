package no.hvl.dat109;

/**
 * Definerer en terning.
 * 
 * @author Marius Husevåg, Glenn Arnold Barosen, Charlie Coulter
 *
 */
public class Terning {
	private final int MAX = 6;
	private int verdi;
	
	public Terning() {
		verdi = 1;
	}
	
	public Terning(int verdi) {
		this.verdi = verdi;
	}
	
	/**
	 * Metode for å trille en terning.
	 * 
	 * @return verdi
	 */
	public int trill() {
		//verdi = (int)(Math.random() * MAX) + 1;
		verdi = 1;
		return verdi;
	}
	
	public int getVerdi() {
		return verdi;
	}
	
	public void setVerdi(int verdi) {
		this.verdi = verdi;
	}
	
	@Override
	public String toString() {
		String result = Integer.toString(verdi);
		return result;
	}
}

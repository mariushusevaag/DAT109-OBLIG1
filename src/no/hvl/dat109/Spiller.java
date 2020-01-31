package no.hvl.dat109;

/**
 * Definerer en spiller.
 * 
 * @author Marius Husevåg, Glenn Arnold Barosen, Charlie Coulter
 *
 */
public class Spiller {
	private String navn;
	private Brikke brikke;
	private Terning t1;
	private int sekserePaaRad;
	private boolean trengerSekser;
	private boolean nyttKast;
	private Brett brett;

	public Spiller(String navn, Brikke brikke) {
		this.navn = navn;
		this.brikke = brikke;
		this.sekserePaaRad = 0;
		this.trengerSekser = false;
		this.nyttKast = false;
		this.t1 = new Terning();
	}
	
	public String getNavn() {
		return navn;
	}
	
	public void setNavn(String navn) {
		this.navn = navn;
	}
	
	public Brikke getBrikke() {
		return brikke;
	}
	
	public void setBrikke(Brikke brikke) {
		this.brikke = brikke;
	}
	
	public Terning getTerning() {
		return t1;
	}
	
	public void setTerning(Terning t1) {
		this.t1 = t1;
	}
	
	public int getSekserePaaRad() {
		return sekserePaaRad;
	}
	
	public void setSekserePaaRad(int sekserePaaRad) {
		this.sekserePaaRad = sekserePaaRad;
	}
	
	public boolean getTrengerSekser() {
		return trengerSekser;
	}
	
	public void setTrengerSekser(boolean trengerSekser) {
		this.trengerSekser = trengerSekser;
	}
	
	public boolean getNyttKast() {
		return nyttKast;
	}
	
	public void setNyttKast(boolean nyttKast) {
		this.nyttKast = nyttKast;
	}
	
	/**
	 * Spiller ett trekk for spilleren.
	 */
	public void spillTrekk() {
		setNyttKast(false);
		t1.trill();
		int nyPos = brikke.getRute().getRuteNr() + t1.getVerdi();
		
		/**
		 * Sjekker om spilleren trenger en sekser for å gå videre.
		 */
		if(getTrengerSekser()) {
			if(t1.getVerdi() == 6) {
				brikke.flytt(t1.getVerdi());
				setTrengerSekser(false);
				return;
			} else {
				return;
			}
		}
		
		/**
		 * Sjekker om spilleren får en sekser.
		 */
		if(t1.getVerdi() == 6 && !getTrengerSekser()) {
			setSekserePaaRad(getSekserePaaRad() + 1);
			/**
			 * Om det er den tredje sekseren på rad flyttes brikken til start.
			 */
			if(getSekserePaaRad() == 3) {
				//Flytt til første rute + neste kast må være en sekser
				brikke.setRute(new Rute(0));
				setSekserePaaRad(0);
				setTrengerSekser(true);
				return;
			} else {
				//Flytt + nytt kast
				if(nyPos < 99) {
					brikke.flytt(t1.getVerdi());
					setNyttKast(true);
					//spillTrekk();
					return;
				} else {
					return;
				}
			}
		}
		setSekserePaaRad(0);
		
		if(nyPos > 100) {
			return;
		}
		
		brikke.flytt(t1.getVerdi());
	}

	@Override
	public String toString() {
		return "Spiller [navn=" + navn + ", brikke=" + brikke + ", t1=" + t1 + ", sekserePaaRad=" + sekserePaaRad
				+ ", trengerSekser=" + trengerSekser + ", nyttKast=" + nyttKast + "]";
	}
	
	
	
}

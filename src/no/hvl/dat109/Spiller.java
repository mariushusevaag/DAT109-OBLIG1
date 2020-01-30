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

	public Spiller(String navn, Brikke brikke) {
		this.navn = navn;
		this.brikke = brikke;
		this.sekserePaaRad = 0;
		this.trengerSekser = false;
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
	
	/**
	 * Spiller ett trekk for spilleren.
	 */
	public void spillTrekk() {
		t1.trill();
		int nyPos = brikke.getPos() + t1.getVerdi();
		
		/**
		 * Sjekker om spilleren trenger en sekser for å gå videre.
		 */
		if(trengerSekser) {
			if(t1.getVerdi() == 6 && nyPos < 99) {
				brikke.flytt(t1.getVerdi());
				trengerSekser = false;
				return;
			} else {
				return;
			}
		}
		
		/**
		 * Sjekker om spilleren får en sekser.
		 */
		if(t1.getVerdi() == 6 && !trengerSekser) {
			sekserePaaRad++;
			
			/**
			 * Om det er den tredje sekseren på rad flyttes brikken til start.
			 */
			if(sekserePaaRad == 3) {
				//Flytt til første rute + neste kast må være en sekser
				brikke.setPos(0);
				sekserePaaRad = 0;
				trengerSekser = true;
				return;
			} else {
				//Flytt + nytt kast
				if(nyPos < 99) {
					brikke.flytt(t1.getVerdi());
					spillTrekk();
					return;
				} else {
					return;
				}
			}
		}
		
		if(nyPos > 99) {
			return;
		}
		
		brikke.flytt(t1.getVerdi());
	}
	
}

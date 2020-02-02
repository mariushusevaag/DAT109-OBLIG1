package no.hvl.dat109.objekter;

/**
 * Klasse som definerer en spiller.
 * 
 * @author Marius Husevåg, Glenn Arnold Barosen, Charlie Coulter
 *
 */
public class Spiller {
	
	private String navn;
	private Brikke brikke;
	private boolean gaaTilStart;

	public Spiller(String navn) {
        this.navn = navn;
        this.gaaTilStart = false;
    }
	
	public Brikke getBrikke() {
		return brikke;
	}

	public void setBrikke(Brikke brikke) {
		this.brikke = brikke;
	}

	public String getNavn() {
		return navn;
	}
	
	/**
	 * Metode som spiller ett trekk for spilleren.
	 * 
	 * @param terning
	 */
	public void spillTrekk(Terning terning) {
		int seksere = 0;
		int sum;
		
		do {
			sum = terning.trill();
            if (gaaTilStart && sum != 6) {
                System.out.printf("%s trillet %d. Må trille 6 for å flytte brikken", navn, sum);
                System.out.println();
                break;
            }

            brikke.flytt(sum);
            System.out.printf("%s trillet %d. Flytter fra %d til %d", navn, sum, (brikke.getRute().getRuteNr() - sum), 
            						brikke.getRute().getRuteNr());
            System.out.println();

            if (brikke.getRute().harSlange()) {
                int nyPos = brikke.getRute().getNyRuteNr();
                System.out.printf("Woops! Du traff en slange! Du sklir ned slangen fra %d til %d",
                					brikke.getRute().getRuteNr(), nyPos);
                System.out.println();
                brikke.flyttTilNyPosisjon(nyPos);
            }
            if (brikke.getRute().harStige()) {
                int nyPos = brikke.getRute().getNyRuteNr();
                System.out.printf("Digg, du traff en stige! Du klatrer opp fra %d til %d",
                					brikke.getRute().getRuteNr(), nyPos);
                System.out.println();
                brikke.flyttTilNyPosisjon(nyPos);
            }
            if (sum == 6) {
                System.out.println("Nice! Du fikk en sekser og får et nytt kast!");
                System.out.println();
                seksere++;
                
                if (seksere == 3) {
                    brikke.flyttTilNyPosisjon(1);
                    System.out.printf("Ikke smart med tre seksere på rad! %s flyttes til start!", navn);
                    System.out.println();
                    break;
                }
            }
		}while (sum ==6);
	}
}

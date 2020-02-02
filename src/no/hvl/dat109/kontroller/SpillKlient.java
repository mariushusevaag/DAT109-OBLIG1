package no.hvl.dat109.kontroller;

import no.hvl.dat109.objekter.Stigespill;

/**
 * Klasse for å starte igang spillet.
 * 
 * @author Marius, Charlie, Glenn
 *
 */
public class SpillKlient {

	/**
	 * Metode som starter spillet med spillere.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Stigespill spill = new Stigespill();
        LagSpillere spillere = new LagSpillere(spill);

        spillere.spillerSetup();
        spill.startSpill();

	}

}

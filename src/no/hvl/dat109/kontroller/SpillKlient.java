package no.hvl.dat109.kontroller;

import no.hvl.dat109.objekter.Stigespill;

public class SpillKlient {

	public static void main(String[] args) {
		Stigespill spill = new Stigespill();
        LagSpillere spillere = new LagSpillere(spill);

        spillere.spillerSetup();
        spill.startSpill();

	}

}

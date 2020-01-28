package no.hvl.dat109;

import no.hvl.dat109.Brett;

public class Stigespill {

	public void spill() {
		int i = 0;
		Rute[] ruter = new Rute[100];
		Brett b = new Brett(ruter);

		for (i = 0; i < ruter.length; i++) {
			
			System.out.println(ruter.toString());
		}
	}

}

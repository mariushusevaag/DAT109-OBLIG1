package no.hvl.dat109;

import java.util.ArrayList;

public class Brett {

	private ArrayList<Rute> ruter;
	
	public Brett() {
		ruter = new ArrayList<Rute>();
		for (int i = 1; i <= 100; i++) {
				ruter.add(new Rute(i));
		}
	}

	

}

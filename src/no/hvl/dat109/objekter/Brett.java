package no.hvl.dat109.objekter;

import java.util.HashMap;
import java.util.Map;

public class Brett {
	final int STANDARD_RUTER = 100;
	private Map<Integer, Rute> brett;
	
	public Brett() {
		brett = new HashMap<>();
		for (int i = 1; i <=STANDARD_RUTER; i++) {
			brett.put(i, new Rute(i));
		}
	}

	public Map<Integer, Rute> getBrett() {
		return this.brett;
	}
	
	public void leggTilRutetype() {
		
		// Legger til stiger
		brett.put(2, new Rute(2, 38));
		brett.put(4, new Rute(4, 14));
		brett.put(8, new Rute(8, 31));
		brett.put(21, new Rute(21, 42));
		brett.put(28, new Rute(28, 84));
		brett.put(36, new Rute(36, 44));
		brett.put(51, new Rute(51, 67));
		brett.put(71, new Rute(71, 91));
		brett.put(80, new Rute(80, 100));
		
		// Legger til slanger
		brett.put(16, new Rute(16, 6));
		brett.put(47, new Rute(47, 26));
		brett.put(49, new Rute(49, 11));
		brett.put(56, new Rute(56, 53));
		brett.put(62, new Rute(62, 18));
		brett.put(64, new Rute(64, 60));
		brett.put(87, new Rute(87, 24));
		brett.put(92, new Rute(92, 73));
		brett.put(95, new Rute(95, 75));
		brett.put(98, new Rute(98, 78));
	}

	public Rute nyRutePos(Rute rute, int verdi) {
        int nyPos = rute.getRuteNr() + verdi;
        return brett.get(nyPos);
	}
	@Override
	public String toString() {
		return "Brett [brett=" + brett + "]";
	}
	
	

}

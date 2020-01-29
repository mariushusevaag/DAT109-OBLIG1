package no.hvl.dat109;

import java.util.ArrayList;

import no.hvl.dat109.Brett;

/**
 * 
 * @author Charlie, Marius og Glenn
 * 
 *	En simulering av et stigespill
 */
public class Stigespill {
	
	private final static int WINPOINT = 100;
	
	private Terning terning;
	private Brett brett;
	private Spiller[] spillere;
	private Spiller vinner;
	
	/**
	 * Oppretter et nytt stigespill objekt
	 */
	
	public Stigespill() {
		this.terning = new Terning();
		this.brett = new Brett();
		this.vinner = null;
	}


	public void setup(Spiller[] spillere) {
		this.spillere = spillere;
	}
	
	public void startSpill() {
		Stigespill spill = new Stigespill();
		
	}

	public void spill() {
		ArrayList<Rute> ruter = new ArrayList<Rute>();
		Brett brett = new Brett(ruter);
		
		for (int i=0;i<=100;i++) {
			ruter.add(new Rute(i, 0));
			
		}
//		ruter.remove(60);
//		ruter.add(60, new Rute(60, -1));
//		
//		
//		for (int i = 0; i < ruter.size(); i++) {
//			System.out.println(ruter.get(i));
//		}
//		
//		System.out.println(ruter.get(60).erSlange());
//		System.out.println(brett.toString());
	

	}

}

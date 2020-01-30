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
		this.brett = new Brett(null);
		this.vinner = null;
	}


	public void setup(Spiller[] spillere) {
		this.spillere = spillere;
	}
	
		
	

	public void spill() {	
		System.out.println(brett.lagBrett(100));
		
	}

}

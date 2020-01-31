package no.hvl.dat109;

import java.util.ArrayList;
import java.util.Scanner;

import no.hvl.dat109.Brett;

/**
 * 
 * @author Charlie, Marius og Glenn
 * 
 *	En simulering av et stigespill
 */
public class Stigespill {
	
	

	private Brett brett;
	private Spiller[] spillere;
	private Spiller vinner;
	
	/**
	 * Oppretter et nytt stigespill objekt
	 */
	
	public Stigespill() {
		brett = new Brett();
		
		

		this.vinner = null;
		
	}
	
	public void leggTilSpillere() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Hvor mange skal spille?");
		
		int antSpillere = sc.nextInt();
		spillere = new Spiller[antSpillere];
		
		
		for (int i = 0; i < spillere.length; i++) {
			
			System.out.println("Skriv inn navn: ");
			String navn = sc.next();
			
			System.out.println("Skriv inn farge: ");
			
			String farge = sc.next();
			
			Brikke b = new Brikke(farge, brett);
			Spiller s = new Spiller(navn, b);
			spillere[i] = s;
			
		}
		sc.close();
	}

	public void startSpill() {
		String farge = "gul";
		Brett b = new Brett();
		Brikke brikke = new Brikke(farge, b);
		brikke.setRute(new Rute(1));
		brikke.flytt(1);
		System.out.println(brikke.getRute().getRuteNr());
		System.out.println(brikke.getRute().harStige());
		b.leggTilRutetype();
		leggTilSpillere();

		
		
		while (vinner == null) {
			for (int i = 0; i < spillere.length && vinner == null; i++) {
				Spiller s = spillere[i];
				Brikke b1 = s.getBrikke();
				Terning t = s.getTerning();
				
				s.spillTrekk();
				
				if(b1.getRute().getRuteNr() == brett.STANDARD_RUTER) {
					System.out.println("Spiller: " + s.getNavn());
					System.out.println("Kastet: " + t.getVerdi());
					System.out.println("Pos: " + b1.getRute().getRuteNr());
					System.out.println("Vinneren er: " + s.getNavn());
					vinner = s;
				} else {
					System.out.println("Spiller: " + s.getNavn());
					System.out.println("Kastet: " + t.getVerdi());
					System.out.println("Pos: " + b1.getRute().getRuteNr());
				}
				
				if(s.getNyttKast()) {
					i--;
				}
			}
		}
	}
}

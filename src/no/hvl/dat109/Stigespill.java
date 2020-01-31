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
		Scanner input = new Scanner(System.in);
		System.out.println("Hvor mange skal spille?");
		int antSpillere = input.nextInt();
		spillere = new Spiller[antSpillere];
		
		
		for (int i = 0; i < spillere.length; i++) {
			
			System.out.println("Skriv inn navn: ");
			String name = input.nextLine();

			System.out.println("Skriv inn farge: ");
			String color = input.nextLine();
			
			Brikke b = new Brikke(i, color);
			Spiller s = new Spiller(name , b);
			
			spillere[i] = s;
			input.close();
		}
		this.vinner = null;
		
	}
	public void leggTilSpillere() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Hvor mange skal spille?");
		int antSpillere = sc.nextInt();
		spillere = new Spiller[antSpillere];
		
		for (Spiller s : spillere) {
			System.out.println("Skriv inn navn: ");
			String navn = sc.nextLine();
		}
	}

	public void setup(Spiller[] spillere) {
		this.spillere = spillere;
	}

	public void startSpill() {
		Brett b = new Brett();
		b.leggTilRutetype();
		System.out.println(b.toString());

	}
	
	
//	private static final int WINPOINT = 100;
//	
//	private Brett brett;
//	private Spiller[] spillere;
//	private Spiller vinner;
//	
//	/**
//	 * Oppretter et nytt stigespill objekt
//	 */
//	
//	public Stigespill() {
//	//	this.brett = new Brett(null);
//		spillere = new Spiller[2];
//		
//		for (int i = 0; i < spillere.length; i++) {
//			Brikke b = new Brikke(i, "Farge" + i);
//			Spiller s = new Spiller("Spiller" + i, b);
//			
//			spillere[i] = s;
//		}
//		this.vinner = null;
//	}
//
//	public void setup(Spiller[] spillere) {
//		this.spillere = spillere;
//	}
//	
//	public void spill() {	
//		while (vinner == null) {
//			for (int i = 0; i < spillere.length && vinner == null; i++) {
//				Spiller s = spillere[i];
//				Brikke b = s.getBrikke();
//				Terning t = s.getTerning();
//				
//				s.spillTrekk();
//				
//				if(b.getPos() == 99) {
//					System.out.println("Spiller: " + s.getNavn());
//					System.out.println("Kastet: " + t.getVerdi());
//					System.out.println("Pos: " + b.getPos());
//					System.out.println("Vinneren er: " + s.getNavn());
//					vinner = s;
//				} else {
//					System.out.println("Spiller: " + s.getNavn());
//					System.out.println("Kastet: " + t.getVerdi());
//					System.out.println("Pos: " + b.getPos());
//				}
//				
//				if(s.getNyttKast()) {
//					i--;
//				}
//			}
//		}
//	}

}

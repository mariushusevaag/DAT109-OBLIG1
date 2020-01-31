package no.hvl.dat109.objekter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import no.hvl.dat109.objekter.Brett;

import static java.lang.Thread.sleep;

/**
 * 
 * @author Charlie, Marius og Glenn
 * 
 *	En simulering av et stigespill
 */
public class Stigespill {
	
	

	private Brett brett;
	private List<Spiller> spillere;
	private Terning t1;
	private boolean vunnet;
	
	/**
	 * Oppretter et nytt stigespill objekt
	 */
	
	public Stigespill() {
		brett = new Brett();
		spillere = new ArrayList<>();
		t1 = new Terning();
		vunnet = false;
	}
	
	public void initSpillere(ArrayList<Spiller> spillere) {
		this.spillere = spillere;
	}
	
	public Brett getBrett() {
		return brett;
	}
	
	 public void startSpill() {
        int runder = 1;
        System.out.println("Starter spillet...");

        while (!vunnet) {
            System.out.println("Runde: " + runder);
            spillRunde();
            runder++;
            try {
                sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

        String vinner = finnVinner();
        System.out.println("Vinneren er: " + vinner);

        System.out.println("Spill avsluttet...");
        System.exit(1);
  	}
	 
	public void spillRunde() {
		for (Spiller spiller : spillere) {
            spiller.spillTrekk(t1);
            if(spiller.getBrikke().getRute().getRuteNr() == 100){
                vunnet=true;
            }
        }
	}
	
	public String finnVinner() {
		return spillere.stream()
                .filter(s -> s.getBrikke().getRute().getRuteNr() == 100)
                .map(s -> s.getNavn())
                .collect(Collectors.joining());
	}
	
	/*public void leggTilSpillere() {
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
	}*/
}

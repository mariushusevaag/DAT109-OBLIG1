package no.hvl.dat109.objekter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import no.hvl.dat109.objekter.Brett;

import static java.lang.Thread.sleep;

/**
 * 
 * Klasse som definerer ett stigespill.
 * 
 * @author Charlie, Marius og Glenn
 * 
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
	
	/**
	 * Metode for å initialisere spillere.
	 * 
	 * @param spillere
	 */
	public void initSpillere(ArrayList<Spiller> spillere) {
		this.spillere = spillere;
	}
	
	public Brett getBrett() {
		return brett;
	}
	
	/**
	 * Metode som starter stigespillet.
	 */
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
	 
	/**
	 * Metode som spiller en runde for samtlige spillere.
	 */
	public void spillRunde() {
		for (Spiller spiller : spillere) {
            spiller.spillTrekk(t1);
            if(spiller.getBrikke().getRute().getRuteNr() == 100){
                vunnet=true;
            }
        }
	}
	
	/**
	 * Metode som finner vinneren
	 * 
	 * @return
	 */
	public String finnVinner() {
		return spillere.stream()
                .filter(s -> s.getBrikke().getRute().getRuteNr() == 100)
                .map(s -> s.getNavn())
                .collect(Collectors.joining());
	}
	
}

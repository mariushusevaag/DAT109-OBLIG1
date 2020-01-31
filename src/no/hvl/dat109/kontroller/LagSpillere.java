package no.hvl.dat109.kontroller;

import no.hvl.dat109.objekter.Stigespill;
import no.hvl.dat109.objekter.Spiller;
import no.hvl.dat109.objekter.Brikke;

import java.util.ArrayList;
import java.util.Scanner;

public class LagSpillere {
	private ArrayList<Spiller> spillere;
    private Stigespill spill;

    public LagSpillere(Stigespill spill) {
        spillere = new ArrayList<>();
        this.spill = spill;
    }
    
    public void spillerSetup() {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Hvor mange skal spille?");
		
		int antSpillere = sc.nextInt();
		spillere = new ArrayList<Spiller>(antSpillere);
		
		
		for (int i = 0; i < antSpillere; i++) {
			
			System.out.println("Skriv inn navn: ");
			String navn = sc.next();
			
			System.out.println("Skriv inn farge: ");
			String farge = sc.next();
			
			Spiller s = new Spiller(navn);
			s.setBrikke(new Brikke(farge, spill.getBrett()));
			spillere.add(s);
		}
		if(spillere.size() >= 2) {
            spill.initSpillere(spillere);
        }
		sc.close();	
    }
}

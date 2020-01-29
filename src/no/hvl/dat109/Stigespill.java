package no.hvl.dat109;

public class Stigespill {
	
	private final static int WINPOINT = 100;
	
	private Terning terning;
	private Brett brett;
	private Spiller[] spillere;
	private Spiller vinner;
	
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

}

package no.hvl.dat109;

import java.util.ArrayList;

public class Brett {

	private ArrayList<Rute> ruter;

	public Brett(ArrayList<Rute> ruter) {
		this.ruter = ruter;
	}

	public ArrayList<Rute> getRuter() {
		return ruter;
	}

	public void setRuter(ArrayList<Rute> ruter) {
		this.ruter = ruter;
	}

	@Override
	public String toString() {
		return "" + ruter;
	}

}

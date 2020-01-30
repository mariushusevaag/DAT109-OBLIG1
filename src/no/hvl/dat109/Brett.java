package no.hvl.dat109;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Brett {

	
	private List<Slange> slanger;
	private List<Stige> stiger;
	private List<Rute> ruter;
	
	public Brett(List<Rute> ruter) {
		this.ruter=new ArrayList<Rute>();
	}
	
	public Brett lagBrett(int antallRuter) {
		for (int i=0;i<antallRuter;i++) {
			ruter.add(new Rute(i));
		}
	
		Brett b = new Brett(ruter);
		
		
		
		return b;
	}

	public List<Slange> getSlanger() {
		return slanger;
	}

	public void setSlanger(List<Slange> slanger) {
		this.slanger = slanger;
	}

	public List<Stige> getStiger() {
		return stiger;
	}

	public void setStiger(List<Stige> stiger) {
		this.stiger = stiger;
	}

	public List<Rute> getRuter() {
		return ruter;
	}

	public void setRuter(List<Rute> ruter) {
		this.ruter = ruter;
	}

	@Override
	public String toString() {
		return "Brett [slanger=" + slanger + ", stiger=" + stiger + ", ruter=" + ruter + "]";
	}
	
	

	
	
	
}

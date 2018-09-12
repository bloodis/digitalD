package dd.pg.stats;

public class Sag {
	
	//Base stat
	protected int Sag;

	//Base stat bonus
	protected double SAG;

	public Sag(int Sag) {
	  
	  this.Sag = Sag;
	  this.SAG = (Sag >= 10 ? Math.floor((Sag-10)/2) : Math.floor((Sag-10)/2));
	}

	public int getSag() {
	  
	  return Sag;
	}

	public int getSagBonus() {
	  
	  return (int)SAG;
	}

}

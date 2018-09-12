package dd.pg.stats;

public class Des {

	//Base stat
	protected int Des;

	//Base stat bonus
	protected final double DES;

	public Des(int Des) {
	  
		this.Des = Des;
		this.DES = (Des >= 10 ? Math.floor((Des-10)/2) : Math.floor((Des-10)/2));
	}

	public int getDes() {
	  
	  return Des;
	}

	public int getDesBonus() {
	  
	  return (int)DES;
	}
	
}

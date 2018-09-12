package dd.pg.stats;

public class Int {

	//Base stat
	protected int Int;

	//Base stat bonus
	protected double INT;

	public Int(int Int) {
	  
	  this.Int = Int;
	  this.INT = (Int >= 10 ? Math.floor((Int-10)/2) : Math.floor((Int-10)/2));
	}

	public int getInt() {
	  
	  return Int;
	}

	public int getIntBonus() {
	  
	  return (int)INT;
	}
}

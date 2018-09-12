package dd.pg.stats;

public class Cos {

	//Base stat
	protected int Cos;

	//Base stat bonus
	protected double COS;

	public Cos(int Cos) {
	  
	  this.Cos = Cos;
	  this.COS = (Cos >= 10 ? Math.floor((Cos-10)/2) : Math.floor((Cos-10)/2));
	}

	public int getCos() {
	  
	  return Cos;
	}

	public int getCosBonus() {
	  
	  return (int)COS;
	}
	
}

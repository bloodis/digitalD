package dd.pg.stats;

public class For {

	//Base stat
	protected int For;
	
	//Base stat bonus
	protected double FOR;
	
	public For(int For) {
		
		this.For = For;
		this.FOR = (For >= 10 ? Math.floor((For-10)/2) : Math.floor((For-10)/2));
	}
	
	public int getFor() {
		
		return For;
	}
	
	public int getForBonus() {
		
		return (int)FOR;
	}
}

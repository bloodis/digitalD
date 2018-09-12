package dd.pg.stats;

public class StatHandler {
	
	protected int initFor;
	protected int initDes;
	protected int initCos;
	protected int initInt;
	protected int initSag;
	protected int initCar;
	
	protected For For;
	protected Des Des;
	protected Cos Cos;
	protected Int Int;
	protected Sag Sag;
	protected Car Car;

	public StatHandler(int initFor, int initDes, int initCos, int initInt, int initSag, int initCar) {
		
		this.initFor = initFor;
		this.initDes = initDes;
		this.initCos = initCos;
		this.initInt = initInt;
		this.initSag = initSag;
		this.initCar = initCar;
		
		this.For = new For(initFor);
		this.Des = new Des(initDes);
		this.Cos = new Cos(initCos);
		this.Int = new Int(initInt);
		this.Sag = new Sag(initSag);
		this.Car = new Car(initCar);
	}
	
	public int getFor() {
		
		return For.getFor();
	}
	
	public int getDes() {
		
		return Des.getDes();
	}
	
	public int getCos() {
		
		return Cos.getCos();
	}
	
	public int getInt() {
		
		return Int.getInt();
	}
	
	public int getSag() {
		
		return Sag.getSag();
	}
	
	public int getCar() {
		
		return Car.getCar();
	}
	
	
	public int getForBonus() {
		
		return For.getForBonus();
	}
	
	public int getDesBonus() {
		
		return Des.getDesBonus();
	}
	
	public int getCosBonus() {
		
		return Cos.getCosBonus();
	}
	
	public int getIntBonus() {
		
		return Int.getIntBonus();
	}
	
	public int getSagBonus() {
		
		return Sag.getSagBonus();
	}
	
	public int getCarBonus() {
		
		return Car.getCarBonus();
	}
	
}

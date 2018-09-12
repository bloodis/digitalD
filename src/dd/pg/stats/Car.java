package dd.pg.stats;

public class Car {

	//Base stat
	protected int Car;

	//Base stat bonus
	protected double CAR;

	public Car(int Car) {
	  
	  this.Car = Car;
	  this.CAR = (Car >= 10 ? Math.floor((Car-10)/2) : Math.floor((Car-10)/2));
	}

	public int getCar() {
	  
	  return Car;
	}

	public int getCarBonus() {
	  
	  return (int)CAR;
	}
	
}

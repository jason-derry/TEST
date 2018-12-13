package garage;

public class Motorbike extends Vehicle {
	
	private boolean sideCar;
	
	public Motorbike(int wheels, int seats, boolean sideCar, String petrolType, String colour) {
		this.setWheels(wheels);
		this.setSeats(seats);
		this.sideCar = sideCar;
		this.setPetrolType(petrolType);
		this.setColour(colour);
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub

	}

	@Override
	public void accelerate() {
		// TODO Auto-generated method stub

	}

	@Override
	public void refuel() {
		// TODO Auto-generated method stub

	}

	@Override
	public void headlightsOn() {
		// TODO Auto-generated method stub

	}

	public boolean isSideCar() {
		return sideCar;
	}

	public void setSideCar(boolean sideCar) {
		this.sideCar = sideCar;
	}

	@Override
	public String toString() {
		return "Motorbike [wheels=" + this.getWheels() + ", seats=" + this.getSeats() + ", petrolType=" + this.getPetrolType() + ", colour=" + this.getColour() + ", has side car?: " + sideCar + "]";
	}

}

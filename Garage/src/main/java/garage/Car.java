package garage;

public class Car extends Vehicle {

	private int doors;
	
	public Car(int wheels, int seats, int doors, String petrolType, String colour) {
		this.setWheels(wheels);
		this.setSeats(seats);
		this.doors = doors;
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

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

	@Override
	public String toString() {
		return "Car [wheels=" + this.getWheels() + ", seats=" + this.getSeats() + ", petrolType=" + this.getPetrolType() + ", colour=" + this.getColour() + ", doors=" + doors + "]";
	}

}

package garage;

public class Train extends Vehicle {
	
	private int carriages;
	
	public Train(int wheels, int seats, int carriages, String petrolType, String colour) {
		this.setWheels(wheels);
		this.setSeats(seats);
		this.carriages = carriages;
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

	public int getCarriages() {
		return carriages;
	}

	public void setCarriages(int carriages) {
		this.carriages = carriages;
	}

	@Override
	public String toString() {
		return "Train [wheels=" + this.getWheels() + ", seats=" + this.getSeats() + ", petrolType=" + this.getPetrolType() + ", colour=" + this.getColour() + ", carriages=" + carriages + "]";
	}

}

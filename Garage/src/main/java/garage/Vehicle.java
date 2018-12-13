package garage;

public abstract class Vehicle {
	
	private int wheels;
	private int seats;
	private String petrolType;
	private  String colour;
	
	public abstract void start();
	public abstract void accelerate();
	public abstract void refuel();
	public abstract void headlightsOn();
	
	public int getWheels() {
		return wheels;
	}
	public void setWheels(int wheels) {
		this.wheels = wheels;
	}
	public int getSeats() {
		return seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
	public String getPetrolType() {
		return petrolType;
	}
	public void setPetrolType(String petrolType) {
		this.petrolType = petrolType;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	@Override
	public String toString() {
		return "Vehicle [wheels=" + wheels + ", seats=" + seats + ", petrolType=" + petrolType + ", colour=" + colour + "]";
	}
	
	
}

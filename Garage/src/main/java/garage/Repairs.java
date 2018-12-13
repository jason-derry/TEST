package garage;

public class Repairs {
	
	private String vehicle;
	private double cost;
	
	public Repairs(String vehicle, double cost) {
		this.vehicle = vehicle;
		this.cost = cost;
	}

	public String getVehicle() {
		return vehicle;
	}

	public void setVehicle(String vehicle) {
		this.vehicle = vehicle;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Repairs [vehicle=" + vehicle + ", cost=" + cost + "]";
	}

}

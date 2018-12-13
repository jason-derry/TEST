package paintWizard;

public class Paint {

	private String brand;
	private int capacity;
	private int coverage;
	private double cost;
	private int totalCoverage;
	
	public Paint(String brand, int capacity, double cost, int coverage) {
		this.brand = brand;
		this.capacity = capacity;
		this.cost = cost;
		this.coverage = coverage;
		this.totalCoverage = capacity * coverage;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public int getCoverage() {
		return coverage;
	}

	public void setCoverage(int coverage) {
		this.coverage = coverage;
	}

	public int getTotalCoverage() {
		return totalCoverage;
	}

	@Override
	public String toString() {
		return brand + " (" + capacity + "Litre)" + " £" + cost + " - This tin of paint will cover " + coverage + "m^2 per Litre";
	}
		
}

package garage;

import java.util.ArrayList;

public class Garage {

	private ArrayList<Vehicle> garage = new ArrayList<>();
	
//	Repairs repairs = new Repairs();
	//private ArrayList<Repairs> garage = new ArrayList<>();
	
	public void calculateBill() {
		for(int i = 0; i < garage.size(); i++) {
			double total = 0;
			String type = garage.get(i).getClass().getSimpleName();
			String petrol = garage.get(i).getPetrolType();
			
			switch(type) {
			case "Car":
				total += 400;
				total += ((Car) garage.get(i)).getDoors() * 35;
				break;
			case "Motorbike":
				if (((Motorbike) garage.get(i)).isSideCar() == true)
					total += 150;
				break;
			case "Train":
				total += 2500;
				total += ((Train) garage.get(i)).getCarriages() * 280;
				break;
			}

			total += garage.get(i).getWheels() * 80;
			total += garage.get(i).getSeats() * 25;
			if (petrol.equals("diesel"))
				total += 250;
			else
				total += 120;
			if (garage.get(i).getColour() == "red")
				total *= 0.9;
			
			System.out.println("Total bill for " + garage.get(i).getClass().getSimpleName() + i + " = £" + total);
			}
		//return ("Total bill for " + garage.get(i).getClass().getSimpleName() + i + " = £" + total);
		
	}
	
	public void printList() {
		garage.stream().forEach(System.out::println);

	}
	
	public ArrayList<Vehicle> addVehicle(Vehicle newVeh) {
		garage.add(newVeh);
		return garage;
	}
	
	public ArrayList<Vehicle> removeVehicle(Vehicle remVeh) {
		garage.remove(remVeh);
		return garage;
	}
	
	public ArrayList<Vehicle> removeVehicle(String type) {
		switch (type) {
			case("Car"):
				for(int i = 0; i < garage.size(); i++) {
					if (garage.get(i) instanceof Car)
						garage.remove(i);
			}
			break;
			case("Motorbike"):
				for(int i = 0; i < garage.size(); i++) {
					if (garage.get(i) instanceof Motorbike)
						garage.remove(i);
			}
			break;
			case("Train"):
				for(int i = 0; i < garage.size(); i++) {
					if (garage.get(i) instanceof Train)
						garage.remove(i);
			}
			break;
		}
		return garage;
	}
	
	public ArrayList<Vehicle> emptyGarage() {
		garage.clear();
		return garage;
	}
}

/* 			if (type.equals("Car")) {
				total += 400;
				total += ((Car) garage.get(i)).getDoors() * 35;
			}
			else if (type.equals("Motorbike")) {
				total += 250;
				if (((Motorbike) garage.get(i)).isSideCar() == true)
					total += 150;
			}
			else if (type.equals("Train")) {
				total += 2500;
				total += ((Train) garage.get(i)).getCarriages() * 280;
			} */

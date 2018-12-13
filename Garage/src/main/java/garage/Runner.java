package garage;

public class Runner {

	public static void main(String[] args) {
		
		Garage g1 = new Garage();
		
		Car car1 = new Car(4,5,5,"unleaded","red");
		Motorbike bike1 = new Motorbike(2,1,false,"diesel","black");
		Train train1 = new Train(18,30,2,"diesel","blue");
		
		g1.addVehicle(car1);
		g1.addVehicle(bike1);
		g1.addVehicle(train1);
		
		g1.calculateBill();
		
		Car car2 = new Car(3,4,3,"diesel","green");
				
		g1.addVehicle(car2);
		
		g1.removeVehicle("Car");
		
		g1.printList();
		
//		g1.removeVehicle(car2);
		
//		g1.printList();
		
//		g1.emptyGarage();
		
//		g1.printList();

	}
	
}

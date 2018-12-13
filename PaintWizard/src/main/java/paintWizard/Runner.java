package paintWizard;

public class Runner {

	public static void main(String[] args) {

		PaintWizard wiz = new PaintWizard();
		
		Paint cheapoMax = new Paint("CheapoMax", 21, 19.99, 10);
		Paint oneWithDog = new Paint("ThatOneWithTheDog", 40, 34.38, 12);
		Paint avgJoes = new Paint("AverageJoes", 16, 17.99, 11);
		Paint duluxPaints = new Paint("DuluxourousPaints", 10, 25, 22);
		
		wiz.listAdd(cheapoMax);
		wiz.listAdd(oneWithDog);
		wiz.listAdd(avgJoes);
		wiz.listAdd(duluxPaints);
		
		wiz.printList().forEach(System.out::println);
		
		int roomSize = 210;
		
		wiz.leastWasteSqM(roomSize).stream().forEach(n -> System.out.println(n.getBrand() + " will provide the least waste in m^2." ));
		wiz.leastWasteL(roomSize).stream().forEach(n -> System.out.println(n.getBrand() + " will provide the least waste in litres."));
		
		wiz.cheapestPaint().stream().forEach(n -> System.out.println(n.getBrand() + " is the cheapest brand."));
		
	}
}

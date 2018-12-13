
public class animalExamples {

	public static void main(String[] args) {
		
		Animal Lion = new Animal("savannah");
		Animal Rhino = new Animal(4, true, false, "savannah");
		Animal Snake = new Animal(0, false, false, "jungle");
		Animal Dog = new Animal();
		
		System.out.println(Lion.toString());
		System.out.println(Rhino.toString());
		System.out.println(Snake.toString());
		System.out.println(Dog.toString());
		
	}
	
}

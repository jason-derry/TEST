
public class Runner {
	
	public static void main(String[] args) {

		PersonManager pm1 = new PersonManager();
		
		Person jeff = new Person("Jeff", 36, "Janitor");
		Person alice = new Person("Alice", 23, "Author");
		Person bob = new Person("Bob", 44, "Construction Worker");
		Person hannah = new Person("Hannah", 27, "Secretary");
		Person joe = new Person("Joe", 30, "Farmer");
		Person bob2 = new Person("Bob", 78, "Retired");
		
		pm1.addToList(jeff);
		pm1.addToList(alice);
		pm1.addToList(bob);
		pm1.addToList(hannah);
		pm1.addToList(joe);
		pm1.addToList(bob2);
		
		pm1.printList();
		System.out.println(pm1.personSearch("Bob"));
	}

}
		
/*		Person jeff = new Person("Jeff", 36, "Janitor");
		Person alice = new Person("Alice", 23, "Author");
		Person bob = new Person("Bob", 44, "Construction Worker");
		Person hannah = new Person("Hannah", 27, "Secretary");
		Person joe = new Person("Joe", 30, "Farmer");
		Person bob2 = new Person("Bob", 78, "Retired");
		
//		System.out.println(jeff.toString());
		
		ArrayList<Person> peopleList = new ArrayList<Person>();
		
		peopleList.add(jeff);
		peopleList.add(alice);
		peopleList.add(bob);
		peopleList.add(hannah);
		peopleList.add(joe);
		peopleList.add(bob2);
		
		for (int i = 0; i < peopleList.size(); i++)
			System.out.println(peopleList.get(i).getName());
		
		peopleList.stream().forEach(System.out::println);
		
		personSearch("Bob",peopleList);
	}

	public static void names(ArrayList<Person> list) {
		list.stream().map(n -> n.getName()).forEach(System.out::println);
	}
	
	public static void personSearch(String name, ArrayList<Person> list) {
		list.stream().filter(n -> n.getName() == name).forEach(System.out::println);
	}*/
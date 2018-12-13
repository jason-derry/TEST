import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PersonManager {

	private ArrayList<Person> peopleList = new ArrayList<Person>();
	
	public void addToList(Person person) {	
		peopleList.add(person);
	}
	
	public void printList() {
		peopleList.stream().forEach(System.out::println);
	}
	
	public List<Person> personSearch(String name) {
		List<Person> result = peopleList.stream().filter(n -> n.getName() == name).collect(Collectors.toList());
		return result;
	}
	
}

/*private static ArrayList<Person> createList() {

Person jeff = new Person("Jeff", 36, "Janitor");
Person alice = new Person("Alice", 23, "Author");
Person bob = new Person("Bob", 44, "Construction Worker");
Person hannah = new Person("Hannah", 27, "Secretary");
Person joe = new Person("Joe", 30, "Farmer");
Person bob2 = new Person("Bob", 78, "Retired");

ArrayList<Person> peopleList = new ArrayList<Person>();

peopleList.add(jeff);
peopleList.add(alice);
peopleList.add(bob);
peopleList.add(hannah);
peopleList.add(joe);
peopleList.add(bob2);

return peopleList;
}*/
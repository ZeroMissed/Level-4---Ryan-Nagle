import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Demographics { public static void main(String[] args) {
	List<Person> people = new ArrayList<Person>();

	people.add(new Person("John", LocalDate.of(1996, 10, 1)));
	people.add(new Person("James", LocalDate.of(1986, 9, 2)));
	people.add(new Person("Jack", LocalDate.of(1999, 8, 3)));
	people.add(new Person("Jackson", LocalDate.of(1960, 7, 4)));
	people.add(new Person("Jackie", LocalDate.of(1971, 6, 5)));
	people.add(new Person("Jonathan", LocalDate.of(1928, 5, 6)));
	people.add(new Person("Jamie", LocalDate.of(1939, 4, 7)));
	people.add(new Person("Johny", LocalDate.of(1964, 3, 8)));
	people.add(new Person("Jordan", LocalDate.of(1978, 2, 9)));
	people.add(new Vampire("Jarin", LocalDate.of(1965, 1, 10), 30));
	
	
	Demographics demo = new Demographics(people);
	System.out.println(demo.getAverageAge());
}
	private List<Person> people;
	
	public Demographics(List<Person> people) {
		this.people = people;
	}

	public double getAverageAge() {
		double totalAge = 0;
		for(Person i: people) {
			totalAge += i.getAge();
		}
		return totalAge/people.size();
	}
}

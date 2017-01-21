import java.time.LocalDate;

public class Person {
	private String name;
	private LocalDate dateOfBirth;
	
	public Person(String name, LocalDate dateOfBirth) {
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return dateOfBirth.until(LocalDate.now()).getYears();
	}

}

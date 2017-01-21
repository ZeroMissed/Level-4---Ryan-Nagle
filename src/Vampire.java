import java.time.LocalDate;

public class Vampire extends Person{
	private int ageAtDeath;
	public Vampire(String name, LocalDate dateOfBirth, int ageAt) {
		super(name, dateOfBirth);
		// TODO Auto-generated constructor stub
	}
	public int getAge(){
		return ageAtDeath;
	}
}

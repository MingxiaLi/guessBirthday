
//a concrete subclass of Entity
public class Person extends Entity {

	private String gender;

	// a super constructor
	public Person(String name, Date birthday) {
		super(name, birthday);
	}

	// a super constructor with new instance variable gender
	public Person(String name, Date birthday, String gender, double difficulty) {
		super(name, birthday, difficulty);
		this.gender = gender;
	}

	// copy constructor
	public Person(Person person) {
		super(person);
		this.gender = person.gender;
	}

	// string method to print out this entity type
	public String entityType() {
		return "This entity is a person!";
	}

	// clone method to return type of entity
	public Person clone() {
		return new Person(this);
	}

	// string method to print detailed information for person
	public String toString() {
		return super.toString() + "Gender: " + gender + "\n";
	}

}

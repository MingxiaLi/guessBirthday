
//a concrete subclass of Entity
public class Politician extends Person {

	private String party;

	// a super constructor
	public Politician(String name, Date birthday) {
		super(name, birthday);
	}

	// a super constructor with new instance variable party
	public Politician(String name, Date birthday, String gender, String party, double difficulty) {
		super(name, birthday, gender, difficulty);
		this.party = party;
	}

	// copy constructor
	public Politician(Politician politician) {
		super(politician);
		this.party = politician.party;
	}

	// string method to print out this entity type
	public String entityType() {
		return "This entity is a Politician!";
	}

	// clone method to return type of entity
	public Politician clone() {
		return new Politician(this);
	}

	// string method to print detailed information for politician
	public String toString() {
		return super.toString() + "Party: " + party + "\n";
	}
}

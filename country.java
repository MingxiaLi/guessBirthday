
//a concrete subclass of Entity
public class Country extends Entity {

	private String capital;

	// a super constructor
	public Country(String name, Date birthday) {
		super(name, birthday);
	}

	// a super constructor with new instance variable capital
	public Country(String name, Date birthday, String capital, double difficulty) {
		super(name, birthday, difficulty);
		this.capital = capital;
	}

	// copy constructor
	public Country(Country country) {
		super(country);
		this.capital = country.capital;
	}

	// string method to print out this entity type
	public String entityType() {
		return "This entity is a country! ";
	}

	// clone method to return type of entity
	public Country clone() {
		return new Country(this);
	}

	// string method to print detailed information for country
	public String toString() {
		return super.toString() + "Capital: " + capital + "\n";
	}

}

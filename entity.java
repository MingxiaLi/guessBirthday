
public abstract class Entity {

	private String name;
	private Date born;
	private double difficulty;

	// a normal constructor for Entity
	public Entity(String name, Date birthday) {
		this.name = name;
		this.born = new Date(birthday);
	}

	// a normal constructor for Entity which add difficulty in
	public Entity(String name, Date birthday, double difficulty) {
		this(name, birthday);
		this.difficulty = difficulty;
	}

	// copy constructor to prevent privacy leak
	public Entity(Entity copyEntity) {
		this.name = copyEntity.name;
		this.born = new Date(copyEntity.born);
		this.difficulty = copyEntity.difficulty;
	}

	// accessor for name
	public String getName() {
		return name;
	}

	// accessor for difficulty
	public double getDifficulty() {
		return difficulty;
	}

	// mutator for difficulty
	public void setDifficulty(double difficulty) {
		this.difficulty = difficulty;
	}

	// mutator for name
	public void setName(String name) {
		this.name = name;
	}

	// accessor for born
	public Date getBorn() {
		return born;
	}

	// mutator for born
	public void setBorn(Date born) {
		this.born = born;
	}

	// return the reward tickets
	public int getAwardedTicketNumber() {
		return (int) Math.round(difficulty * 100);
	}

	// string method to return the content of an entity
	public String toString() {
		return "Name: " + name + "\n" + "Born at: " + born.toString() + "\n";
	}

	// declare an abstract class and use it in the derived class
	public abstract String entityType();

	// declare an abstract class and use it in the derived class
	public abstract Entity clone();

	// string method to return a welcome message and the type of entity
	public String welcomeMessage() {
		System.out.println("**********************************");
		return "Welcome! Let's start the game! " + entityType() + "\n";
	}

	// string method to return a closing message and the detailed information of the
	// entity
	public String closingMessage() {
		return ("Congratulations! The detailed information of the entity you guessed is:\n" + toString());
	}

	// equals method to compare the content of two entities
	public boolean equals(Entity copyEntity) {
		if (copyEntity == null) // if copy constructor is empty
			return false;
		else if (getName() != copyEntity.getName() || getBorn() != copyEntity.getBorn()) // if two entities have
																							// different content
			return false;
		else {
			return (name.equals(copyEntity.name) && born.equals(copyEntity.born)); // two entities have the same content
		}
	}
}

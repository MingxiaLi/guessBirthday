
/* Author Mingxia Li
Date March 6, 2018
 */

import java.util.Random;
import java.util.Scanner;

public class GuessMaster {

	private int numberOfCandidateEntities;
	private Entity[] entities;
	private int totalTicketNum = 0;// Three instance variables

	// main method to initialize the game

	public static void main(String[] args) {
		System.out.println("=========================\n");
		System.out.println("     GuessMaster 2.0 \n");
		System.out.println("=========================");
		// The last parameter of the follow line is the difficulty score described
		// above.
		Politician trudeau = new Politician("Justin Trudeau", new Date("December", 25, 1971), "Male", "Liberal", 0.25);
		Singer dion = new Singer("Celine Dion", new Date("March", 30, 1961), "Female", "La voix du bon Dieu",
				new Date("November", 6, 1981), 0.5);
		Person myCreator = new Person("myCreator", new Date("September", 1, 2000), "Female", 1);
		Country usa = new Country("United States", new Date("July", 4, 1776), "Washinton D.C.", 0.1);

		GuessMaster gm = new GuessMaster(); // set gm as the short name for GuessMaster
		gm.addEntity(trudeau);
		gm.addEntity(dion);
		gm.addEntity(usa);
		gm.addEntity(myCreator);// add four entities to the game

		gm.playGame(); // call the playGame method
	}

	// accessor for getNumberOfCandidateEntities
	public int getNumberOfCandidateEntities() {
		return numberOfCandidateEntities;
	}

	// mutator for getNumberOfCandidateEntities
	public void setNumberOfCandidateEntities(int numberOfCandidateEntities) {
		this.numberOfCandidateEntities = numberOfCandidateEntities;
	}

	// accessor for getEntities
	public Entity[] getEntities() {
		return entities;
	}

	// mutator for getEntities
	public void setEntities(Entity[] entities) {
		this.entities = entities;
	}

	// initialize the instance variables
	public GuessMaster() {
		numberOfCandidateEntities = 0;
		entities = new Entity[50];
	}

	public Entity clone() throws CloneNotSupportedException {
		return (Entity) super.clone();
	}
	
	// add a new entity into entities
	public void addEntity(Entity entity) {
		entities[numberOfCandidateEntities++] = (entity).clone();
	}

	// playGame method
	public void playGame(Entity entity) {
		System.out.printf(entity.welcomeMessage());

		System.out.printf("\nGuess %s's birthday\n", entity.getName());
		System.out.println("(mm/dd/yyyy)");
		Scanner scanner = new Scanner(System.in);

		// if input exist
		while (true) {
			String answer = scanner.nextLine();
			answer = answer.replace("\n", "").replace("\n", "");

			// if user type quit
			if (answer.equals("quit")) {
				System.exit(0); // exit the game
			}

			else {
				Date date = new Date(answer); // set the input as a date

				// if the guess date is earlier than the answer
				if (date.precedes(entity.getBorn())) {
					System.out.println("Wrong date, please guess a new date later than " + date);
				}
				// if the guess date is later than the answer
				else if (entity.getBorn().precedes(date)) {
					System.out.println("Wrong date, please guess a new date earlier than " + date);
				}
				// if the guess is right answer
				else {
					totalTicketNum = totalTicketNum + entity.getAwardedTicketNumber();
					System.out.println("*************Bingo!*****************");
					System.out.println("You won " + entity.getAwardedTicketNumber() + " tickets in this round." + "\n"
							+ "The total number of your tickets is " + totalTicketNum +".");
					System.out.println("************************************");
					System.out.println(entity.closingMessage());
					break; // the program keeps going after the right answer is reached
				}
			}
		}
	}

	// invoke a playGame method
	public void playGame(int entityInd) {
		Entity entity = entities[entityInd]; // fetch the entity from the entities
		playGame(entity); // invoke playGame(Entity entity) to play a game
	}

	// invoke a playGame method
	public void playGame() {
		while (true) {
			int entityId = genRandomEntityInd(); // randomly pick an entity from entities
			playGame(entityId); // invoke playGame(int entityInd) to play a game
		}
	}

	// generate a random number
	int genRandomEntityInd() {
		Random rand = new Random();
		int entityInd = rand.nextInt(numberOfCandidateEntities); // random number can't be larger than candidate number
		return entityInd; // return the random number
	}


}


/* Skriven av: Atthasith(atsa5883)*/
import java.util.Scanner;
import java.util.ArrayList;

public class DogProgram {
	private Scanner input = new Scanner(System.in);
	private boolean programRunning = true;
	private ArrayList<Dog> dogs = new ArrayList<Dog>();
	private ArrayList<User> users = new ArrayList<User>();

	public static void main(String[] args) {
		DogProgram program = new DogProgram();

		do
			program.listCommand();
		while (program.programRunning);
		// program.exit();
	}

	private void listCommand() {

		System.out.println("\n* register new dog");
		System.out.println("* increase age");
		System.out.println("* list dogs");
		System.out.println("* remove dog");
		// user
		System.out.println("* register new user");
		System.out.println("* list users");
		System.out.println("* remove user");
		// auction
		System.out.println("* start auctions");// inte klar
		System.out.println("* list auctions");// inte klar

		// bid
		System.out.println("* list bids");// inte klar
		System.out.println("* make bid");// inte klar

		System.out.println("* close auction");// inte klar

		System.out.println("* exit");
		System.out.println("Command> ");
		readCommand();
	}

	private void readCommand() {
		String keyboard = input.nextLine();
		switch (keyboard.toLowerCase()) {
		case "re":
		case "register new dog":
			register();
			break;
		case "increase age":
		case "increase":
			increase();
			break;
		case "list dogs":
			list();
			break;
		case "remove dog":
			remove();
			break;
		case "exit":
			programRunning = false;
			exit();
			break;
		case "register new user":
			registerUser();
			break;

		case "list users":
			listUser();
			break;

		case "remove user":
			removeUser();
			break;

		case "start auction":
			startAuction();
			break;

		case "list auctions":
			listAuctions();
			break;

		case "list bids":
			listBids();
			break;

		case "make bid":
			makeBid();
			break;

		case "close auction":
			closeAuction();
			break;

		default:
			System.out.println("Unknown command");
			System.out.println("Available commands are:");

			listCommand();
		}
	}

	private void register() {
		System.out.println("Name>");
		String name = input.nextLine();
		System.out.println("Breed>");
		String breed = input.nextLine();
		System.out.println("Age>");
		int age = input.nextInt();
		System.out.println("Weight>");
		int weight = input.nextInt();
		Dog d = new Dog(name, breed, age, weight);
		dogs.add(d);
		System.out.println(format(name) + " added to the register");
		input.nextLine();
	}

	private void registerUser() {
		System.out.println("Name>");
		String name = input.nextLine();
		User u = new User(name);
		users.add(u);
		System.out.println(format(name) + " added to the register");

	}

	private void increase() {
		System.out.println("Enter the name of the dog>");
		String name = input.nextLine();
		boolean isExit = false;
		for (int i = 0; i < dogs.size(); i++) {
			Dog d = dogs.get(i);

			if (d.getName().equalsIgnoreCase(name)) {
				d.setAge();
				System.out.println(format(name) + " is now one year older");
			} else {
				isExit = true;
			}
		}
		if (isExit) {
			System.out.println("Error: no such dog");

		}

	}

	private void list() {

		if (dogs.isEmpty()) {
			System.out.println("Error:no dogs in register");

		} else {
			System.out.println("Smallest tail length to display>");
			int svan = input.nextInt();
			System.out.println("The following dogs has such a large tail:");
			if (svan == 0) {
				System.out.println("* " + dogs);
			} else if (svan > 0) {

				for (int i = 0; i < dogs.size(); i++) {
					Dog d = dogs.get(i);
					double tailLength = d.getTailLength();
					if (tailLength >= svan) {

						System.out.print("* " + dogs.get(i));

					}

				}
			}

		}

	}

	private void listUser() {

		if (users.isEmpty()) {
			System.out.println("Error:no users in register");

		} else {
			for (int i = 0; i < users.size(); i++) {
				User u = users.get(i);
				System.out.println(u);
			}
		}
	}

	private void remove() {
		System.out.println("Enter the name of dog>");
		String name = input.nextLine();
		boolean isNotExit = false;
		for (int i = 0; i < dogs.size(); i++) {
			Dog d = dogs.get(i);
			if (name.equalsIgnoreCase(d.getName())) {
				dogs.remove(i);
				System.out.println(format(name) + " is removed from the register");
			} else {
				isNotExit = true;

			}
		}
		if (isNotExit || dogs.isEmpty()) {
			System.out.print("Error: no such dog");
		}
	}

	private void removeUser() {
		System.out.println("Enter the name of the user>");
		String name = input.nextLine();
		boolean isNotExit = false;
		for (int i = 0; i < users.size(); i++) {
			User u = users.get(i);
			if (name.equalsIgnoreCase(u.getName())) {
				users.remove(i);
				System.out.println(format(name) + " is removed from the register");
			} else {
				isNotExit = true;

			}
		}
		if (isNotExit || users.isEmpty()) {
			System.out.print("Error: no such user");
		}
	}

	private void startAuction() {
		boolean isNotExit = false;
		System.out.println("Enter the name of the dog>");
		String name = input.nextLine();
		// lägg name av hunden på auktionslist
		for (int i = 0; i < dogs.size(); i++) {
			Dog d = dogs.get(i);
			if (name.equalsIgnoreCase(d.getName())) {
				System.out.println(format(name) + " has been put up for auction #" + " list nummer");
			} else {
				isNotExit = true;
			}
		}
		if(isNotExit) {
			System.out.println("Error: no such dog");
		}

	}

	private void listAuctions() {
		// visar auktionslist
	}

	private void listBids() {
		// visar bidslist
	}

	private void makeBid() {
		// lägga till bid
	}

	private void closeAuction() {
		System.out.println("Enter the name of the dog>");
		String name = input.nextLine();
		System.out
				.println("The auction is closesd. The winning bid was " + "**bid**" + " kr and made by " + "**User**");
		// visar bid o user basera på en hund sedan ta bort auction listan

		System.out.println("Error: this dog is not up for auction");// fel namn
	}

	private void exit() {
		System.out.println("Goodbye!");
		input.close();
		// System.exit(0);
	}

	private String format(String string) {

		String resultat;

		resultat = string.toUpperCase().charAt(0) + string.toLowerCase().substring(1);

		return resultat;
	}
}

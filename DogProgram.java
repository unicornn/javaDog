/* Skriven av: Atthasith(atsa5883)*/
import java.util.Scanner;
import java.util.ArrayList;

public class DogProgram {
	private Scanner input = new Scanner(System.in);
	private boolean programRunning = true;
	private ArrayList<Dog> dogs = new ArrayList<Dog>();

	public static void main(String[] args) {
		DogProgram program = new DogProgram();

		do
			program.listCommand();
		while (program.programRunning);
		// program.exit();
	}

	private void listCommand() {
		// programRunning= true;
		System.out.println("Dog Register Program\n");
		System.out.println("Register new dog");
		System.out.println("Increase age");
		System.out.println("List dogs");
		System.out.println("Remove dog");
		System.out.println("Exit");
		System.out.println("\nType command : ");
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
		default:
			System.out.println("error");
			System.out.println("________________________");
			listCommand();
		}
	}

	private void register() {
		System.out.println("Name:");
		String name = input.nextLine();
		System.out.println("Breed:");
		String breed = input.nextLine();
		System.out.println("Age:");
		int age = input.nextInt();
		System.out.println("Weight:");
		int weight = input.nextInt();
		Dog d = new Dog(name, breed, age, weight);
		dogs.add(d);
		input.nextLine();
	}

	private void increase() {
		System.out.println("Name:");
		String name = input.nextLine();
		boolean isExit = false;
		for (int i = 0; i < dogs.size(); i++) {
			Dog d = dogs.get(i);

			if (d.getName().equalsIgnoreCase(name)) {
				d.setAge();
			} else {
				isExit = true;
			}
		}
		if (isExit) {
			System.out.println("error");

		}
		input.nextLine();
	}

	private void list() {
		System.out.println("Length:");
		int svan = input.nextInt();
		if (svan == 0) {
			System.out.println(dogs);
		} else if (svan > 0) {

			for (int i = 0; i < dogs.size(); i++) {
				Dog d = dogs.get(i);
				double tailLength = d.getTailLength(d.getAge(), d.getWeight());
				if (tailLength >= svan) {
					System.out.print(dogs.get(i));

				}

			}
		}

		input.nextLine();
	}

	private void remove() {
		System.out.println("Name:");
		String name = input.nextLine();
		boolean isExit = false;
		for (int i = 0; i < dogs.size(); i++) {
			Dog d = dogs.get(i);
			if (name.equalsIgnoreCase(d.getName())) {
				dogs.remove(i);
			} else {
				isExit = true;

			}
		}
		if (isExit) {
			System.out.print("error");
		}
	}

	private void exit() {
		System.out.println("Program close");
		input.close();
		// System.exit(0);
	}
}

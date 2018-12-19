
/* Skriven av: Atthasith(atsa5883)*/
import java.util.ArrayList;

public class User {

	private String name;
	private int startBid;
	private ArrayList<Dog> dogs = new ArrayList<Dog>();

	public User(String name) {
		this.name = name;

	}

	public User(String name, ArrayList<Dog> dogs) {
		this.name = name;
		this.dogs = dogs;
	}

	public String getName() {
		return name;
	}

	public int setBid(int i) {
		 startBid=i;
		return startBid;
	}

	private String format(String string) {

		String resultat;

		resultat = string.toUpperCase().charAt(0) + string.toLowerCase().substring(1);

		return resultat;
	}

	public String toString() {
		return format(name) + dogs;
	}

}

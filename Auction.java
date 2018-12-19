
/* Skriven av: Atthasith(atsa5883)*/
import java.util.ArrayList;

public class Auction {
	private Dog dog;
	private ArrayList<User> users = new ArrayList<User>();
//borde ändra till vanligt Array
	public Auction(Dog dog) {
		this.dog = dog;
	}

	public String getDogName() {
		return dog.getName();
	}

	public String toString() {
		return format(dog.getName()) + ". Top bids: " + users;
	}

	private String format(String string) {

		String resultat;

		resultat = string.toUpperCase().charAt(0) + string.toLowerCase().substring(1);

		return resultat;
	}
}


/* Skriven av: Atthasith(atsa5883)*/
import java.util.ArrayList;

public class Auction {
	private Dog dog;
	//dog.getName()
	private ArrayList<User> users = new ArrayList<User>();
	
	public Auction(Dog dog) {
		this.dog=dog;
	}
	public String toString() {
		return dog.getName()+". Top bids: "+ users;
	}
	
	
	private String format(String string) {

		String resultat;

		resultat = string.toUpperCase().charAt(0) + string.toLowerCase().substring(1);

		return resultat;
	}
}


/* Skriven av: Atthasith(atsa5883)*/
public class Bid {
	private User user;
	private int budget;
	
	public String toString() {
		return format(user.getName()) +" "+budget+ " kr";
	}

	private String format(String string) {

		String resultat;

		resultat = string.toUpperCase().charAt(0) + string.toLowerCase().substring(1);

		return resultat;
	}
}

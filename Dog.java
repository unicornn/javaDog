/* Skriven av: Atthasith(atsa5883)*/

public class Dog {

	private String name;
	private String breed;
	private int age;
	private int weight;
	private User user;

	public Dog(String name, String breed, int age, int weight) {
		this.name = name;
		this.breed = breed;
		this.age = age;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public String getBreed() {
		return breed;
	}

	public void setAge() {

		age++;
	}
	public int getAge() {
		return age;
	}

	public int getWeight() {
		return weight;
	}

	public void setOwner(User u) {
		user=u;
	}
	public User getOwner() {
		return user;
	}
	public double getTailLength() {

		double tailLength;
		if (breed.equalsIgnoreCase("tax") || breed.equalsIgnoreCase("dachshund")) {

			tailLength = 3.7;
		}

		else {
			tailLength = (age * weight) / 10.0;
		}
		return tailLength;
	}

	public String toString() {
		String hasOwner = "";
		if (user != null) {
			hasOwner = ", owned by " + user.getName();
		}

		return format(name) + " (" + format(breed) + ", " + age + " years, " + weight + " kilo, " + getTailLength()
				+ " cm tail" + hasOwner + ")";
	}

	private String format(String string) {

		String resultat;

		resultat = string.toUpperCase().charAt(0) + string.toLowerCase().substring(1);

		return resultat;
	}

}

/* Skriven av: Atthasith(atsa5883)*/

public class Dog {

	private String name;
	private String breed;
	private int age;
	private int weight;

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

	public double getTailLength(int age, double weight) {

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
		return name.toLowerCase() + " " + breed.toLowerCase() + " " + age + " år " + weight + " kg svans="
				+ getTailLength( age,weight);
	}
}

package overiding;

public class dog extends animals {

	public void eat() {
		System.out.println("An xuong, com");
	}

	@Override
	public void makeSound() {
		System.out.println("Gau gau");
	}

}

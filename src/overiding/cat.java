package overiding;

public class cat extends animals {

	public void eat() {
		System.out.println("An ca");
	}

	@Override
	public void makeSound() {
		System.out.println("Meow meow");
	}
	
}

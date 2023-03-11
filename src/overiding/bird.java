package overiding;

public class bird extends animals {
	int a=20;
	public void eat() {
		System.out.println("An sau");
	}

	public void makeSound() {
		System.out.println("Liu lo");
	}

	@Override
	public void foot(String foot, int number) {
		System.out.println(foot + "----" + number);
	}
	
	
	
}

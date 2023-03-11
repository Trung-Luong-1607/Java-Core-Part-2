package overiding;

public class animals {
	public static int a=10;
	protected void eat() {
		System.out.println("An gì ?");
	}
	public void makeSound() {
		System.out.println("Tieng keu ?");
	}
	public void foot(String foot, int number) {
		System.out.println(foot + " " + number);
	}
}

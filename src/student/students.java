package student;

public class students {
	protected String name = "Trung";
	protected int age = 26;
	protected void info() {
		System.out.println("name is : " + name + ", age is : " + age);
	}
	public static void main(String[] args) {
		students std = new students();
		std.info();
	}
}

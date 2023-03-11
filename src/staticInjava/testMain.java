package staticInjava;

public class testMain {
//	public testMain(String name, int age) {
//		super(name, age);
//		// TODO Auto-generated constructor stub
//	}

	public static void main(String[] args) {
		person.info();
		System.out.println(person.age);
		System.out.println(person.name);
		person.info();
		person ps = new person("Trung", 11);
		ps.info();
		person.info();
//		System.out.println(age);
//		System.out.println(name);
//		System.out.println(age);
//		System.out.println(name);
//		info();
	}
}

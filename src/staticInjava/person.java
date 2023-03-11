package staticInjava;

import java.util.Random;

public class person {
	public static String name = "Trung";
	public static int age = 17;
	public static void info() {
		System.out.println(name + " " + age++);
	}
	public person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public static void staticTest(int a, int b) {
		System.out.println(a + b);
	}
	public static void staticTest(float a, float b) {
		System.out.println(a + b);
	}
	
public static void main(String[] args) {
	System.out.println(person.name);
	System.out.println(person.age);
	person.info();
	person.info();
	person.info();
	person.info();

	person ps = new person("Trung", 20);
	ps.getAge();
	ps.getName();
	System.out.println(age);
	System.out.println(name.valueOf(1234) instanceof String);
	Random rdRandom = new Random();
	person.staticTest(2.5f, 7.1f);
	person.staticTest(5, 2);
	
}
}

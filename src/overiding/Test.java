package overiding;

public class Test {
	public static void main(String[] args) {
		animals.a = 20;
		animals ani = new animals();
		dog dg = new dog();
		cat ct = new cat();
		bird bd = new bird();
		dg.eat();
		dg.makeSound();
		ct.eat();
		ct.makeSound();
		bd.eat();
		bd.makeSound();
		bd.foot("kroot", 2);
		ani.eat();
//		System.out.println(bd.a);
		System.out.println(animals.a);
	}
}

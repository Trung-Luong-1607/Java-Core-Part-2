package abstractClass;

public class A {
	public final void F() {
		System.out.println("F");
	}
	public A() {
		System.out.println("A");
	}
}

class B extends A {
	public B() {
		System.out.println("B");
	}
}

class C extends B {
	public C() {
		System.out.println("C");
	}
}



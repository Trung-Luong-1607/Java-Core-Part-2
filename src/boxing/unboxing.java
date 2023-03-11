package boxing;

public class unboxing {
	Integer a = 1000;
	Integer c = new Integer(100);
	int b = a;
	int d = c;
	public static void main(String[] args) {
		unboxing ub = new unboxing();
		System.out.println(ub.b);
		System.out.println(ub.d);
	}
}

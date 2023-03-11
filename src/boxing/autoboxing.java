package boxing;

public class autoboxing {
	int a = 100;
	Integer b = new Integer(a);
	Integer c = a;
	Integer d = Integer.valueOf(a);
	public static void main(String[] args) {
		autoboxing at = new autoboxing();
		System.out.println(at.b);
		System.out.println(at.c);
		System.out.println(at.d);
	}
}

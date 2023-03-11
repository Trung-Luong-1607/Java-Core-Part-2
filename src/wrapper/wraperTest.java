package wrapper;

public class wraperTest {
	static {
		System.out.println("Hello ae");
	}
	public static int f = 22;
	public static void main(String[] args) {
		int a = 123;

		Integer b = new Integer(a);
		System.out.println("a :" + a + ", b :" + b);
		
		Integer c = new Integer(11);
		c.intValue();
		int e = c;
		
		wraperTest wp = new wraperTest();
		wp.f = 33;
		System.out.println(wp.f);
}
}

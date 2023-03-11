package abstractClass;

import java.applet.Applet;
import java.util.jar.Attributes.Name;

public class testABS extends Applet {
	static String a = "asc";
	final int f = 0;
	public static void name() {
		System.out.println("name");
	}
	public static void name(int a, int b) {
		final int c;
		c = 0;
		System.out.println(c);
		System.out.println(a + b);
	}
	public static void a1() {
		name();
		a = "bca";
		System.out.println("a1");
	}
	static {
		a = "ccc";
	}
	public static class abc {
		public void sum(int a, int b) {
			System.out.println(a+b);
		}
	}
}

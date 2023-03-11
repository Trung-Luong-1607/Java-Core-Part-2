package string_method;

import java.util.StringTokenizer;

public class hashCode {
	String str1 = new String("Java");
	String str3 = new String("Java");
	String str2 = "Java";
	public static String str4;
	public final String str5 = "KAKA";
	
	public static void main(String[] args) {
		hashCode hsCode = new hashCode();
		System.out.println(hsCode.str1.hashCode());
		System.out.println(hsCode.str2.hashCode());
		System.out.println(hsCode.str3.hashCode());
		StringTokenizer str6 = new StringTokenizer("Java là ngôn ngữ hướng đối tượng");
		StringBuffer s1 = new StringBuffer("Java");
		System.out.println(s1.indexOf("ava"));
		System.out.println(s1.insert(2, "mama"));
		System.out.println(s1.delete(0, 3));
		hsCode.str4 = "Trung";
		System.out.println(str4);
		System.out.println(hsCode.str5);
		while (str6.hasMoreElements()) {
			System.out.println(str6.nextElement());
			
		}
		System.out.println(s1);
		System.out.println(hsCode.str2.equals(hsCode.str3));
		System.out.println(hsCode.str1.concat("Deverloper"));
		System.out.println(hsCode.str1);

	}
}

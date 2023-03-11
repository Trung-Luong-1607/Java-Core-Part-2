package comparison;

public class test {
public static void main(String[] args) {
	String srt1 = "hello";
	String str2 = new String("hello");
	System.out.println(srt1 == str2);
	System.out.println(srt1.equals(str2));
}
}

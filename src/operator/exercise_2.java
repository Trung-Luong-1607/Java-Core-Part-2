package operator;

import java.util.Scanner;

public class exercise_2 {
	public static void main(String[] args) {
		int a;
		int b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập giá trị a =");
		a = sc.nextInt();
		System.out.println("Nhập giá trị b =");
		b = sc.nextInt();
		// Toán tử số học
		System.out.println("Giá trị a + b =" + (a+b));
		System.out.println("Giá trị a - b =" + (a-b));
		System.out.println("Giá trị a * b =" + (a*b));
		System.out.println("Giá trị a / b =" + (a/b));
		System.out.println("Giá trị a % b =" + (a%b));
		System.out.println("Giá trị a++ =" + (a++));
		System.out.println("Giá trị b-- =" + (b--));
		System.out.println("Giá trị ++a =" + (++a));
		System.out.println("Giá trị --b =" + (--b));
		
		// Toán tử so sánh
		System.out.println("Giá trị a == b =" + (a==b));
		System.out.println("Giá trị a != b =" + (a!=b));
		System.out.println("Giá trị a > b =" + (a>b));
		System.out.println("Giá trị a < b =" + (a<b));
		System.out.println("Giá trị a >= b =" + (a>=b));
		System.out.println("Giá trị a <= b =" + (a<=b));
	}
}

package constructor;

import java.awt.Label;

public class testConstructor {
	public int number1 = 3;
	public String str = "Constructor use";
	public void PrintRes() {
		System.out.println("result 1:" + number1 + " result 2:" + str);
	}
	public void tesConstructor(int a, int b) {
		System.out.println("Result: " + (a + b));
	}
	
	testConstructor(int number1, String str) {
		this.number1 = number1;
		this.str = str;
	}
	
	testConstructor() {
	}
	
	public int testConstructor(int x, int y) {
		return x + y;
		
	}
	
	{}
	
//	public static void main(String[] args) {
//		testConstructor tsConstructor = new testConstructor();
//		testConstructor tsConstructor2 = new testConstructor(22, "params");
//		System.out.println(tsConstructor2.number1 + " " + tsConstructor2.str);
//		tsConstructor.PrintRes();
//		tsConstructor.tesConstructor(5, 6);
//	}
}





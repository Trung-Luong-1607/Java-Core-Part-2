package collections;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class listTest {
	static {
		System.out.println("GoodBye");
	}
	listTest() {
		System.out.println("Hello");
	}
	
	public void KAKA() {
		System.out.println("Cream");
	}
	
	public static void KOKO() {
		System.out.println("Hi");
	}
	
	public static class listout {
		public static void lsout() {
			System.out.println("Hi");
		}
	}
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.forEach((v) -> System.out.println(v));
		listTest ls = new listTest();
		listTest.listout.lsout();
		listTest.KOKO();
		Stack<String> ls01 = new Stack<String>();
		Queue<String> ls02 = new ArrayDeque<String>();
//		ls01.add("Lương");
//		ls01.add("Toàn");
//		ls01.add("Trung");
//		ls01.add("Văn");
//		ls01.add("Long");
		ls01.push("Nguyễn");
		ls01.push("Văn");
		ls01.push("Giang");
		
//		ls02.add("Lương");
//		ls02.add("Toàn");
//		ls02.add("Trung");
//		ls02.add("Văn");
//		ls02.add("Long");
		
		ls01.forEach((v) -> {System.out.println(v);});
//		ls02.forEach((v) -> {System.out.println(v);});
		
	}
}

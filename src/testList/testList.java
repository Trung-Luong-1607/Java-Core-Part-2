package testList;

import java.awt.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class testList {
	public static void main(String[] args) {
		ArrayList<String> arrList = new ArrayList<String>();
		LinkedList<String> linklist = new LinkedList<String>();		
		Stack<String> stackList = new Stack<String>();
		// phương thức add() được dùng để thêm một phần tử
		arrList.add("trung");
		arrList.add("toan");
		arrList.add("luong");
		arrList.add("van");
		arrList.add("nguyen");
		arrList.add(0, "Hoa");
		arrList.add(null);
		arrList.add(null);
		arrList.add(null);
		arrList.add(null);
		
		linklist.add("trung");
		linklist.add("toan");
		linklist.add("luong");
		linklist.add("van");
		linklist.add("nguyen");
		linklist.add(null);
		linklist.add(null);
		linklist.add(null);
		linklist.add(null);
		
		
		// phương thức addAll() được dùng để thêm một đối tượng 
		arrList.addAll(linklist);
		System.out.println(arrList);
		System.out.println(linklist);
		// xóa toàn bộ mảng
//		arrList.clear();
//		arrList.subList(fromIndex, toIndex);
		arrList.removeAll(arrList);
		System.out.println(arrList);
		
		

		

//		System.out.println(arrList);
//		arrList.set(2, "Nguyễn");
//		linklist.remove(1);
//		System.out.println(linklist);

	}
}

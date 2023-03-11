package array;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class array1 {
	String[] strArr = {"Java", "C++", "JavaScript"};
	String a = "2";
	String b = "2";
	public static void main(String[] args) {
		
		array1 arr = new array1();
		System.out.println(arr.a == arr.b);
		for(String i : arr.strArr) {
			System.out.println(i);
		}
	}
}

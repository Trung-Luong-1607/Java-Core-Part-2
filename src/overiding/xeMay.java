package overiding;

import java.util.ArrayList;
import java.util.Stack;
import java.util.Vector;

public class xeMay extends phuongtien {

	@Override
	public void tinhVanToc(int a, int b) {
		System.out.println(a - b);
	}

	@Override
	public void tinhVanToc(float a, float b, float c) {
		System.out.println(a - b - c);
	}

	@Override
	public void tinhVanToc(int a, int b, int c) {
		System.out.println(a - b - c);
	}

	@Override
	public void tinhVanToc(double a, double b, double c) {
		System.out.println(a - b - c);
	}
	
	public static void main(String[] args) {
		ArrayList<String> arrlist = new ArrayList<String>();
		Vector<String> vt = new Vector<String>();
		Stack<String> st = new Stack<String>();
		int[] arr = {1,2,3,4,5};
		xeMay xm = new xeMay();
		xm.tinhVanToc(235, 111);
		System.out.println(arr[0]);
		arrlist.trimToSize();
	}

}

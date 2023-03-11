package wrapper;

import java.lang.reflect.Array;
import java.util.Arrays;

import org.omg.CORBA.PUBLIC_MEMBER;

public class bai_1 {
	public static int q = 11;
	public Integer k = 22;
	int a =40;
	public static void printK() {
		System.out.println("Nhập K: " + q);
	}
	
	
	
	static public void  main(String[] args) {
	int i = Integer.parseInt("10");
	bai_1 b1 = new bai_1();
	Integer j = 12;	
	float f  = Float.parseFloat("4.5f");
	System.out.println(i);
	System.out.println(f);
	System.out.println(j.doubleValue());
	System.out.println(b1.a);
	b1.printK();
}
}

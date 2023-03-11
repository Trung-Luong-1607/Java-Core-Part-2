package constructor;

import javax.naming.spi.ResolveResult;

import junit.textui.ResultPrinter;

public class constructor {
	private int number_1;
	private int number_2;
	public constructor(int i, int j) {
		this.number_1 = i;
		this.number_2 = j;
		System.out.println("i: " + i + ", j: " + j + (i + j));
	}
	public static void main(String[] args) {
		constructor cs = new constructor(11, 22);
	}
}

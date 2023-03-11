package constructor;

public class testCon {
	public static void main(String[] args) {
	testConstructor tsConstructor = new testConstructor();
	testConstructor tsConstructor2 = new testConstructor(22, "RESFULL API");
	tsConstructor2.tesConstructor(11, 22);
	System.out.println(tsConstructor2.testConstructor(22, 111));
//	System.out.println(tsConstructor2.number1 + " " + tsConstructor2.str);
//	tsConstructor.PrintRes();
//	tsConstructor.tesConstructor(5, 6);
}
}

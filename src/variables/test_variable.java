package variables;

public class test_variable {
	int a;
	int b;
	public void varName() {
		System.out.println("lap trinh 01");
	}
	public test_variable(int a, int b) {
		this.a = a;
		this.b = b;
		this.varName();
	}
	
	public static void main(String[] args) {
		test_variable ts = new test_variable(11, 22);
		System.out.println("Gia tri mac dinh la: " + ts.a);
		ts.varName();
	}


}

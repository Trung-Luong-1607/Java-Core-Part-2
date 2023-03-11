package overload;

public class test {
	private int y = 1;
	private int x = 2;
	
	
	public test() {
		this.y = y;
		this.x = x;
	}

	public int demSo(int a, int b) {
		return a + b;
	}
	
	public float demSo(float b, float a) {
		return a + b;
	}
	
	public void demSo(int a, float b) {
		System.out.println("Ko co j");
	}
	
	public double demSo(float a, int b, float c) {
		return a + b - c;
	}
	public static void main(String[] args) {
		test ts = new test();
		System.out.println("Ket qua 1 :" + ts.demSo(11, 22));
		System.out.println("Ket qua 1 :" +ts.demSo(1, 2));
		System.out.println("Ket qua 1 :" + ts.demSo(11, 4, 2));
	}
}

package variables;

public class exercise_3 {
public void SayHello() {
	int n;
	n = 5;
	System.out.println("Gia tri bien local la :" + n);
}

// biến instance "ten" kiểu String, có giá trị mặc định là null
public String ten;

// biến instance "tuoi" kiểu Integer, có giá trị mặc định là 0
private int tuoi;

// sử dụng biến ten trong một constructor
public exercise_3(String ten) {
    this.ten = ten;
}

// sử dụng biến tuoi trong phương thức setTuoi
public void setTuoi(int tuoi) {
    this.tuoi = tuoi;
}

public void showStudent() {
    System.out.println("Ten  : " + ten);
    System.out.println("Tuoi : " + tuoi);
}
public static void main(String[] args) {
	exercise_3 ex3 = new exercise_3("Nguyen Van A");
	ex3.SayHello();
	ex3.setTuoi(26);
	ex3.showStudent();
}
}

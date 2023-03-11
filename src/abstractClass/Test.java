package abstractClass;

import java.lang.reflect.Array;
import java.sql.Time;

public class Test extends absreactInterFace implements TimSoLon, ITimKiemnguoi, IKiemVat {
	private String name = "Tran Dai Quang";
	public void name() {
		System.out.println("nGUYEN THI C");
	}
	
	public static void main(String[] args) {
		absreactInterFace ab = new Test();
	    long[] arr = {1,2,3,4};
	   
		ab.TimNguoi();
		ab.TimSo();
		System.out.println(ab.name);
	
		Test ts = new Test();
		ts.name();
		ts.KiemTra();
		ts.KiemNguoi();
		System.out.println(ts.name);
		System.out.println(testABS.abc.class.equals(ab));
	}

	@Override
	protected void TimNguoi() {
		System.out.println("nguoi la");
		
	}

	@Override
	public void KiemTra() {
		System.out.println("Số 1");
		
	}

	@Override
	public void KiemVat() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void KiemNguoi() {
		System.out.println(a);
		
	}

}

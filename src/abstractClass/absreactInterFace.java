package abstractClass;

import java.sql.Time;

public abstract class absreactInterFace implements IKiemVat,ITikiemCon,ITimKiemnguoi {
	public String name = "Tran Trung";
	public void TimSo() {
		System.out.println("So can tim la :" + 111);
	}
	protected abstract void TimNguoi();
	

}

interface TimSoLon {
	public void KiemTra();
}




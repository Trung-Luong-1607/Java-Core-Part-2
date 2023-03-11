package abstractClass;

public interface IKiemVat extends ITimKiemnguoi,ITikiemCon  {
	public void KiemVat();
	public default void KiemThuNhan() {
		System.out.println("Kiem Thu Nhan");
	}
}

package testAbstractClass;

public class toan extends monhoc {
	public static void main(String[] args) {
		toan t1 = new toan();
		t1.InTenMonhoc();
		System.out.println(t1.str);
		monhoc mh = new monhoc() {
			
//			@Override
//			public void monyeuthich() {
//				System.out.println("môn sử");
//				
//			}
		};
//		mh.monyeuthich();
		
	}

	@Override
	public void InTenMonhoc() {
		super.InTenMonhoc();
		System.out.println("Môn Lý");
	}

//	@Override
//	public void monyeuthich() {
//		System.out.println("môn địa");
//		
//	}
}

package testAbsinter;

public class mainprogram {
	public static void main(String[] args) {
		abstractClass tiger = new abstractClass() {
			
			@Override
			public void sound() {
				System.out.println("Grum");
				
			}
		};
		
		tiger.sound();;
		
		abstractClass dog = new abstractClass() {
			
			@Override
			public void sound() {
				System.out.println("Go go");
				
			}
		};
		dog.sound();
	}
}

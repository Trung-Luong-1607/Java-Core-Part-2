package wrapper;

public class Wrapper_Example {
	public static void main(String[] args) {
        // Đổi int thành Integer
        int a = 1120, b= 12;
        Integer i = Integer.valueOf(a);// đổi int thành Integer
        Integer j = a;// autoboxing, tự động đổi int thành Integer trong nội bộ trình biên dịch
 
        System.out.println(a + " " + i + " " + j);
        
        // đổi Integer thành int
        Integer b1 = new Integer(3);
        int c = b1.intValue();// đổi Integer thành int
        int d = b1;// unboxing, tự động đổi Integer thành int trong nội bộ trình biên dịch
 
        System.out.println(b1 + " " + c + " " + d);
        System.out.println(i.reverse(i));
      
}
}

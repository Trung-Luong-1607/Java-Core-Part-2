package nestedClass;

public class Test {
    static int data = 30;
    
    static class Inner {
        static void msg() {
            System.out.println("data is " + data);
        }
    }
 
    public static void main(String args[]) {
    	Test.Inner obj = new Test.Inner();
        obj.msg();
        Test.Inner.msg();
    }
}

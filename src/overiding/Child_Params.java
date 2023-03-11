package overiding;

public class Child_Params extends Parent_params {
	@Override

    void method(String a, String b, int v, float d) {

        System.out.println("child");

    }


    // Còn như thế này sẽ là Overloading, không phải @Overriding

    //We can define a method like this

    void method(String a, String b, int v) {

        System.out.println("child");

    }

    void method2(String a, int b, String v) {

        System.out.println("mon");

    }

    void method3(int v, String a) {

        System.out.println("child");

    }
}

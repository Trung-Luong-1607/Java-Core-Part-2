package overiding;

public class ParentStatic_2 {
    public void method(String string) {

        System.out.println("Parent   :" + string);

    }

    public void method2(String string) {

        System.out.println("Parent   :" + string);

    }
}

class ChildStatic_2 extends ParentStatic_2 {

    public void method(String string) {

        System.out.println("Child  -1 :" + string);

    }

}

class ChildStatic_3 extends ChildStatic_2 {

    public void method(String string) {

        System.out.println("Child -2  :" + string);

    }

}

class ChildStatic_4 extends ChildStatic_3 {

    public void method(String string) {

        System.out.println("Child -3  :" + string);

    }

}


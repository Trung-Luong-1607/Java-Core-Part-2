package overiding;

public class Override_Params {
	public static void main(String[] args) {

        String temp = "Monday";

        Child_Params child_Params = new Child_Params();

        Parent_params params2 = new Parent_params();

//        child_Params = (Child_Params) params2;

        child_Params.method(temp, temp, 2);
        child_Params.method2(temp, temp, 2);

    }
}

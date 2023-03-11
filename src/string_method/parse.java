package string_method;

public class parse {
	public static void main(String[] args) {
		String str = "5000";
		// chuyển đổi string thành int
		int numb1 = Integer.parseInt(str);
		
		// chuyển đổi string thành long
		long numb2 = Long.parseLong(str);
		
		// chuyển đổi string thành float
		float numb3 = Float.parseFloat(str);
		
		// chuyển đổi string thành double
		double numb4 = Double.parseDouble(str);
		
		// chuyển đổi string thành short
		short numb5 = Short.parseShort(str);
		
		// chuyển đổi int thành string
		String str2 = Integer.toString(numb1);
		
		// chuyển đổi long thành string
		String str3 = Long.toString(numb2);
		
		// chuyển đổi float thành string
		String str4 = Float.toString(numb3);
		
		// chuyển đổi double thành string
		String str5 = Short.toString(numb5);
		
		
		System.out.println(numb1);
		System.out.println(numb2);
		System.out.println(numb3);
		System.out.println(numb4);
		System.out.println(numb5);
		
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);
		
	}
}

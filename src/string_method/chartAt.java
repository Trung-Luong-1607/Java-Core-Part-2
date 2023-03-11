package string_method;

import java.io.StringWriter;

public class chartAt {
	public static void main(String[] args) {
		// method này trả về giá trị Char ở vị trí thứ index
		String str = "Hello Java";
		String str2 = "Hello Java";
		String str4 = new String("Hello Java");
		StringBuffer str6 = new StringBuffer( "Hello Java");
		StringBuilder str7 = new StringBuilder( "Java Core");
		String str3 = "Hello java";
		String str5 = ", I'm depops";
		String s1 = "viettuts is a very good website";
		
		
		// method này trả về giá trị Char ở vị trí thứ index
		System.out.println(str.charAt(0) + " " + str.charAt(6));
		
		// method này trả về giá trị unicode ở vị trí thứ index
		System.out.println(str.codePointAt(2));
		
		// method này trả về kết quả so sánh 2 chuỗi 
		System.out.println(str.compareTo(str2));
		System.out.println(str.compareTo(str3));
		System.out.println(str.compareTo(str4));
		
		// method này trả về kết quả so sánh 2 chuỗi bỏ qua kiểu chữ
		System.out.println(str.compareToIgnoreCase(str3));

		// method này thực hiện nối 2 chuỗi lại với nhau
		System.out.println(str.concat(str5));
		System.out.println(str);
		
		// method kiểm tra chuỗi cần tìm có tồn tại ko
		System.out.println(str.contains(str3));
		System.out.println(str.contains(str4));
		
		// Phương thức contentEquals() trong Java trả về true nếu và chỉ nếu
		// String này biểu diễn cùng dãy ký tự như đã xác định trong StringBuffer
		System.out.println(str.contentEquals(str6));
		
		// kiểm tra nếu chuỗi này kết thúc với hậu tố nhất định. 
		// Nó trả về true nếu chuỗi này kết thúc với hậu tố đã cho, nếu khác thì trả về false.
		System.out.println(str.endsWith("va"));
		System.out.println(str.endsWith("av"));
		
		// method này để so sánh chuỗi
		System.out.println(str.equals(str3));
		System.out.println(str.equals(str2));
		
		// method này để so sánh chuỗi
		System.out.println(str.equalsIgnoreCase(str3));
		System.out.println(str.equals(str2));
		
		// method này chuyển đổi chuỗi hash code
		System.out.println(str.hashCode());
		
		// method này trả về vị trí chuỗi muốn tìm kiếm
		System.out.println(str.indexOf("Ja"));
		System.out.println(str.indexOf("Ja", 4));
		
		// Phương thức intern() có thể được sử dụng để trả về chuỗi từ Pool
		// chứa hằng số chuỗi khi nó được tạo bởi từ khóa new.
		System.out.println(str.intern());
		
		// Kiểm tra chuỗi rỗng
		System.out.println(str.isEmpty());
		
		// method này trả về vị trí chuỗi muốn tìm kiếm
		System.out.println(str.lastIndexOf("va"));
		
		// method này trả về độ dài của chuỗi
		System.out.println(str.length());
		
		// method này so sánh chuỗi với regex
		System.out.println(str.matches(str2));
		
		// method này trả về độ dài của chuỗi
//		System.out.println(str.regionMatches(toffset, other, ooffset, len));
		
		// method này thay thế chuỗi
		System.out.println(s1.replace("t", "j"));
		System.out.println(s1.replaceAll("t", "j"));
		System.out.println(s1.replaceFirst("t", "j"));
		System.out.println(s1.toUpperCase());
		System.out.println(s1.substring(0, 2));
		System.out.println(str.valueOf(3.4d) instanceof String);
		System.out.println(str6.reverse());
		System.out.println(str6);
		System.out.println(str7.reverse());
		StringWriter sr = new StringWriter();
		
	}
}

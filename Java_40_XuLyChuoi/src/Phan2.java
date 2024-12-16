
public class Phan2 {
	public static void main(String[] args) {
		String s1 = "tienphat";
		String s2 = "TIENPHAT";
		String s3 = "tienphat";
		
		// Hàm equals => so sánh 2 chuỗi giống nhau, có phân biệt hoa thường
		System.out.println("s1 equals s2: " + s1.equals(s2));
		System.out.println("s1 equals s3: " + s1.equals(s3));
		
		// Hàm equalsIgnoreCase => so sánh 2 chuỗi giống nhau , không phân biệt hoa thường
		System.out.println("s1 equalsIgnoreCase s2: " + s1.equalsIgnoreCase(s2));
		System.out.println("s1 equalsIgnoreCase s3: " + s1.equalsIgnoreCase(s3));
		
		// Hàm compareTo => so sánh trả về 1 trong 3 giá trị : số âm, số dương và 0
		String sv1 = "Nguyễn Văn A";
		String sv2 = "Nguyễn Văn B";
		String sv3 = "Nguyễn Văn";
		String sv4 = "Nguyễn Văn a";
		
		System.out.println("sv1 compareTo sv2: " + sv1.compareTo(sv2)); // giá trị âm sv1 < sv2 ( sv1 đứng trước sv2)
		System.out.println("sv1 compareTo sv3: " + sv1.compareTo(sv3)); // giá trị dương sv1 > sv3 ( sv1 đứng sau sv3)
		System.out.println("sv1 compareTo sv4: " + sv1.compareTo(sv4));
		
		// Hàm compareToIgnoreCase => tương tự như compareTo nhưng không phân biệt chữ hoa chữ thường
		System.out.println("sv1 compareToIgnoreCase sv2: " + sv1.compareToIgnoreCase(sv2)); // giá trị âm sv1 < sv2 ( sv1 đứng trước sv2)
		System.out.println("sv1 compareToIgnoreCase sv3: " + sv1.compareToIgnoreCase(sv3)); // giá trị dương sv1 > sv3 ( sv1 đứng sau sv3)
		System.out.println("sv1 compareToIgnoreCase sv4: " + sv1.compareToIgnoreCase(sv4));
		
		// Hàm regionMatches(vị trí ký tự bắt đầu r1, chuỗi so sánh r2, vị trí ký tự của chuỗi so sánh r2, số ký tự cần so sánh) => so sánh một đoạn
		String r1 = "Tiến Phát";
		String r2 = "phát";
		boolean check = r1.regionMatches(5, r2, 0, 4); // có phân biệt hoa thường
		boolean check1 = r1.regionMatches(true,5, r2, 0, 4); // giá trị true sẽ cho biết có phân biệt hoa thường
		System.out.println(check);
		System.out.println(check1);
		
		// Hàm startWith => kiểm tra chuỗi bắt đầu bằng ....
		String sdt = "0969620321";
		System.out.println(sdt.startsWith("096"));
		System.out.println(sdt.startsWith("097"));
		
		// Hàm endWith => kiểm tra chuỗi kết thúc bằng ....
		String tenFile = "I love you.JPG";
		String tenFile2 = "Hoc Java.PDF";
		if(tenFile.endsWith(".JPG")) {
			System.out.println("File 1 là hình ảnh!");
		} else if (tenFile.endsWith(".PDF")) {
			System.out.println("File 1 là PDF!");
		}
		
		if(tenFile2.endsWith(".JPG")) {
			System.out.println("File 2 là hình ảnh!");
		} else if (tenFile2.endsWith(".PDF")) {
			System.out.println("File 2 là PDF!");
		}
	}
}

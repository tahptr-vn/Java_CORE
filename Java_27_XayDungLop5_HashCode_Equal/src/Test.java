
public class Test {
	public static void main(String[] args) {
		MyDate md1 = new MyDate(15, 5, 2025);
		MyDate md2 = new MyDate(11, 1, 2021);
		MyDate md3 = new MyDate(15, 5, 2025);
		
		//2 cách dùng cách nào cũng được
		System.out.println(md1.toString());
		System.out.println(md2);
		System.out.println(md3);
		
		//Đối với dữ liệu nguyên thủy
//		int a = 5;
//		int b = 6;
//		if(a==b) {
//			System.out.println("a == b");
//		} else {
//			System.out.println("a != b");
//		}
		
		//Đối với dữ liệu đối tượng phải dùng phương thức equals
		//So sánh giữa 2 đối tượng xem giá trị của 2 đối tượng đó có giống nhau hay khác nhau
		System.out.println("md1 so sánh bằng md2: " + md1.equals(md2));
		System.out.println("md1 so sánh bằng md3: " + md1.equals(md3));

		//Tạo ra 1 chuỗi giá trị đã được băm
		System.out.println("Hashcode md1: " + md1.hashCode());
		System.out.println("Hashcode md2: " + md2.hashCode());
		System.out.println("Hashcode md3: " + md3.hashCode());
	}
}

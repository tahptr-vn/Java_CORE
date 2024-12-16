
public class Phan3 {
	public static void main(String[] args) {
		String s1 = "Xin chào cô chú, xin chào các bạn, Xin chào!";
		String s2 = "Xin chào";
		String s3 = "Xin chào 123";
		char c1 = 'ô';
		// Hàm indexOf() => tìm kiếm từ trái sang phải
		System.out.println("Vị trí của s2 trong s1 là: " + s1.indexOf(s2)); // tìm thấy sẽ trả về giá trị >=0
		System.out.println("Vị trí của s3 trong s1 là: " + s1.indexOf(s3)); // không tìm thấy sẽ trả về -1
		
		// Sử dụng vị trí bắt đầu
		System.out.println("Vị trí của s2 trong s1 là: " + s1.indexOf(s2,2));
		
		// Tìm kiếm char
		System.out.println("Vị trí của c1 trong s1 là :" + s1.indexOf(c1));
		System.out.println("Vị trí của c1 trong s1 là :" + s1.indexOf(c1,20));
		
		// Hàm lastIndexOf() => tìm kiếm từ phải sang trái nhưng vị trí vẫn xác định từ trái sang phải
		System.out.println("Vị trí của s2 trong s1 là: " + s1.lastIndexOf(s2));
	}
}

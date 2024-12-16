
public class Phan4 {
	public static void main(String[] args) {
		String s1 = "Tiến";
		String s2 = " Phát";
		
		String s3 = s1 + s2; // nối chuỗi bình thường
		
		// Hàm concat => nối chuỗi bằng hàm
		String s4 = s1.concat(s2);

		System.out.println(s3);
		System.out.println(s4);
		
		// Hàm replace => thay thế 
		String s5 = "Phat.vn";
		String s6 = s5.replaceAll("Phat","Tin");
		System.out.println(s6);
		
		// Hàm toLowerCase => chuyển về viết thường
		// Hàm toUpperCase => chuyển về viết hoa
		String s7 = s3.toLowerCase();
		String s8 = s3.toUpperCase();
		System.out.println(s7);
		System.out.println(s8);
		
		// Hàm trim() => xóa khoảng trắng dư thừa ở đầu và cuối chuỗi
		String s9 = "   Xin chào các ban, mình là TVTP     ";
		System.out.println(s9.trim());
		
		// Hàm substring(vị trí đầu ký tự muốn cắt) => cắt chuỗi con
		String s10 = "Xin chào các ban, mình là TVTP";
		String s11 = s10.substring(10);
		String s12 = s10.substring(10, 15);
		
		System.out.println(s11);
		System.out.println(s12);
	}
}

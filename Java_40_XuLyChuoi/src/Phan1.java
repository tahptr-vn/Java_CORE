import java.util.Scanner;

public class Phan1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		System.out.println("Nhập vào chuỗi: ");
		str = sc.nextLine();
		System.out.println("-----------------");
		
		// Phần 1
		// Hàm length() => lấy ra độ dài của chuỗi
		System.out.println("Độ dài của chuỗi vừa nhập : " + str.length());
		
		// Hàm charAt(vị trí) => lấy ra 1 ký tự tại 1 vị trí
		for (int i = 0; i < str.length(); i++) {
			System.out.println("Vị trí " + i + " là  " +str.charAt(i));
		}
		
		// Hàm getChars(vị trí bắt đầu, vị trí kết thúc, mảng lưu dữ liệu, vị trí bắt đầu lưu của mảng)
		char arrayChar[] = new char[100];
		str.getChars(2, 4, arrayChar, 0);
		for (int i = 0; i < arrayChar.length; i++) {
			System.out.println("Giá trị của mảng tại " + i + " là : " + arrayChar[i]);
		}
		
		// Hàm getBytes => có 3 cách , lấy ra giá trị DEC trong bảng ascii của các ký tự thành 1 mảng
		byte[] arrayBytes = str.getBytes();
		for (byte b : arrayBytes) {
			System.out.println(b);
		}
	}
}

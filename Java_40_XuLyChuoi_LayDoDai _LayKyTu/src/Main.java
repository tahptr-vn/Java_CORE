import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		System.out.println("Nhập vào chuỗi: ");
		str = sc.nextLine();
		System.out.println("-----------------");
		// Hàm length() => lấy ra độ dài của chuỗi
		System.out.println("Độ dài của chuỗi vừa nhập : " + str.length());
	}
}

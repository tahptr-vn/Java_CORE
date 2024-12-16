import java.util.Scanner;

public class CacPhepToanCoBan {
	public static void main(String[] args) {
		// Khai báo biến
		int a,b;
		
		// Nhập dữ liệu từ bàn phím
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào giá trị a:");
		a = sc.nextInt();
		System.out.println("Nhập vào giá trị b:");
		b = sc.nextInt();
		
		int tong = a + b;
		System.out.println(a + " + " + b + " = " + tong);
		
		int hieu = a - b;
		System.out.println(a + " - " + b + " = " + hieu);
		
		float thuong = (float)a / b;
		System.out.println(a + " / " + b + " = " + thuong);
		
		int nhan = a * b;
		System.out.println(a + " * " + b + " = " + nhan);
		
		int soDu = a % b;
		System.out.println(a + " % " + b + " = " + soDu);
	}
}

import java.util.Scanner;

public class ClassMath {
	public static void main(String[] args) {
		double a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào số a :");
		a = sc.nextDouble();
		System.out.println("Nhập vào số b :");
		b = sc.nextDouble();

		// Hàm lấy giá trị tuyệt đối
		System.out.println("|a| = " + Math.abs(a));
		
		// Hàm tìm min giữa a và b
		System.out.println("min(a,b) = " + Math.min(a, b));
		
		// Hàm tìm max giữa a và b
		System.out.println("max(a,b) = " + Math.max(a, b));
		
		// Hàm ceil
		System.out.println("ceil(a) = " + Math.ceil(a)); // làm tròn lên
		
		// Hàm floor
		System.out.println("floor(a) = " + Math.floor(a)); // làm tròn xuống
		
		// Hàm căn bậc hai
		System.out.println("sqrt(a) = " + Math.sqrt(a));
		
		// Hàm tính a mũ b
		System.out.println("pow(a,b) = " + Math.pow(a, b));

		
	}
}

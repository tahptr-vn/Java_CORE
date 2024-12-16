import java.util.Scanner;

public class BaiTapGiaiPhuongTrinhBacNhat {
	public static void main(String[] args) {
		// PTBN: ax+b = 0
		/*
		 * Nếu a = 0
		 * 		Nếu b = 0 => PT vô số nghiệm
		 * 		Nếu b != => PT vô nghiệm
		 * Nếu a!= 0
		 * 		Có nghiệm : x = -b/a
		 */
		
		double a,b,x;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào a :");
		a = sc.nextDouble();
		System.out.println("Nhập vào b :");
		b = sc.nextDouble();
		
		if(a==0) {
			if(b==0) {
				System.out.println("Phương trình vô số nghiệm");
			} else {
				System.out.println("Phương trình vô nghiệm");
			}
		} else {
			x = -b/a;
			System.out.println("Phương trình có nghiệm : " + x);
		}
	}
}

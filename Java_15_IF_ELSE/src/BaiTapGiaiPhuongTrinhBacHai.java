import java.util.Scanner;

public class BaiTapGiaiPhuongTrinhBacHai {
	public static void main(String[] args) {
		//PTBH: ax^2 + bx + c = 0
		/*
		 * Nếu a == 0 thì báo lỗi
		 * B1. Tính delta = b^2 - 4ac
		 * B2. Kiểm tra delta
		 *	 	delta < 0 => Phương trình vô nghiệm
		 * 		delta == = => Phương trình có nghiêm kép x1 = x2 = -b/2a
		 * 		delta > 0 => Phương trình có 2 nghiệm
		 * 			x1 = (-b - sqrt(delta)) / (2a)
		 * 			x2 = (-b + sqrt(delta)) / (2a)
		 */
		
		double a,b,c,x1,x2,delta;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào a :");
		a = sc.nextDouble();
		System.out.println("Nhập vào b :");
		b = sc.nextDouble();
		System.out.println("Nhập vào c :");
		c = sc.nextDouble();
		
		if(a==0) {
			System.out.println("Nhập dữ liệu sai");
		} else {
			// Tính delta = b^2 - 4ac
			delta = Math.pow(b,2) - 4*a*c;
			if(delta < 0) {
				System.out.println("Phương trình vô nghiệm");
			} else if(delta == 0) {
				x1 = -b/2*a;
				System.out.println("Phương trình có nghiệm kép x1 = x2 = -b/2a =" + x1);
			} else {
				x1 = (-b - Math.sqrt(delta)) / (2*a);
				x2 = (-b + Math.sqrt(delta)) / (2*a);
				System.out.println("Phương trình có nghiệm :");
				System.out.println("x1 = " + Math.round(x1*100.0)/100.0);
				System.out.println("x2 = " + Math.round(x2*100.0)/100.0);
			}
		}
		
	}
}

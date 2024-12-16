import java.util.Scanner;

public class BaiTap {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double r, dienTich, chuVi;
		System.out.println("Nhập vào bán kính r: ");
		r = sc.nextDouble();
		
		dienTich = Math.PI * Math.pow(r,2);
		System.out.println("Diện tích hình tròn = " + dienTich);
		System.out.println("Diện tích hình tròn = " + Math.round(dienTich));
		System.out.println("Diện tích hình tròn = " + Math.round(dienTich * 100.0)/100.0); // lấy 2 chữ số sau dấu phẩy
		
		chuVi = 2*Math.PI*r;
		System.out.println("Chu vi hình tròn = " + chuVi);
		System.out.println("Chu vi hình tròn = " + Math.round(chuVi));
		System.out.println("Chu vi hình tròn = " + Math.round(chuVi* 100.0)/100.0);// lấy 2 chữ số sau dấu phẩy
		
	}
}

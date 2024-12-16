import java.util.Scanner;

public class LoopWhile {
	public static void main(String[] args) {
		/*
		 * Sử dụng khi không biết khi nào sẽ xảy ra tình huống dừng lại
		 * Syntax:
		 * while(Condition) {
		 *    Statement(s)
		 * }
		 * 
		 * để dừng vòng lặp : 
		 * - thay đổi một biến trong vòng lặp thỏa điều kiện dừng
		 * - thay đổi giá trị expression trong vòng lặp thỏa điều kiện dừng 
		 * - dùng break để kết thúc vòng lặp
		 */
		Scanner sc = new Scanner(System.in);
		int n = 1;

		while (n != 0) {
			System.out.println("Nhập vào 0 để thoát , nhập ký tự khác sẽ tiếp tục");
			n = sc.nextInt();
		}

	}
}
